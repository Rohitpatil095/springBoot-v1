<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Data</title>
</head>
<body>

<div class="updateContainer">
	
	<form action="/viewUpdated", method="post">
			<label for="id">Id</label>
			<input id="id" type="text" name="id" value=${location.id} readonly>
			<br>
			
			<label for="code">Code</label>
			<input id="code" type="text" name="code" value=${location.code}>
			<br>
			
			<label for="name">Name</label>
			<input id="name" type="text" name="name" value=${location.name}>
			<br>
			
			Type: 
				<input type="radio" name="Urban" value="urban" ${location.type == "urban" ? "checked":""}/> Urban
				<br>
				<input type="radio" name="Rural" value="rural" ${location.type== "rural" ? "checked":"" } />Rural
			<br>
			<button type="submit">Update</button>	
		<a href="/viewAll">View All</a>
	</form>
	 
	
</div>

</body>
</html>