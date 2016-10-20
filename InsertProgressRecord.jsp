<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="crime2.png">
<center><h1>Insert Progress Record...</h1></center>
  <form action="ControllerProgressInsert" method="get">
<center><table border="3" bgcolor="pink">
<tr>
<td>Case Id :</td>
<td>&nbsp;&nbsp;
<input type="text" name="case_id" maxlength=10 length=2></td>
</tr>

<tr>		
   <td> <br><br>Criminal ID :</td>
	  <td><br><br>&nbsp;&nbsp;
		<input type="text" name="cri_id" length="2" maxlength="10" >
		</td>
		</tr>
		
<tr>
<td><br><br>Date :</td>
<td><br><br>&nbsp;&nbsp;
<input type="text" name="date" value="yyyy/mm/dd"></td> 
</tr>

<tr>
<td><br><br>Comment :</td>
<td><br><br>&nbsp;&nbsp;
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
 <td><center> <input type="submit" name="submit1" value="Submit">
  <input type="reset" name="reset1" value="Reset"></center></td></tr>

</table></center>

</body>
</html>