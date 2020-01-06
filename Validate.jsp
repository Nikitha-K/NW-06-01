<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String user = request.getParameter("user");
	String pass = request.getParameter("pass");
	
	
	RequestDispatcher rd = null;
	
	if((user.equals("admin")) && (pass.equals("admin")))
	{
		
		rd = request.getRequestDispatcher("Admin.jsp");
		
		rd.include(request, response); 
		out.println("Authentication successful");
	//	session.invalidate();
		
	}
	
	 
	else if(user.equals("admin") && (!pass.equals("admin"))) 
		{%>
			<font color = red>Unauthorised access</font>
			
		<% rd = request.getRequestDispatcher("Login.jsp");
		
		rd.include(request, response);
	}
		else{
			rd = request.getRequestDispatcher("User.jsp");
			rd.include(request, response);
			out.println("Welcome : "+user);		
	
		
	} %>
	
</body>
</html>