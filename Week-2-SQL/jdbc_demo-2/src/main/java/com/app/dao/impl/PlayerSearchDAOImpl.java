package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{

	@Override
	public Player getPlayerByLastname(String lastname) throws BusinessException {
		Player player = null;	
		try(Connection connection = PostresqlConnection.getConnection()){
			String sql = "select id, firstname, lastname, age, position, teamid from public.player where lastname =?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,lastname);			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player(); 
				player.setId(resultSet.getInt("id"));
				player.setFirstname(resultSet.getString("firstname"));
				player.setLastname(resultSet.getString("lastname"));
				player.setAge(resultSet.getInt("age"));
				player.setPosition(resultSet.getString("position"));
				player.setTeamid(resultSet.getInt("teamid"));
				
			}else {
				throw new BusinessException("No Player found with contact "+ lastname);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByTeamid(int teamid) throws BusinessException {
		List<Player> playerList = new ArrayList<Player>();
		try(Connection connection = PostresqlConnection.getConnection()){	
			String sql = "select id, firstname, lastname, age, position, teamid from public.player where teamid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teamid);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player(
						resultSet.getInt("id"),
						resultSet.getString("firstname"), 
						resultSet.getString("lastname"), 
						resultSet.getInt("age"), 
						resultSet.getString("position"),
						teamid
						); 
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No players in the DB so far");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}	
		return playerList;
	}

}
