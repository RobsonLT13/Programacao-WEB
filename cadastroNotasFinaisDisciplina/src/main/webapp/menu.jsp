<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<%-- Inclui um cabe�alho no c�digo --%>
	<%@ include file="Header.jsp" %>
	<br>
	Selecione a op��o desejada:
	<br><br>
	<%-- links para direcionar o usu�rio �s p�ginas desejadas --%>
	1.<a href="ServletControlador?acao=cadastrar">Cadastrar disciplina e nota</a>
	<br>
	2.<a href="ServletControlador?acao=consultar">Listar disciplinas e notas</a>
	<br>
	3.<a href="ServletControlador?acao=sair">Sair</a>
</body>
</html>