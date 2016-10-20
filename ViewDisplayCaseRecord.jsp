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
<%@ page import="com.demo.example.CaseData" %>

<%List <CaseData> list=(List <CaseData>) request.getAttribute("allrecords");
%>

<table border=3>
    <caption>List of Case's records...</caption>
      <tr>
      <th>Case ID</th>
      <th>Date</th>
      <th>Place</th> 
      <th>Crime Description</th> 
      <th>Victims</th> 
      <th>Detailed Description</th>
      <th>Suspect</th>  
      <th>Police Station</th> 
      </tr>
      
      
     <%for (CaseData cas: list) {%>
      <tr>
      <td><%=cas.getCase_id() %></td>
      <td><%=cas.getDate() %></td>
      <td><%=cas.getPlace() %></td>
      <td><%=cas.getDes_crime() %></td>
      <td><%=cas.getVictims() %></td>
      <td><%=cas.getDetailed_description() %></td>
      <td><%=cas.getSuspect() %>
      <td><%=cas.getP_station() %></td>
      
      </tr>
 <%} %></table>
<a href="frame.html" target="frame.html"><img src="home.gif" width="125" height="50"></a>
</body>
</html>