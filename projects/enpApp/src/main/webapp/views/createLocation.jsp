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
		<form action="/viewData">
			<label for="id">Id</label><br>
			<input id="id" type="text" name="id" value="provide id"/>
			
			<label for="location">Location</label>
			<input id="location" name="location" value="user location"/>
			
			<label for="name">Name</label>
			<input id="name" name="name" value="provide name"/>
			
			
			<p>Type: 
				<input type="radio" name="Urban" value="urban"/>
				<br>
				<input type="radio" name="Rural" value="rural"/>
			</p>
			
			<button type="submit">Submit</button>
			 
		</form>
	
	
	</div>


</body>
</html>