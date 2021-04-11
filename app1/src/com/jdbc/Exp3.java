package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp3 {
	
	public static void main(String[] args) throws Exception
	{
		
		//step 1 : load the driver class
		Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
				
		//step 2 : create the connection object  "jdbc:oracle:thin:@localhost:1521:xe", "system", "Java"
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "password");
				
		//step 3 : create statement object
		Statement stmt = con.createStatement();
		
		stmt.addBatch("insert into mpl values(1,'don','vizag')");
		stmt.addBatch("insert into mpl values(2,'developer','tpt')");
		stmt.addBatch("insert into mpl values(3,'software','jira')");
		
		stmt.executeBatch();
		
		System.out.println("Done.");
		
	}

}
