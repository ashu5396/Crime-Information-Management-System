<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="crime2.png">


<% 
Boolean f=(Boolean)request.getAttribute("reply");
if(f)
{
	out.println("Record has been inserted sucessfully");
	
}
else
{
	out.println("Record has not been inserted successfully");
}
%>
<a href="frame.html" target="frame.html"><img src="home.gif" width="125" height="50"></a>
</body>
</html>