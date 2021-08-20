<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletAgenda" method="post">
		<h2>AGENDA</h2>
		<table border="0" cellpadding="1">
			<tr>
				<td><label>Nome</label></td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td><label>Telefone</label></td>
				<td><input type="text" name="telefone" /></td>
			</tr>
			<tr>
				<td><label>Data de Nascimento</label></td>
				<td><input type="text" name="nascimento" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enviar" /> <input
					type="reset" value="Limpar" /></td>
			</tr>
		</table>
	</form>
</body>
</html>