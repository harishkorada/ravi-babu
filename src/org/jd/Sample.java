package org.jd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
  
public class Sample {
	public static void main(String[] args) throws  SQLException, ClassNotFoundException{

			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1521:Xe","hr","8985813898");
		String query= "select * from employees";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet executeQuery = preparedStatement.executeQuery();
		while (executeQuery.next()) {
			int int1 = executeQuery.getInt("Department_id");
			System.out.println(int1);
			 String string = executeQuery.getString("first_name");
			 System.out.println(string);
			
		}
		connection.close();
		
		
	}

}
