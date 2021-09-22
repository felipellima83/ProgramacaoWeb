<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <link rel="stylesheet" href="./style.css">
        <title>Cadastro de Dados Pessoais</title>
    </head>
    <body>
        <p>Entre com seus dados pessoais</p>
        <form action="ServletCadastro" method="post">
            <div class="campos">
                <label for="nome">Nome</label>
                <input type="text" id="nome" name="nome"> <br>
                <label for="ultimo_nome">Último Nome'</label>
                <input type="text" id="ultimo_nome" name="ultimo_nome"> <br>
                <label for="rua">Rua</label>
                <input type="text" id="rua" name="rua"> <br>
                <label for="logradouro">Logradouro</label>
                <input type="text" id="logradouro" name="logradouro"> <br>
                <label for="cidade">Cidade</label>
                <input type="text" id="cidade" name="cidade"> <br>
                <label for="cep">Cep</label>
                <input type="text" id="cep" name="cep"> <br>
                <label for="estado">Estado</label>
                <input type="text" id="estado" name="estado"> <br>
                <input type="submit" value="Proxima tela">
            </div>
        </form>
    </body>
</html>