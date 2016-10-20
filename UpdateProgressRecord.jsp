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
<form action="ControllerProgressUpdate" method="get">
<center><h1>Update Progress Record</h1></center>
	
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
	
	
	
	
	
	%>
					
	  
    <tr>
    </br></br>
<td>Comment :</td>
<td>&nbsp;&nbsp;
<textarea rows="6" cols ="20" name="comment" maxlength=600 length=100></textarea></td>
</tr>

<tr>
<td><br><br>Status :</td>
<td><br><br>&nbsp;&nbsp;
<select name = date size = 1>
					<option value = value1>Solved
					<option value = value2>Unsolved
					
					</select>
					</td>
</tr>

<br><br><br><tr>
  <td><center><input type="submit" name="submit1" value="Submit">
  <input type="reset" name="reset1" value="Reset"></center></td></tr>

</table>
</center>
</form>


</body>
</html>