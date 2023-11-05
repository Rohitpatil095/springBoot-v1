<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Location Data</title>
</head>
<body>

	<div class="mainContainer">
		<form action="/viewData", method="post">
			<label for="id">Id</label>
			<input id="id" type="text" name="id" value="provide id"/>
			<br>
			
			<label for="code">Code</label>
			<input id="code" name="code" value="user location code"/>
			<br>
			
			<label for="name">Name</label>
			<input id="name" name="name" value="provide name"/>
			<br>
			
			Type: 
				<input id="urban" type="radio" name="urban" value="urban"/> 
				<label for="urban">Urban</label>
				<br>
				<input id="rural" type="radio" name="rural" value="rural"/>
				<label for="rural">Rural</label>
			<br>
			<button type="submit">Submit</button>
			 
		</form>
		${msg}
		
		<a href="/viewAll">View All</a>
	
	
	</div>


</body>
</html>