<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="crime2.png">
 <center><h1>Insert Criminal Record...</h1></center>
  <form action="ControllerInsert" method="get">
 <center><table border="3" bgcolor="pink">
 <tr>		
   <td> Criminal ID :</td>
	  <td>&nbsp;&nbsp;
		<input type="text" name="cri_id" length="2" maxlength="10" >
		</td>
		</tr>
				
		<tr>
		<td>
			
			 <br><br> Name :</td>
			  <td><br><br>&nbsp;&nbsp;
			<input type="text" name="name" length="50" maxlength="111" >
			</td>
			</tr>
			
			
		<tr>
			<td>
			 <br><br>	Sex :
			</td>
			<td><br><br>&nbsp;&nbsp;
				<input type ="radio" name = "sex" value = "m" checked>Male<br>
				&nbsp;&nbsp;
				<input type ="radio" name = "sex" value = "f">Female
			</td>
			</tr>
		
		<tr>
			<td>
			<tr>
			<td>
		 <br><br> Age :</td>
			  <td><br><br>&nbsp;&nbsp;
			<input type="text" name="age" length="2" maxlength="10" size="2">
			</td>
			</tr>
		
		
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
		<tr>
			<td>
           <br><br>  Area of the crime from where the criminal was first arrested :
            </td>
            <td><br><br>&nbsp;&nbsp;
            <input type="text" name="crime_area" length="20" maxlength="100">
            </td>
            </tr>
        <tr>
        	<td>
        	 <br><br>Attached to which crime :
        	</td>
        	<td><br><br>&nbsp;&nbsp;
        	<input type="text" name="crime_attached" length="50" maxlength="100">
        	</td>
        	</tr>
        	<tr>
        	
        	<br><br><br>
            	<td><center><input type="submit" name="submit1" value="Submit">
  <input type="reset" name="reset1" value="Reset"></center></td></tr>
			
			</table>
			
	   
  
  </form>
 </center>
 </body>
</html>