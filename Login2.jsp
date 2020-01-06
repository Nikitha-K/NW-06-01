<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script>
		
		function validate(){
		
		
			
		if(document.myForm.pass.value =="" && document.myForm.user.value == "")
		{
			document.getElementById("pass").innerHTML="Enter a valid pass".fontcolor("red");
			document.getElementById("user").innerHTML="Enter a valid name".fontcolor("red");
			
			document.myForm.pass.focus();
			return false;
		}
		
		if(document.myForm.pass.value !="" && document.myForm.user.value == "")
		{
			document.getElementById("user").innerHTML="Enter a valid name".fontcolor("red");
			document.getElementById("pass").innerHTML="";
			document.myForm.user.focus();
			return false;
		}
		
		if(document.myForm.user.value != "" && document.myForm.user.value =="")
		{
			document.getElementById("pass").innerHTML="Enter a valid password".fontcolor("red");
			document.getElementById("user").innerHTML="";
			document.myForm.pass.focus();
			return false;
		}
		
		return(true);
		
		
		}
		
					
		</script>
	</head>
	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<body>
	<form action = "Validate.jsp" name = "myForm" onsubmit = "return(validate());">
		
		Enter your name <input type= "text" name ="user" /><span id="user"></span><br>
		
		Enter your password <input type= "password" name ="pass" /><span id="pass"></span><br>
		<input type = "submit" value="submit">
		
	</form>
	
</body>
</html>