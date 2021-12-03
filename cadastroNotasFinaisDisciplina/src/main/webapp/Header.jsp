<%@page import="com.notas.controller.ServletControladorAutentica"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Pega a hora e hora atual para apresentar em outras tela --%>
	<% SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); %>
	<p align="right" > Data e hora atual: <%= sdf.format(new Date()) %></p>
	<%-- Mostra uma mensagem de boas vindas ao usuário da sessão--%>
	<h3 align="left" >Seja bem vindo! <%= session.getAttribute(ServletControladorAutentica.USUARIO) %></h3>
</body>
</html>