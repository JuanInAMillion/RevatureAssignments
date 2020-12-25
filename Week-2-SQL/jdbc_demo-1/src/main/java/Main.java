import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
			//Step 1 - Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			//Step 2 - Open Connection(url,username,password)
			String url="jdbc:postgresql://localhost:5432/postgres";
			String username="postgres";
			String password="@Advent123";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="select p.player_id, p.first_name, p.last_name, p.position, t.team_name, t.stadium_name from player p join team t on p.team_id = t.team_id";
			//Step 4 - Execute Query
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed");
			//Step 5 - Process Results
			while(resultSet.next()) {
				System.out.print("Id : "+resultSet.getInt("player_id"));
				System.out.print("  First Name  : "+resultSet.getString("first_name"));
				System.out.print("  Last Nmae  : "+resultSet.getString("last_name"));
				System.out.print("  Position  : "+resultSet.getString("position"));
				System.out.print("  Team Name  : "+resultSet.getString("team_name"));
				System.out.print("  Stadium Nmae  : "+resultSet.getString("stadium_name"));
				System.out.println(""); //line spacing
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step 6 - CLose Connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
