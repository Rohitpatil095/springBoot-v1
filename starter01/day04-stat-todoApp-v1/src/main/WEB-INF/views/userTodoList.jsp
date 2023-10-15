<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome ${username}</title>
</head>
<body>

	<div class="topHeader">
		
		<h2>${username} Todays List..</h2>
		<a href="/login">Home</a>
		<a href="/login">ToDO</a>
	</div>
	
	<div class="mainContainer">
	
		<h1>Your ToDo's</h1>
		
		<table> 
		
			<tr>
				<td>Description</td>
				<td>TargetDate</td>
				<td>Is It Open?</td>
			</tr>			
				
			<tr>
			</tr>	
			
		</table>
	
	</div>



</body>
</html>