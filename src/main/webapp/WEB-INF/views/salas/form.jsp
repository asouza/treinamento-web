<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de salas</title>
</head>
<body>
	<form:form action="/nova/sala" method="post" modelAttribute="sala">
		<div>
			<label>
				Sala
				
				<form:input type="number" path="numero"/>
				<form:errors path="numero"/>
			</label>
		</div>
		<div>
			<label>
			    <form:input type="number" path="quantidadeComputadores"/>
				<form:errors path="quantidadeComputadores"/>
			</label>
		</div>
		<input type="submit" value="gravar"/>		
	</form:form>
</body>
</html>