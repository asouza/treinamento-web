<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de computadores</title>
</head>
<body>
	<form:form action="/novo/computador" method="post" modelAttribute="computador">
		<div>
			<label>
				Número de Série
				<form:input type="text" path="numeroDeSerie"/>
				<form:errors path="numeroDeSerie"/> 
			</label>
		</div>
		<div>
			<label>
				Configuração
				<form:input type="text" path="configuracao"/>
				<form:errors path="configuracao"/> 
			</label>
		</div>
		<div>
			<label>
				Observação
				<form:input type="text" path="observacao"/>
				<form:errors path="observacao"/> 
			</label>
		</div>
		<input type="submit" value="gravar"/>		
	</form:form>
</body>
</html>