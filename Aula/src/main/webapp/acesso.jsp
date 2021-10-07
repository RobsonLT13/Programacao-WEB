<%@page import="trabalho_jsp.Contador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apresenta a quantidade de acessos a esta página</title>
</head>
<body>
<% trabalho_jsp.Contador.novoAcesso(); %>
<% trabalho_jsp.Contador.inserirData(); %>

Quantidade de acessos a esta página:
<b><%= trabalho_jsp.Contador.getQuantidadeAcessos() %></b><br><br>

Data e hora do primeiro acesso:
<b><%= trabalho_jsp.Contador.getDataInicial() %></b><br><br>

Data e hora do último acesso:
<b><%= trabalho_jsp.Contador.getDataFinal() %></b>
</body>
</html>