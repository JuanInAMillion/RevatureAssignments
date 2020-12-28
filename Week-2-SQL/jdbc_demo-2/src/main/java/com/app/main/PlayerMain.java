package com.app.main;

import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {
	public static void main(String[] args) {
		
		PlayerCrudDAO dao = new PlayerCrudDAOImpl();
		
//Every statement has been commented out individually, the searchdao task are under the crudao task		
/*
		//insert a player into the table	
		Player p = new Player(14, "Randy", "Johnson", 57, "RP", 100);
		try {
			if(dao.createPlayer(p)!=0) {
				System.out.println("Player created successfully");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
 */
		
/*
		//delete a player by their id
		try {
			dao.deletePlayer(14);
			System.out.println("Player deleted successfully");
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
*/
		
/*		
		//update a players Position
		try {
			dao.updatePlayerPosition(8, "SP");
			System.out.println("Player's position updated");
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
*/
		
/* 		
  		//get a player by their id
		try {
			Player player = dao.getPlayerById(5);
			if(player !=null) {
				System.out.println("Details of player with id " + player.getId());
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
*/
		
/*		
  		// get all players from the list	
		try {
			List<Player> playerList = dao.getAllPlayers();
			if(playerList!=null && playerList.size()!=0) {
				System.out.println("\n\nFound " + playerList.size() + " no of players in DB.... Printing them all");
				for(Player p: playerList) {
					System.out.println(p);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
*/		
		
		PlayerSearchDAO searchdao = new PlayerSearchDAOImpl();
		
		//search by lastname
		String lastname = "Posada";	
		try {
			Player playerByLastname = searchdao.getPlayerByLastname(lastname);
			System.out.println("Player with the lastname "+lastname+" was found.");
			System.out.println(playerByLastname.toString());
			if (playerByLastname!=null) {
				System.out.println("");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

/*		
 		//list all players by teamid
 		int teamid = 300;	
		try {
			List<Player> teamList = searchdao.getPlayersByTeamid(teamid);
			System.out.println(teamList.size()+" players were found from team "+teamid);
			for(Player p:teamList) {
				System.out.println(p.toString());
			}			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
*/		
	}	
}
