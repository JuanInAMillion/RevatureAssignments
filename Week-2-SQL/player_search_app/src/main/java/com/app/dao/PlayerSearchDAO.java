package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersByPosition(String position) throws BusinessException;
	public List<Player> getPlayersByTeamid(int teamid) throws BusinessException;
	public List<Player> getPlayersByFirstname(String firstname) throws BusinessException;
	public List<Player> getPlayersByLastname(String lastname) throws BusinessException;
}
