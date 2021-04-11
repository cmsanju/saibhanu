package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) throws Exception
	{
		
		//step 1 : load the driver class
		Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
		
		//step 2 : create the connection object  "jdbc:oracle:thin:@localhost:1521:xe", "system", "Java"
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "password");
		
		//step 3 : create statement object
		Statement stmt = con.createStatement();
		
		//step 4 : execute the query
		//stmt.execute("create table mpl(id int, name varchar(150), city varchar(150))");
		stmt.execute("insert into mpl values(103,'jeevan','pileru')");
		
		String sql = "select * from mpl";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsm = rs.getMetaData();
		
		System.out.println(rsm.getColumnCount());
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
		}
		
		
		//step 5 : close the connection
		con.close();
		
		//System.out.println("Done");
		
	}

}
