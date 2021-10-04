<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ID da Sessão do Usuário:</title>
</head>
<body>
<p>>ID da sessao do usuario: <%= session.getId() %> </p>
<%!
int qtd_acesso = 0;
Date data = new Date();
String data_primeiro_acesso = data.toString();
%>
<p>Acesso Número: <%= qtd_acesso%>.</p>
<p>Hora Primeiro Acesso: <%=data_primeiro_acesso%></p>

<%
Date date = new Date();
String data_ultimo_acesso = date.toString(); 
%>

<p>Hora Último Acesso: <%= data_ultimo_acesso %> </p>

<%qtd_acesso += 1; %>
</body>
</html>