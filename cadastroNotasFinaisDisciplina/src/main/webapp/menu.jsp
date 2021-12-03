<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<%-- Inclui um cabeçalho no código --%>
	<%@ include file="Header.jsp" %>
	<br>
	Selecione a opção desejada:
	<br><br>
	<%-- links para direcionar o usuário às páginas desejadas --%>
	1.<a href="ServletControlador?acao=cadastrar">Cadastrar disciplina e nota</a>
	<br>
	2.<a href="ServletControlador?acao=consultar">Listar disciplinas e notas</a>
	<br>
	3.<a href="ServletControlador?acao=sair">Sair</a>
</body>
</html>