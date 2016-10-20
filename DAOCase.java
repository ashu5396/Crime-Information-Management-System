package com.demo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOCase {

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
	
	
	public boolean insertCase(CaseData ob)
	{
	
	flag_status=false;
	
	try {
		Connection con=getMySQLConnection();
		PreparedStatement pst=con.prepareStatement("insert into crimerec values (?,?,?,?,?,?,?,?)");
		
		pst.setString(1, ob.getCase_id());
		pst.setString(2, ob.getDate());
		pst.setString(3, ob.getPlace());
		pst.setString(4, ob.getDes_crime());
		pst.setString(5, ob.getVictims());
		pst.setString(6, ob.getDetailed_description());
		pst.setString(7, ob.getSuspect());
		pst.setString(8, ob.getP_station());
		
		
		int cnt=pst.executeUpdate();
		
		if (cnt>0) flag_status=true;
	} catch(Exception e) {
		System.out.println("DAO EXCEPTION has occurred..."+e);
	}
	
	return flag_status;
}
	public boolean updateCase(String dt,String pl,String d_c,String vct,String sst,String ps,String c_id) {
		flag_status=false;
		
		try {
			Connection con=getMySQLConnection();
			PreparedStatement pst=con.prepareStatement("update crimerec set date=?,place=?,des_crime=?,victims=?,suspect=?,p_station=? where case_id=?");
			
			
			pst.setString(1,dt);
			pst.setString(2,pl);
			pst.setString(3,d_c);
			pst.setString(4,vct);
			
			pst.setString(5,sst);
			pst.setString(6,ps);
			pst.setString(7,c_id);
			
			int cnt=pst.executeUpdate();
			
			if (cnt>0) flag_status=true;
		} catch(Exception e) {
			System.out.println("DAO EXCEPTION has occurred..."+e);
		}
		
		return flag_status;
	}	
	
	public List <CaseData> DisplayCase() {
		List <CaseData> list=new ArrayList<CaseData>();
		try {
			Connection con=getMySQLConnection();
			PreparedStatement pst=con.prepareStatement("select * from crimerec");
			ResultSet rs=pst.executeQuery();
			
			CaseData ob;
			
			while(rs.next()) {
				ob=new CaseData();
				ob.setCase_id(rs.getString(1));
				ob.setDate(rs.getString(2));
				ob.setPlace(rs.getString(3));
				ob.setDes_crime(rs.getString(4));	
				ob.setVictims(rs.getString(5));
				ob.setDetailed_description(rs.getString(6));
				ob.setSuspect(rs.getString(7));
				ob.setP_station(rs.getString(8));
				
				
				list.add(ob);
			}
		} catch(Exception e) {
			System.out.println("DAO EXCEPTION has occurred..."+e);
		}
		
		return list;	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
