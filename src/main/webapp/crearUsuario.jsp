<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Nuevo Usuario</title>
</head>
<body>
	<form action="crearUsuario" method="POST">
		Nombre de Usuario: <input type="text" name="username">
		Contraseña: <input type="password" name="pass">
		<button type="submit">Crear</button>
	</form>
</body>
</html>