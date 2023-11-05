<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Location Data</title>
</head>
<body>

<div class="viewContainer">
	<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>Code</td>
				<td>Location</td>
				<td>Type</td>
			</tr>	
		</thead>
		
		<tbody>
			<c:forEach var="location" items="${locations}">
				<tr>
					<td>${location.id}</td>
					<td>${location.code}</td>
					<td>${location.name}</td>
					<td>${location.type}</td>
					<td>
						<a href="/deleteLocation?id=${location.id}">Delete</a>
						<a href="/updateLocation?id=${location.id}">Edit</a>
					</td>
				</tr>			
			</c:forEach>
		</tbody>
	</table>
	
	<a href="/">Add Location</a>
	
</div>

</body>
</html>