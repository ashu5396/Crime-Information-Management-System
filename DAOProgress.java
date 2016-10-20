package com.demo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOProgress {
	boolean flag_status=false;

	public static Connection getOracleConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","scott","tiger");

		return con;
	}

	public static Connection getMySQLConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","user123");

		return con;
	}
	

	public boolean insertProgress(ProgressData ob)
	{
	
	flag_status=false;
	
	try {
		Connection con=getMySQLConnection();
	PreparedStatement pst=con.prepareStatement("insert into progress values (?,?,?,?,?)");
		
		pst.setString(1, ob.getCase_id());
		pst.setString(2, ob.getCri_id());
		pst.setString(3, ob.getDate());
		pst.setString(4, ob.getComment());
		pst.setString(5, ob.getStatus());
		
		
		int cnt=pst.executeUpdate();
		
		if (cnt>0) flag_status=true;
	} catch(Exception e) {
		System.out.println("DAO EXCEPTION has occurred..."+e);
	}
	
	return flag_status;
}
	
	public boolean updateProgress(String ca_id,String cmt,String sts) {
		flag_status=false;
		
		try {
			Connection con=getMySQLConnection();
		PreparedStatement pst=con.prepareStatement("update progress set comment=?,status =? where case_id=?");
			
			pst.setString(1,cmt);
			pst.setString(2,sts);
			pst.setString(3,ca_id);
			
			int cnt=pst.executeUpdate();
			
			if (cnt>0) flag_status=true;
		} catch(Exception e) {
			System.out.println("DAO EXCEPTION has occurred..."+e);
		}
		
		return flag_status;
	}	
	
	public List <ProgressData> DisplayProgress() {
		List <ProgressData> list=new ArrayList<ProgressData>();
		try {
			Connection con=getMySQLConnection();
			PreparedStatement pst=con.prepareStatement("select * from progress");
			ResultSet rs=pst.executeQuery();
			
			ProgressData ob;
			
			while(rs.next()) {
				ob=new ProgressData();
				ob.setCase_id(rs.getString(1));
				ob.setCri_id(rs.getString(2));
				ob.setDate(rs.getString(3));
				ob.setComment(rs.getString(4));
				ob.setStatus(rs.getString(5));
				
				
				list.add(ob);
			}
		} catch(Exception e) {
			System.out.println("DAO EXCEPTION has occurred..."+e);
		}
		
		return list;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
