<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienenido SCT</title>
</head>
<body>	
	<h3>Bienvenido Usuario</h3>
	
	<form action="DescargaExcelMatricula">
		<table>
			<tr>
				<td>Usuario:</td>
				<td><input type="text" name="userChof"/></td>
			</tr>
			<tr>
				<td>Tipo de Licencia</td>
				<td><input type="text" name="tipoLic"/></td>
			</tr>
				<td>RFC:</td>
				<td><input type="text" name="rfcUser"/></td>
			<tr>
			</tr>
		</table>
		<input type="submit" value="Generar Reporte"/>
	</form>
	<form action="index.jsp">
		<input type="submit" value="Regresar" />
	</form>

</body>
</html>