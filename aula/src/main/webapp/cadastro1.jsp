<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Cadastro de Dados Profissionais</title>
    </head>
    <body>
        <p>Entre com seus dados profissionais</p>
        <form action="ServletCadastro" method="post">
            <label for="empresa">Empresa</label>
            <input type="text" id="empresa" name="empresa"> <br>
            <label for="rua">Rua</label>
            <input type="text" id="rua" name="rua_empresa"> <br>
            <label for="logradouro">Logradouro</label>
            <input type="text" id="logradouro" name="logradouro_empresa"> <br>
            <label for="cidade">Cidade</label>
            <input type="text" id="cidade" name="cidade_empresa"> <br>
            <label for="cep">Cep</label>
            <input type="text" id="cep" name="cep_empresa"> <br>
            <label for="estado">Estado</label>
            <input type="text" id="estado" name="estado_empresa"> <br>
            <input type="submit" value="Confirmar">
        </form>
    </body>
</html>