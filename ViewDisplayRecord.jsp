<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="crime2.png">
<%@ page import="java.util.List" %>
<%@ page import="com.demo.example.CrimeData" %>


<%List <CrimeData> list=(List <CrimeData>) request.getAttribute("allrecords");
%>

<table border=3>
    <caption>List of Criminal's records...</caption>
      <tr>
        <th>Criminal ID</th>
        <th>Name</th>
        <th>Sex</th>
        <th>Age</th>
        <th>Address</th>
        <th>Mark</th>
        <th>Crime_area</th>
        <th>Crime_attached</th>
        
	  </tr>
      <%for (CrimeData cri: list) {%>
      <tr>
        <td><%=cri.getCri_id()%></td>
    	<td><%=cri.getName()%></td>
    	<td><%=cri.getSex()%></td>
    	<td><%=cri.getAge()%></td>
    	<td><%=cri.getAddress()%></td>
    	<td><%=cri.getMark()%></td>
    	<td><%=cri.getCrime_area()%></td>
    	<td><%=cri.getCrime_attached()%></td>
      </tr>
<%      
    }
%></table>
<a href="frame.html" target="frame.html"><img src="home.gif" width="125" height="50"></a>
</body>
</html>