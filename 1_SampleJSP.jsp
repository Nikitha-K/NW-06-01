<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H2>Sample JSP Program</H2>
	<%--This is the comment tag --%>
	<%!int x=10; %>
		<h2>The value of 'x' is : <%=x++ %></h2>
		<%if(x>0){ %>
		<h2>X is said to be positive</h2>
		
		<%}else { %>
		<h2>X is said to be negative</h2>
		<%} %>
		


</body>
</html>