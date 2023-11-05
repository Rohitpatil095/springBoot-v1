<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Vendor</title>
</head>
<body>
	
	<div class="addContainer">
		<form action="/viewAll" method="post">
		
			<label for="code">Code</label>
			<input id="code" name="code" value="code"/>
			<br>
			
			<label for="Name">Name</label>
			<input id="Name" name="name" value="Name"/>
			<br>
			
			<label for="Type">Type</label>
			<input id="Type" name="type" value="Type"/>
			<br>
			
			<label for="Email">Email</label>
			<input id="Email" name="email" value="Email"/>
			<br>
			
			<label for="">Phone</label>
			<input id="Phone" name="phone" value="Phone"/>
			<br>
			
			<label for="Address">Address</label>
			<input id="Address" name="address" value="Address"/>
			<br>
			
			<button type="submit">Add</button>
		</form>
	</div>


</body>
</html>