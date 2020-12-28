package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDAO{

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
		try(Connection connection = PostresqlConnection.getConnection()) {
			String sql="insert into public.player(id, firstname, lastname, age, position, teamid) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);			
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getFirstname());
			preparedStatement.setString(3, player.getLastname());
			preparedStatement.setInt(4, player.getAge());
			preparedStatement.setString(5, player.getPosition());
			preparedStatement.setInt(6, player.getTeamid());		
			c=preparedStatement.executeUpdate();		
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return c;
	}

	@Override
	public void deletePlayer(int id) throws BusinessException{
		//Task
		int d = 0;
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "delete from public.player where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			d = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}	
	}

	@Override
	public int updatePlayerPosition(int id, String newPosition) throws BusinessException {
		//Task
		int u = 0;
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "update public.player set position=? where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, newPosition);
			preparedStatement.setInt(2, id);
			u = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return u;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "select firstname, lastname, age, position, teamid from public.player where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setFirstname(resultSet.getString("firstname"));
				player.setLastname(resultSet.getString("lastname"));
				player.setAge(resultSet.getInt("age"));
				player.setPosition(resultSet.getString("position"));
				player.setTeamid(resultSet.getInt("teamid"));		
			}else {
				throw new BusinessException("No Player found with Id " + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}		
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "select id, firstname, lastname, age, position, teamid from public.player";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setFirstname(resultSet.getString("firstname"));
				player.setLastname(resultSet.getString("lastname"));
				player.setAge(resultSet.getInt("age"));
				player.setPosition(resultSet.getString("position"));
				player.setTeamid(resultSet.getInt("teamid"));
				playersList.add(player);
			} 
			if(playersList.size() == 0)
			{
				throw new BusinessException("No Player in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}		
		return playersList  ;
	}

}
