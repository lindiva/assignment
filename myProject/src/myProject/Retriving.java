package myProject;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Retriving {

	public static void main(String[] args) {
		Retriving rt = new Retriving();
		rt.createConnection();
	}

	
	void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			Statement stmt = con.createStatement();
			Results rs = stmt.execute("SELECT * FROM USERS");
			String name = rs.getString("name");
			
		}
	}catch()
	
}
