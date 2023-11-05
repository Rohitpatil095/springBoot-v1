<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Available Vendors</title>
</head>
<body>
	
	<div class="vendorsContainer">
		<table>
			<thead>
				<tr>
					<td>Id</td>
					<td>Code</td>
					<td>Name</td>
					<td>Type</td>
					<td>Email</td>
					<td>Phone</td>
					<td>Address</td>
					<td></td>
					<td></td>
				</tr>
			</thead>
		
			<tbody>
				<c:forEach items="${vendors}" var="vendors">
					<tr>
						<td>${vendors.id}</td>
						<td>${vendors.code}</td>
						<td>${vendors.name}</td>
						<td>${vendors.type}</td>
						<td>${vendors.email}</td>
						<td>${vendors.phone}</td>
						<td>${vendors.address}</td>
						<td><a href="/deleteVendor?id=${vendors.id}" >Delete</a></td>
						<td><a href="updateVendor?id=${vendors.id}" >Edit</a></td>
					</tr>
					
				</c:forEach>
			</tbody>
		
		
		</table>

	</div>



</body>
</html>