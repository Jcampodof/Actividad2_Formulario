<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Formulario de Registro</h1>
<form action="/registro" method="POST">
<label for="nombre">Nombre: </label>
<input type="text" id="nombre" name="nombre">

<label for="apellido">Nombre: </label>
<input type="text" id="apellido" name="apellido">

<label for="limite">Nombre: </label>
<input type="number" id="limite" name="limite">

<label for="codigoPostal">Nombre: </label>
<input type="text" id="codigoPostal" name="codigoPostal">

<input type="submit" value="Enviar">

</form>

<h2><c:out value="${nombre} ${apellido} ${limite } ${codigoPostal}"></c:out></h2>
</body>
</html>