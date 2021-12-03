<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de disciplinas</title>

</head>
<body>
<script type="text/javascript"> 
function validarNota() {
	/*
	* Fun��o para validar o campo "nota" e impedir que seja digitado letras,
	* ou n�meros maiores que 10 e menores que 0
	**/
	var formulario = document.getElementById("formulario");
	var nota = document.getElementById("nota").value;
	if (isNaN(nota) || nota < 0 || nota > 10) {
		alert("Digite uma nota entre 0 e 10");
	} else {
		formulario.submit();
	}
}
</script>
	<%-- Inclui u cabe�alho Header.jsp no c�digo --%>
	<%@ include file="Header.jsp" %>
	<br>
	<h2>Cadastro de disciplinas</h2>
	<%-- Form respons�vel por enviar os inputs para a ServletControlador --%>
	<form id="formulario" action="ServletControlador" method="post">
		<input type="hidden" name="acao" value="confirmarCadastro">
		Disciplina: <input type="text" name="nomeDisciplina" value=""><br>
		Nota: <input id="nota" type="text" name="nota" value=""><br>
		<input type="button" value="Enviar" onclick='validarNota();'>
	</form><br>
	<%-- Link que permite ao usu�rio retornar ao menu --%>
	<a href="ServletControlador">Voltar ao menu principal</a>
</body>
</html>