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

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

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

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "select id, firstname, lastname, age, position, teamid from public.player where age=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			preparedStatement.setInt(1,age);
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
				throw new BusinessException("No Player found in the DB with age " + age);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}		
		return playersList  ;
	}

	@Override
	public List<Player> getPlayersByPosition(String position) throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "select id, firstname, lastname, age, position, teamid from public.player where position=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			preparedStatement.setString(1,position);
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
				throw new BusinessException("No Player found in the DB with the position " + position);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}		
		return playersList;
	}

	@Override
	public List<Player> getPlayersByTeamid(int teamid) throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "select id, firstname, lastname, age, position, teamid from public.player where teamid=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			preparedStatement.setInt(1,teamid);
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
				throw new BusinessException("No Player found in the DB with team id " + teamid);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}		
		return playersList  ;
	}

	@Override
	public List<Player> getPlayersByFirstname(String firstname) throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "select id, firstname, lastname, age, position, teamid from public.player where firstname=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			preparedStatement.setString(1,firstname);
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
				throw new BusinessException("No Player found in the DB with the first name " + firstname);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}		
		return playersList;
	}

	@Override
	public List<Player> getPlayersByLastname(String lastname) throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try (Connection connection = PostresqlConnection.getConnection()) {
			String sql = "select id, firstname, lastname, age, position, teamid from public.player where lastname=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			preparedStatement.setString(1,lastname);
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
				throw new BusinessException("No Player found in the DB with the last name " + lastname);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN ");
		}		
		return playersList;
	}

}
