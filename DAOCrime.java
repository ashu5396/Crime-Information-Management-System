package com.demo.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class DAOCrime {
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
	

	public boolean insertCriminal(CrimeData ob)
	{
	
	flag_status=false;
	
	try {
		Connection con=getMySQLConnection();
		PreparedStatement pst=con.prepareStatement("insert into criminal values (?,?,?,?,?,?,?,?)");
		
		pst.setString(1, ob.getCri_id());
		pst.setString(2, ob.getName());
		pst.setString(3, ob.getSex());
		pst.setString(4, ob.getAge());
		pst.setString(5, ob.getAddress());
		pst.setString(6, ob.getMark());
		pst.setString(7, ob.getCrime_area());
		pst.setString(8, ob.getCrime_attached());
		
		
		int cnt=pst.executeUpdate();
		
		if (cnt>0) flag_status=true;
	} catch(Exception e) {
		System.out.println("DAO EXCEPTION has occurred..."+e);
	}
	
	return flag_status;
}
	public boolean updateCriminal(String cr_id,String nm,String add,String mk) {
		flag_status=false;
		
		try {
			Connection con=getMySQLConnection();
			PreparedStatement pst=con.prepareStatement("update criminal set name=?,address=?,mark=? where cri_id=?");
			
			pst.setString(1,nm);
			pst.setString(2,add);
			pst.setString(3,mk);
			pst.setString(4,cr_id);
			int cnt=pst.executeUpdate();
			
			if (cnt>0) flag_status=true;
		} catch(Exception e) {
			System.out.println("DAO EXCEPTION has occurred..."+e);
		}
		
		return flag_status;
	}	
	
	
	public List <CrimeData> DisplayCriminal() {
		List <CrimeData> list=new ArrayList<CrimeData>();
		try {
			Connection con=getMySQLConnection();
			PreparedStatement pst=con.prepareStatement("select * from criminal");
			ResultSet rs=pst.executeQuery();
			
			CrimeData ob;
			
			while(rs.next()) {
				ob=new CrimeData();
				ob.setCri_id(rs.getString(1));
				ob.setName(rs.getString(2));
				ob.setSex(rs.getString(3));
				ob.setAge(rs.getString(4));
				ob.setAddress(rs.getString(5));
				ob.setMark(rs.getString(6));
				ob.setCrime_area(rs.getString(7));
				ob.setCrime_attached(rs.getString(8));
				
				
				list.add(ob);
			}
		} catch(Exception e) {
			System.out.println("DAO EXCEPTION has occurred..."+e);
		}
		
		return list;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
