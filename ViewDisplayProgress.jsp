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
<%@ page import="com.demo.example.ProgressData" %>

<%List <ProgressData> list=(List <ProgressData>) request.getAttribute("allrecords");
%>

<table border=3>
    <caption>List of Progress's records...</caption>
      <tr>
      <th>Case ID</th>
      <th>Criminal ID</th>
      <th>Date</th>
      <th>Comment</th>
      <th>Status</th>      
</tr>
 <%for (ProgressData pro: list) {%>
      <tr>
      <td><%=pro.getCase_id() %></td>
      <td><%=pro.getCri_id() %></td>
      <td><%=pro.getDate() %></td>
      <td><%=pro.getComment() %></td>
      <td><%=pro.getStatus() %></td>
      </tr>
     

<%      
    }
%>
</table>
<a href="frame.html" target="frame.html"><img src="home.gif" width="125" height="50"></a>
</body>
</html>