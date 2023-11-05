<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update ${vendor.name}</title>
</head>
<body>
	
	
	<div class="addContainer">
		<form action="/updateVendor" method="post">
		
			<label for="Id">Id</label>
			<input id="Id" name="id" value=${vendor.id} readonly  >
			<br>
		
			<label for="code">Code</label>
			<input id="code" name="code" value=${vendor.code}>
			<br>
			
			<label for="Name">Name</label>
			<input id="Name" name="name" value=${vendor.name}>
			<br>
			
			<label for="Type">Type</label>
			<input id="Type" name="type" value=${vendor.type}>
			<br>
			
			<label for="Email">Email</label>
			<input id="Email" name="email" value=${vendor.email}>
			<br>
			
			<label for="">Phone</label>
			<input id="Phone" name="phone" value=${vendor.phone}>
			<br>
			
			<label for="Address">Address</label>
			<input id="Address" name="address" value=${vendor.address}>
			<br>
			
			<button type="submit">Update</button>
		</form>
	</div>



</body>
</html>