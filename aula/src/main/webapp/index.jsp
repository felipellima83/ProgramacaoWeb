<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Formulário de Agenda</legend>
		<form action="ServletAgenda">
			<label>Nome</label> <input type="text" /> 
			<label>Telefone</label> <input type="text" /> 
			<label>Nascimento</label> <input type="date" />
			<button>Cadastrar</button>
		</form>
	</fieldset>
</body>
</html>