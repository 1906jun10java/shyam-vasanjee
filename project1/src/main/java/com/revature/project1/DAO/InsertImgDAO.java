package com.revature.project1.DAO;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.project1.util.ConnectionFactory;

public class InsertImgDAO {
	
	public static ConnectionFactory cf = ConnectionFactory.getInstance();
	
	public void insertImg() throws SQLException{
		Connection conn =  cf.getConnection();
		String sql =" { INSERT INTO IMGTABLE VALUES(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, name);
		
		FileInputStream file = new FileInputStream("filename");
		ps.setBinaryStream(2, file, file.available());
		
	}
	
	public void retrieveImg() throws SQLException{
		
	}
	

}
