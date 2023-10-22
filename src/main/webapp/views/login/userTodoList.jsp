<%--
	<%@include file="/views/common/header.jspf" %>
	<%@include file="/views/common/navigation.jspf" %>
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
<head>
<meta charset="UTF-8">
 
	<title>Insert title here</title>

</head>

<body>
	<div class="container">
		<h1> Welcome ${name}</h1>
		<table class="table">
			<thead>
				<tr>
					<td>id</td>
					<td>userName</td>
					<td>description</td>
					<td>targetLocalDate</td>
					<td>is Done? </td>
					<td>Update</td>
					<td>Delete</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="listItems">
					<tr>
						<td>${listItems.id}</td>
						<td>${listItems.userName}</td>
						<td>${listItems.description}</td>
						<td>${listItems.targetLocalDate}</td>
						<td>${listItems.done}</td>
						<td> <a href="update-todo?id=${listItems.id}" class="btn btn-success">Update</a> </td>
						<td> <a href="delete-todo?id=${listItems.id}" class="btn btn-warning">Delete</a> </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a class="btn, btn-success" href="add-todo">Add</a>
		
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>