<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.sql.*" %>
<% ResultSet resultset=null; %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="crime2.png">
<form action="ControllerUpdate" method="get">
<center><h1>Update Criminal Record</h1></center>

<%
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","user123");
		Statement statement =con.createStatement();
		resultset=statement.executeQuery("select cri_id from criminal");
		%>
	 
	<center><table border="3" bgcolor="pink"><h1>Select Criminal ID</h1>
	<select>
	
	<%while(resultset.next()){ %>
	<option><%=resultset.getString(1) %></option>
	<%} %>
	</select>
	<%
	//**Should I input the cri_id here?
	}
	catch(Exception e)
	{
		out.println("Wrong entry"+e);
	}
	
	
	
	
	
	%>
	 
	
    <tr>
   
    
			
			  <td><br><br> Name :</td>
			  <td><br><br>&nbsp;&nbsp;
			<input type="text" name="name" length="50" maxlength="111" >
			</td>
			</tr>
		<tr>
			<td>
			<br><br>Address :
			</td>
			<td><br><br>&nbsp;&nbsp;
			<input type="text" name="address" length="50" maxlengh="100">
			</td>
			</tr>
		<tr>
			<td>
			<br><br>Identifying mark in the face :
			</td>
			<td><br><br>&nbsp;&nbsp;
			<input type="text" name="mark" length="20" maxlength="50">
			</td>
			</tr>
		
        	<br><br><br>
            	<td><center><input type="submit" name="submit1" value="Submit">
  <input type="reset" name="reset1" value="Reset"></center></td></tr>
        	
            	
			
			</table></center>
			
	  

</form>
</body>
</html>