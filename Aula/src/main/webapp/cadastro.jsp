<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	Cadastre seus dados pessoais:
	<form action="ServletCadastroEmpresa">
		Nome: <input type="text" name="nome">
		Sobrenome: <input type="text" name="sobrenome"><br>
		Endere�o residencial: <br>
		Rua: <input type="text" name="rua">
		Complemento: <input type="text" name="complemento"><br>
		Cidade: <input type="text" name="cidade">
		CEP: <input type="text" name="cep">
		Estado: <input type="text" name="estado"><br>
		<input type="submit" value="Pr�xima tela">
	</form>
</body>
</html>