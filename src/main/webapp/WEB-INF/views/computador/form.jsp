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
				<input type="text" name="numeroDeSerie"/>
			</label>
		</div>
		<div>
			<label>
				Configuração
				<input type="text" name="configuracao"/>
			</label>
		</div>
		<div>
			<label>
				Observação
				<input type="text" name="observacao"/>
			</label>
		</div>
		<input type="submit" value="gravar"/>		
	</form>
</body>
</html>