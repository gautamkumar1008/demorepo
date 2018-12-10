<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<style>
.center {
  margin: auto;
  width: 50%;
  border: 3px solid green;
  padding: 10px;
  margin-top: 5%;
  background-color: green;
  }	

</style>
<body bgcolor="#33B5FF">

<c:if test="${t1 eq null}">
	<form action="test">
		<h2 style="color: red; text-align: center; margin-top: 8%;">${error}</h2>
		<table class="center">
			<tr>
				<td>Username:</td>
				<td><input type="text" name="t1"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="text" name="t2"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	</c:if>
	
	
	<c:if test="${t1 ne null}">
		<h1 style="color:red; text-align: center; margin-top: 4%;">You are already login ${t1}</h1>
		<div style="text-align:right;">
        	<span><a href="logout">Logout</a></span>
   		 </div>
   		 <h1 style="text-align:center;"><a href="test?t1=${t1}&t2=${t2}">Goto login page</a></h1>
		
		
	</c:if>
	
</body>
</html>

