<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>:: Registration ::</title>
</head>
<body>
 </br> </br> </br>
 <h1>
  <div align="center">
   <% if(request.getAttribute("msg") != null) { %>
    <p style="color: red">
     <%= request.getAttribute("msg") %>
    </p>
   <% } %>
   <% if(request.getAttribute("msg2") != null) { %>
    <p style="color: green;">
     <%= request.getAttribute("msg2") %>
    </p>
   <% } %>

   <form action="userRegistration" method="POST">
    <label>Enter Username : </label> 
    <input type="text" name="username" required="required"> <br> <br> 
    <label>Enter Password : </label> 
    <input type="password" name="password" required="required"> <br> <br> 
    <label>Confirm Password : </label> 
    <input type="password" name="confPassword" required="required"> <br> <br> 
    <label>Enter First Name : </label> 
    <input type="text" name="firstName" required="required"> <br> <br>
    <label>Enter Last name : </label> 
    <input type="text" name="lastName" required="required"> <br> <br>
    <label>Enter Dob : </label> 
    <input type="text" name="dob" required="required"> <br> <br>
    <label>Enter Email Id : </label> 
    <input type="text" name="emailId" required="required"> <br> <br>
    <label>Enter Mobile No : </label> 
    <input type="text" name="mobileNo" required="required"> <br> <br>
    <input type="submit" value="Registre">
   </form>
 </h1>
 </div>
</body>
</html>