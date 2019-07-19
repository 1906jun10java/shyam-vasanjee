package com.revature.project1.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static ConnectionFactory cf = new ConnectionFactory();
	
	private ConnectionFactory() {
		super();
	}
	
	public static synchronized ConnectionFactory getInstance() {
		if(cf == null) {
			cf = new ConnectionFactory();
		}
		return cf;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		Properties prop =  new Properties();
		try {
			InputStream stream = this.getClass().getResourceAsStream("/database.properties");
			prop.load(stream);
			
			Class.forName(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println("Getting property URL");
			conn = DriverManager.getConnection(
					prop.getProperty("url"),
					prop.getProperty("usr"),
					prop.getProperty("password"));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}
