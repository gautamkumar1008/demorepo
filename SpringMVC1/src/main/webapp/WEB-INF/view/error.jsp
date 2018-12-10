<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#33B5FF">
	<c:if test="${t1 ne null}">
		<h1 style="text-align: center; color:red; border:5px solid red;" >Username:${t1}</h1>
		<div style="text-align:right;">
        	<a href="logout">Logout</a>
   		 </div>
	</c:if>
	<h1>Data From Database:
		<c:forEach var="list" items="${list}">
			 ${list.name}
		</c:forEach>
	
	</h1>
	<a href="login">Login</a>
</body>
</html>