<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script> 
function validate()
{ 
	 var username = document.form.username.value; 
	 var password = document.form.password.value;
	 
	 var securityq = document.form.securityq.value;
	 var securitya = document.form.securitya.value;
	 
	 
	 if (username==null || username=="")
	 { 
	 	alert("Username can't be blank"); 
	 	return false; 
	 }
	 else if(password.length<6)
	 { 
	 	alert("Password must be at least 6 characters long."); 
	 	return false; 
	 } 
	 else if (securityq==null || securityq=="")
	 { 
	 	alert("Please create a security question"); 
	 	return false; 
	 }
	 else if (securitya==null || securitya=="")
	 { 
	 	alert("Please answer your security question"); 
	 	return false; 
	 } 
	 
	 System.out.println ("Hello");

 } 
</script> 
</head>
<body>
<center><h2>Java Registration application </h2></center>
<form name="form" action="src/loginwebapp/RegisterServlet" method="post" onsubmit="return validate()">
<table align="center">
 <tr>
 
 <td>Username</td>
 <td><input type="text" name="username" /></td>
 </tr>
 <tr>
 <td>Password</td>
 <td><input type="password" name="password" /></td>
 </tr>
 <td>Security Question</td>
 <td><input type="text" name="securityq" /></td>
 </tr>
 <tr>
 <td>Security Answer</td>
 <td><input type="text" name="securitya" /></td>
 </tr>
 <tr>
 <tr>
 <td><%=(request.getAttribute("errMessage") == null) ? ""
 : request.getAttribute("errMessage")%></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" value="Register"></input><input
 type="reset" value="Reset"></input></td>
 </tr>
</table>
</form>
 
</body>
</html>