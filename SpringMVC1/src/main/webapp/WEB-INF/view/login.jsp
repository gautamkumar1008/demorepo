<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.center {
	margin: auto;
	width: 50%;
	/*  border: 3px solid red; */
	padding: 10px;
	margin-top: 10%;
	background-color: gray;
	text-align: center;
}
</style>
</head>

<body bgcolor="#33B5FF">
	<c:if test="${list ne null}">
		<h1 style="text-align: center; color:red; border:5px solid red;" >Username:${t1}</h1>
		<div style="text-align:right;">
        	<a href="logout">Logout</a>
   		 </div>
   		 
   		 
		<table class="center" border="3px solid red">
			<tr>
				<th>id</th>
				<th>name</th>
			</tr>

			<c:forEach var="itemlist" items="${list}">
				<tr>
					<td><a href="getvalue?id=${itemlist.id}">${itemlist.id}</a></td>
					<td>${itemlist.name}</td>
				</tr>
			</c:forEach>
		</table>

	</c:if>
	<c:if test="${list eq null}">
		
		<h1 style="text-align: center; color:red; border:5px solid red;" >Username:${t1}</h1>
		<div style="text-align:right;">
        	<a href="logout">Logout</a>
   		 </div>
		
		<h1 style="text-align: center;"><a href="show">show detail</a></h1>
	</c:if>

</body>
</html>