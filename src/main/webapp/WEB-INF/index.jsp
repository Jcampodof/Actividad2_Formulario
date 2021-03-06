<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
		<h1>Agregar usuario:</h1>
		<div class="row col-md-6">
			<form action="/registro" method="POST">
				<div class="form-group">
					<label>Nombre:</label> <input type="text" class="form-control"
						id="nombre" name="nombre">
				</div>
				<div class="form-group">
					<label>Apellido:</label> <input type="text" class="form-control"
						id="apellido" name="apellido">
				</div>
				<div class="form-group">
					<label>limite:</label> <input type="number" class="form-control"
						id="limite" name="limite">
				</div>
				<div class="form-group">
					<label>Codigo Postal:</label> <input type="text"
						class="form-control" id="codigoPostal" name="codigoPostal">
				</div>
				<button type="submit" class="btn btn-block btn-outline-primary">Agregar</button>
			</form>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
	crossorigin="anonymous"></script>
</html>