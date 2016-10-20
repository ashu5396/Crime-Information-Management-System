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
<form action="ControllerCaseUpdate" method="get">
<center><h1>Update Crime Record</h1></center>
<%
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","user123");
		Statement statement =con.createStatement();
		resultset=statement.executeQuery("select case_id from progress");
		%>
	
	<center><table border="3" bgcolor="pink"><h1>Select case_id</h1>
	<select>
	
	<%while(resultset.next()){ %>
	<option><%=resultset.getString(1) %></option>
	<%} %>
	</select>
	<%
	//**Should I input the case_id here?
	}
	catch(Exception e)
	{
		out.println("Wrong entry"+e);
	}
	
	
	
	
	
	%></center>
	 
    <tr>
   
<td><br><br>Date :</td>
<td><br><br>&nbsp;&nbsp;
<input type="text" name="date" value="yyyy/mm/dd"></td> 
</tr>

<tr>
<td><br><br>Place :</td>
<td><br><br>&nbsp;&nbsp;
<input type="text" name="place" maxlength=50 length=10></td>
</tr>

<tr>
<td><br><br>Crime Description :</td>
<td><br><br>&nbsp;&nbsp;
<input type="text" name="des_crime" maxlength=500 length=100></td>
</tr>

<tr>
<td><br><br>Victims :</td>
<td><br><br>&nbsp;&nbsp;
<input type="text" name="victims" maxlength=100 length=10></td>
</tr>

<tr>
<td><br><br>Suspect :</td>
<td><br><br>&nbsp;&nbsp;
<input type="text" name="suspect" maxlength=50 length=20></td>
</tr>

<tr>
<td><br><br>Police Station :</td>
<td><br><br>&nbsp;&nbsp;
<input type="text" name="p_station" maxlength=50 length=10></td>
</tr>

<br><br><br><tr>
 <td><center><input type="submit" name="submit1" value="Submit">
  <input type="reset" name="reset1" value="Reset..."></center></td></tr>
    
 </table>
 
 
</center>

</body>
</html>