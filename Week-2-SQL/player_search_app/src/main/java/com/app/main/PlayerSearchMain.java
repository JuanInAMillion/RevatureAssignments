package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to PlayerSearch App V1.0");
		System.out.println("-----------------------------------------");
		int ch=0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("PLAYER SEARCH MENU");
			System.out.println("=============================");
			System.out.println("1)By Id");
			System.out.println("2)By Age");
			System.out.println("3)By Position");
			System.out.println("4)By Team Id");
			System.out.println("5)By First Name");
			System.out.println("6)By Last Name");
			System.out.println("7)Show All Players");
			System.out.println("8)EXIT");
			System.out.println("Please enter appropriate choice between 1-8");
			try {
			ch=Integer.parseInt(scanner.nextLine());
			}catch(NumberFormatException e) {}
			
				switch(ch) {
				case 1:
					System.out.println("Enter Player Id to get Player Details...");
					try {
						int id = Integer.parseInt(scanner.nextLine());
						Player player = playerSearchService.getPlayerById(id);
						if(player!=null) {
							System.out.println("Player found with id : " +id+" details of the player is : " );
							System.out.println(player);
						}
					} catch (NumberFormatException e) {
						System.out.println("Player Id connot be special characters or symbols or white spaces it is numeric");
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 2:
					try {
						System.out.println("Enter Player Age to get all the players matching with that age");
						int age=Integer.parseInt(scanner.nextLine());
						List<Player> agePlayersList=playerSearchService.getPlayersByAge(age);
						if(agePlayersList!=null && agePlayersList.size() > 0) {
							System.out.println("There are " + agePlayersList.size()+ " players.. with age =" +age+ " Printing detals");
							for(Player p:agePlayersList) {
								System.out.println(p);
							}
						}
					}catch(NumberFormatException e){ 
						System.out.println("Age cannot have special chars or spaces or alphabets");
					}
					catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 3:
					System.out.println("Enter players position to get every player that plays in that position");
					String position=scanner.nextLine();
					try {
						List<Player> positionPlayersList=playerSearchService.getPlayersByPosition(position);
						if(positionPlayersList!=null && positionPlayersList.size() > 0) {
							System.out.println("There are " + positionPlayersList.size()+ " players.. that play position=" +position+ " Printing detals");
							for(Player p:positionPlayersList) {
								System.out.println(p);
							}
						}
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
	
				case 4:
					try {
						System.out.println("Enter Team id to get all the players that are in the same team");
						int teamid=Integer.parseInt(scanner.nextLine());
						List<Player> teamidPlayersList=playerSearchService.getPlayersByTeamid(teamid);
						if(teamidPlayersList!=null && teamidPlayersList.size() > 0) {
							System.out.println("There are " + teamidPlayersList.size()+ " players in team=" +teamid+ " Printing detals");
							for(Player p:teamidPlayersList) {
								System.out.println(p);
							}
						}
					}catch(NumberFormatException e){ 
						System.out.println("Team id cannot have special chars or spaces or alphabets");
					}
					catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
	
				case 5:
					System.out.println("Enter players First Name to get every player with that name");
					String firstname=scanner.nextLine();
					try {
						List<Player> firstNamePlayersList=playerSearchService.getPlayersByFirstname(firstname);
						if(firstNamePlayersList!=null && firstNamePlayersList.size() > 0) {
							System.out.println("There are " + firstNamePlayersList.size()+ " players.. with first name =" +firstname+ " Printing detals");
							for(Player p:firstNamePlayersList) {
								System.out.println(p);
							}
						}
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
	
				case 6:
					System.out.println("Enter players Last Name to get every player with that name");
					String lastname=scanner.nextLine();
					try {
						List<Player> lastNamePlayersList=playerSearchService.getPlayersByLastname(lastname);
						if(lastNamePlayersList!=null && lastNamePlayersList.size() > 0) {
							System.out.println("There are " + lastNamePlayersList.size()+ " players.. with last name =" +lastname+ " Printing detals");
							for(Player p:lastNamePlayersList) {
								System.out.println(p);
							}
						}
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 7:
					System.out.println("Retrieving all the players from backend");
					try {
						List<Player> allPlayersList=playerSearchService.getAllPlayers();
						if(allPlayersList!=null && allPlayersList.size() > 0) {
							System.out.println("There are " + allPlayersList.size()+ " players.. Printing their details....");
							for(Player p:allPlayersList) {
								System.out.println(p);
							}
						}
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 8:
					System.out.println("Thank you for using our PlayerSearch App V1.0");
					break;
					
				default:
					System.out.println("Invalid menu option... Try again.....!");
					break;
				}		
		}while(ch!=8);
	}

}
