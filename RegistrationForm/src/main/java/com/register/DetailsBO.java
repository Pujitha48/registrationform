package com.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.register.Details;

public class DetailsBO {
		static final String url= "jdbc:mysql://localhost:3306/pujithasadhu";
		static final String username="root";
		static final String password="root";
		static final String Insert_Query="insert into `registrations`"+
			 							"(`fname`, `lname` ,`email`,`country` ,`password`)"
			 							+ "values(?,?,?,?,?)";
		private Connection connection;
		private PreparedStatement statement;		 
		public DetailsBO(){
			try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					connection = DriverManager.getConnection(url, username, password);

				  }
			catch(ClassNotFoundException | SQLException e){
					 e.printStackTrace(); 
				  }
					 
		}
		int i;
		public int save(Details d){
			try {
					statement =connection.prepareStatement(Insert_Query);
					statement.setString(1,d.getFname());
					statement.setString(2,d.getLname());
					statement.setString(3,d.getEmail());
					statement.setString(4,d.getCountry());
					statement.setString(5, d.getPassword());
					i=statement.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 
			return i;

			 }

}

