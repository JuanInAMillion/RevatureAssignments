package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	public Player getPlayerByPosition(String position) throws BusinessException;
	public List<Player> getPlayersByTeamid(int teamid) throws BusinessException;
}
