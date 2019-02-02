package com.user;
import java.sql.*;

public class Db_Connection {

	int userLen = 0;

	
	public User[] conman() {
		// TODO Auto-generated method stub
		User[] u = new User[100];
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","APP_TEST","test_123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from APP_USER");  
			int i =0;
			while(rs.next() && i< 100) 
				{  
					User ant =new User() ;
					ant.setUser_key(rs.getInt("USER_KY"));
					ant.setUser_ID(rs.getString("USER_ID"));
					ant.setFirst_Name(rs.getString("FRST_NM"));
					ant.setLast_name(rs.getString("LST_NM"));
					ant.setFull_name(rs.getString("FULL_NM"));
					ant.setEmail_Address(rs.getString("EMAIL"));
					u[i] = ant;
					userLen++;
					i++;
				}
								
			con.close(); 
		}
		catch(Exception e)
			{
			System.out.println(e);
			}

		return u;

	}

}
