<%@page import="com.notas.model.Disciplina"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de encontros</title>
</head>
<body>
<%-- Inclui u cabeçalho Header.jsp no código --%>
	<%@ include file="Header.jsp" %>
	<br>
	<h2>Notas:</h2>
	<%-- 
	Cria uma tabela para apresentar a lista composta de objetos da classe 
	Disciplina com o nome da disciplina, nota final e a situação
	 --%>
	<table border="1">
		<tr>
			<td>Disciplina</td>
			<td>Nota</td>
			<td>Situação</td>
		</tr>
		<%
			List<Disciplina> lista = (List<Disciplina>) request.getAttribute("lista");
			for(Disciplina disciplina : lista){
		%>
		<tr>
			<td><%= disciplina.getNomeDisciplina() %></td>
			<td><%= disciplina.getNota() %></td>
			<td><%= disciplina.getResultado() %></td>
		</tr>
		<%
			}
		%>
		<br><br>
		<%-- Link que permite ao usuário retornar ao menu --%>
		<a href="ServletControlador">Voltar ao menu principal</a>
	</table>
</body>
</html>