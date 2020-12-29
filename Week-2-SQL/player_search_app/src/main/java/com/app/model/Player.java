package com.app.model;

public class Player {
	private int id;
	private String firstname;
	private String lastname;
	private String position;
	private int age;
	private int teamid;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String firstname, String lastname, int age, String position, int teamid) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.position = position;
		this.teamid = teamid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", age=" + age + ", position=" + position + ", teamid=" + teamid + "]";
	}
	
	
}
