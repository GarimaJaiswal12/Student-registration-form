<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Form</title>
</head>
<body>

<h1> Display details are:</h1>
<h3>Name: ${user.name}</h3>
<h3>Email: ${user.email}</h3>
<h3>Pass: ${user.password} </h3>
<h3>DOB: ${user.date}</h3>
<h3>Gender: ${user.gender}</h3>
<h3>PhoneNo: ${user. phoneNo}</h3>
<h3>AadharId: ${user. aadharId}</h3>
<h3>State: ${user.state}</h3>
<h3>Age: ${user.age} </h3>
<h3>Languages: ${user.otheroptions}</h3>
<h3>Instructions: ${user.instruction} </h3>
</body>
</html>