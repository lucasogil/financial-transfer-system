<%--
  Created by IntelliJ IDEA.
  User: Lucas Gil
  Date: 14/02/2020
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Error</title>
    <link rel="stylesheet" href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
    <style>
        .footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: white;
            color: white;
            text-align: center;
        }
    </style>
</head>
    <body style="background-color: white">
    <div class=" col-md-6 col-md-offset-3">
        <div class="row">
            <div class="col-md-12">
                <div class="error-template">
                    <h1 class="text-center" style="font-family:Verdana">Oops!</h1>
                    <h2 class="text-center" style="font-family:Verdana">404 Not Found</h2>
                    <div class="text-center error-details" style="font-family:Verdana">
                        Desculpe, mas a página que você tentando acessar está temporariamente indisponível
                        <p style="font-family:Verdana">Erro: ${errorMessage}</p>
                    </div>
                    <div align="center" class="container-box">
                        <a href="/" class="text-center btn btn-primary btn-lg" style="background-color: lightslategrey; border: lightslategrey" >
                            <span class="glyphicon glyphicon-home"></span> Voltar para o Inicio</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer" align="center">
        <img src="https://media1.tenor.com/images/77052965bde169808468279e5fdaf54a/tenor.gif" style="width:200px;height:200px;" >
    </div>
    <script src="../webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="../webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>
