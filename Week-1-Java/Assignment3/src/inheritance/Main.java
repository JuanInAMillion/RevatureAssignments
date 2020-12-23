package inheritance;

public class Main {

	public static void main(String[] args) {
	
		Address permenant1=new Address(4,"Broadway", "New York", 10023); // added permanent address
		Address present1=new Address(4,"Times Square", "New York", 10023);// added present address
		Project p1=new Project(9000, "Abc Corp", "Abc Corp Some Client");
		Employee e1=new  Employee(100, "Sachin", "Manager", 23333.44,p1,permenant1, present1);
		System.out.println("e1");
		System.out.println(e1);
		
		Address permenant2=new Address(80,"Creston", "The Bronx", 10468); // added permanent address
		Address present2=new Address(4,"Wall Stree", "New York", 10005);// added present address
		Employee e2=new Employee(101, "Richard", "Associate", 2000.33,p1,permenant2, present2);
		System.out.println("e2");
		System.out.println(e2);
		
		Address permenant3=new Address(8,"Whitehall", "New York", 10004); // added permanent address
		Address present3=new Address(4,"Targee", "Staten Island", 10304);// added present address
		Project p2=new Project(9001, "SMS", "Revature");
		Employee e3=new Employee(102, "Tushar", "Manager", 33000.33, p2,permenant3, present3);
		System.out.println("e3");
		System.out.println(e3);
		
		Address stadium1=new Address(1,"161st", "New York", 10451); // added tadium address
		Team team1=new Team(5, "New York Yankees", "Aaron Boone",stadium1);	//added team
		Player player1=new Player(99, "Aaron judge", 9.0, team1); //Player
		System.out.println("player1");
		System.out.println(player1);
		
		Address stadium2=new Address(41,"Seaver Way", "Queens", 11368); // added stadium address
		Team team2=new Team(1, "New York Yankees", "Luis Rojas", stadium2); // added team
		Player player2=new Player(24, "Robinson Cano",10.0,team2); // added player
		System.out.println("player2");
		System.out.println(player2);
		

	}

} //Complete Address, Player and Team
