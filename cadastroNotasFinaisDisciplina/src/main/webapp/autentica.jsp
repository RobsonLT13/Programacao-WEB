<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<script type="text/javascript">
function verificarLetra(){
	// Função responsável por permitir que somente letras sejam digitas
	var formulario = document.getElementById("formulario");
	var tecla = event.keyCode;
	if (tecla >= 48 && tecla <= 57){
		// Se um número for digitado, esse evento será cancelado e o usuário será alertado
		event.preventDefault();
		alert("Digite apenas letras");
	}
}
</script>
	<h2>Login</h2><br>
	<%-- Form responsável por enviar os inputs de login para a ServletControladorAutentica --%>
	<form id="formulario" action="ServletControladorAutentica" method="post">
		Usuário: <input type="text" name="user" onkeypress="verificarLetra();" ><br>
		Senha: <input type="password" name="password"><br>
		<input type="submit" value="logar"><br><br>
	</form>
</body>
</html>