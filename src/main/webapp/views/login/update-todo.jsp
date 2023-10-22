<%@ include file="/views/common/header.jspf" %>

<title>Update List</title>
</head>
<body>

	<div class="container">
		<form:form method="post">
			<table class="table">
				<thead>
					<tr>
						<td>id</td>
						<td>description</td>
						<td>targetLocalDate</td>
						<td>isDone</td>
						<td></td>
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td>
							<form:input type="text" path="id"/>
							<form:input type="text" path="description"/>
							<form:input type="text" path="targetLocalDate"/>
							<form:input type="text" path="done"/>
							<a href="update-todo" class="btn btn-primary">Submit</a>
						</td>
					</tr>
							
				</tbody>
			
			</table>
		</form:form>
	</div>

</body>
</html>