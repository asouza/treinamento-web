<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de computadores</title>
</head>
<body>
	<form action="/novo/computador" method="post">
		<div>
			<label>
				Número de Série
				<input type="text" name="numeroDeSerie" value="${sala.getNumeroDeSerie()}"/>${erros.getFieldError("numeroDeSerie").getDefaultMessage()}
			</label>
		</div>
		<div>
			<label>
				Configuração
				<input type="text" name="configuracao" value="${sala.getConfiguracao()}"/>${erros.getFieldError("configuracao").getDefaultMessage()}
			</label>
		</div>
		<div>
			<label>
				Observação
				<input type="text" name="observacao" value="${sala.getObservacao()}"/>${erros.getFieldError("observacao").getDefaultMessage()}
			</label>
		</div>
		<input type="submit" value="gravar"/>		
	</form>
</body>
</html>