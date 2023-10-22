<%--- <%@ include file="/views/common/header.jspf" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
<!DOCTYPE html>
<html>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
<head>
<meta charset="UTF-8">

<title>Add New Entry</title>
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" > 
</head>
<body>
	<%@ include file="/views/common/navigation.jspf" %>
	<div class="container">
		<h1>Add New Entry</h1>
		<form:form method="post" modelAttribute="td">
			<table class="table">
				<thead>
					<tr>
						<td>id</td>
						<td>userName</td>
						<td>description</td>
						<td>completion Date</td>
						<td>is Done? </td>
					</tr>
				</thead>
				<tbody>
						<tr>
						
							<td><form:input type="text" path="id" required="required"/> </td>
							<td><form:input type="text" path="userName" required="required"/></td>
							<td><form:input type="text" path="description" required="required"/></td>
							<td><form:input type="text" path="targetLocalDate" value="yyyy-mm-dd"/></td>
							<%-- <td>${error}</td>  --%>
							<td><form:input type="text" path="done"/></td>
						
						</tr>
				</tbody>
			</table>
			<button type="submit">Add</button> 
		</form:form>
	</div>

	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript">
		$('#targetLocalDate').datepicker({
		    format: 'yyyy-mm-dd'
		});
	</script>
</body>
</html>