<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<style>
.error {
   color: red
   }
 </style>
</head>
<body>
	<h2>Personal Particular</h2>
	<hr>
	<br>
	<form:form action="display" method="post" modelAttribute="user">

		<label for="name">User Name</label>
		<form:input type="text" path="name" />
		<form:errors path="name" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="date">DOB</label>
		  <input type="date"  name="date"  />
       <form:errors path="date" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="id">Email</label>
		<form:input type="text" path="Email" />
		<form:errors path="email" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="no">PhoneNo</label>
		<form:input type="text" path="PhoneNo" />
		<form:errors path="PhoneNo" cssClass="error"></form:errors>
		<br>
		<br>
		
		<label for="AadharId">AadharId</label>
		<form:input type="text" path="AadharId" />
		<form:errors path="AadharId" cssClass="error"></form:errors>
		<br>
		<br>
		
	
		<label for="password">Password</label>
		<form:input type="password" path="password" />
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Gender: </label>
		Male<form:radiobutton path="Gender" value="Male" />  
		<%-- <form:errors path="gender" cssClass="error"></form:errors> --%>
        Female<form:radiobutton path="Gender" value="Female" />
       	<form:errors path="gender" cssClass="error"></form:errors>
		<br>
		<label>Enter Age:</label>
		<form:select path="age">
		<%-- <form:errors path="age" cssClass="error"></form:errors> --%>
			<%-- <form:option value="Delhi" label="Delhi" />
			<form:option value="UP" label="Uttar Pradesh" />
			<form:option value="HR" label="Haryana" />
			<form:option value="MH" label="Maharashtra" />
			<form:option value="PB" label="Punjab" />--%>
			<form:options items="${user.ageOptions}" />
		</form:select>
		<%-- <form:errors path="age" cssClass="error"></form:errors> --%>
		<br>
		<br>
		<label>Enter State:</label>
		<form:select path="state">
		<form:options items="${user.stateOptions}" />
		</form:select>
		<br>
		<br>
		<label>Languages </label>
		<br>
		<br><%-- <!--  -->PAN<form:checkbox path="otheroptions" value="PAN" />   --%>
<%--         Driving License<form:checkbox path="otheroptions"
			value="Driving License" />  
			
        Voter Id<form:checkbox path="otheroptions" value="Voter Id" />
        Passport<form:checkbox path="otheroptions" value="Passport" /> --%>
		        <form:checkboxes items="${user.otheroptions}" path="options"/>
		       <form:errors path="options" cssClass="error"></form:errors>     
		        <br>
		        <br>
        
		<label>Instruction</label>
		<br>
		<form:textarea path="instruction" rows="5" cols="30" placeholder="Enter your instructions here:"/>
		<form:errors path="instruction" cssClass="error"></form:errors>
		<br>
		<br>

		<input type="submit" value="send" />
		<input type="reset" value="clear" />
	</form:form>
</body>
</html>
		