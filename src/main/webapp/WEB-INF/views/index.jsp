<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1>This is home page</h1>
<h1>Called by home controller</h1>
<h1>url /home</h1>

<%
	String name=(String) request.getAttribute("name");
	
	List<String> friends=(List<String>) request.getAttribute("f");

	
%>

<h1>Name is <%=name%></h1>

<%
	for(String s:friends){
%>
	<h1><%=s %></h1>	
	
	
<% 	
	}
%>


</body>
</html>