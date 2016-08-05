<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de salas</title>
</head>
<body>
	<form action="/nova/sala" method="post">
		<div>
			<label>
				Sala
				<input type="number" name="numero" value="${sala.getNumero()}"/>${erros.getFieldError("numero").getDefaultMessage()}
			</label>
		</div>
		<div>
			<label>
				Quantidade de computadores
				<input type="number" name="quantidadeComputadores" value="${sala.getQuantidadeComputadores()}"/>${erros.getFieldError("quantidadeComputadores").getDefaultMessage()}
			</label>
		</div>
		<input type="submit" value="gravar"/>		
	</form>
</body>
</html>