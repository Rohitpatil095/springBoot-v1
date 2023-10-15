<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Started spring...</h1>
	
	<pre>${errMessage}</pre>
	<div>
		<form method="post"> 
			<h1>User Name: <input type="text" value="abc@xyz.com" name="uName"/></h1>
			<h1>Password: <input type="password" value="*****" name="pass"></h1>
			<button>Submit</button>
		</form>
	</div>
	
</body>
</html>