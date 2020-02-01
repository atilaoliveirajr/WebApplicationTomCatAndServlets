<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List, br.com.alura.maven.servlet.Company, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Registered Companies</title>
</head>
<body>
	<ul>
	<% 
		List<Company> listForTheBrownser = (List<Company>)request.getAttribute("ListOfRegisteredCompanies");

		for (Company company : listForTheBrownser) {
	%>
		<li><%= company.getName() %></li>
	<% 
		}
	%>
	</ul>
</body>
</html>