package com.app.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {
	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		if(id > 0) {
			player=playerSearchDAO.getPlayerById(id);
		} else {
			throw new BusinessException("Entered player Id " +id+ " is INVALID....");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> allPlayersList=null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> agePlayersList=null;
		if(age > 0) {
			agePlayersList=playerSearchDAO.getPlayersByAge(age);
		} else {
			throw new BusinessException("Entered player age " +age+ " is INVALID....");
		}
		return agePlayersList;
	}

	@Override
	public List<Player> getPlayersByPosition(String position) throws BusinessException {
		List<Player> positionPlayersList=null;
		if(position!=null && position.matches("[a-zA-Z]{1,2}")) {
			positionPlayersList=playerSearchDAO.getPlayersByPosition(position);
		} else {
			throw new BusinessException("Entered player position " +position+ " is is INVALID");
		}
		return positionPlayersList;
	}

	@Override
	public List<Player> getPlayersByTeamid(int teamid) throws BusinessException {
		List<Player> teamidPlayersList=null;
		if(teamid > 0) {
			teamidPlayersList=playerSearchDAO.getPlayersByTeamid(teamid);
		} else {
			throw new BusinessException("Entered team id " +teamid+ " is INVALID....");
		}
		return teamidPlayersList;
	}

	@Override
	public List<Player> getPlayersByFirstname(String firstname) throws BusinessException {
		List<Player> firstNamePlayersList=null;
		if(firstname!=null && firstname.matches("[a-zA-Z]{2,20}")) {
			firstNamePlayersList=playerSearchDAO.getPlayersByFirstname(firstname);
		} else {
			throw new BusinessException("Entered first name " +firstname+ " is is INVALID");
		}
		return firstNamePlayersList;
	}

	@Override
	public List<Player> getPlayersByLastname(String lastname) throws BusinessException {
		List<Player> lastNamePlayersList=null;
		if(lastname!=null && lastname.matches("[a-zA-Z]{2,20}")) {
			lastNamePlayersList=playerSearchDAO.getPlayersByLastname(lastname);
		} else {
			throw new BusinessException("Entered last name " +lastname+ " is is INVALID");
		}
		return lastNamePlayersList;
	}

}
