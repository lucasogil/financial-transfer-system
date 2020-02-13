<%--
  Created by IntelliJ IDEA.
  User: lucasgil
  Date: 13/02/20
  Time: 00:57
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
    <title>Financial Transfer System</title>
    <link rel="stylesheet" href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
    <style type="text/css">
        #bordersdiv {
            padding: 10px;
            border-radius: 15px;
        }
    </style>
</head>
<body style="background-color: #B3C8C8">
    <h3 class="text-center">Ações da Conta</h3>
    <div class=" col-md-6 col-md-offset-3" style="background-color: #f2f2f2" id="bordersdiv">
        <h4><b>Usuario:</b> ${user.name}</h4>
        <div>
            <h4><b>Conta de Origem</b></h4>
            <h5><b>Numero da Conta: </b> <c:out value="${account.id}" /> </h5>
            <h5><b>Tipo da Conta: </b> <c:out value="${account.type}" /> </h5>
            <h5><b>Saldo Disponível:</b> R$ <c:out value="${account.balance}" /> </h5>
            <br>
            <h4 class="title">Selecione uma Conta de Destino</h4>
            <div >
                <c:if test="${not empty allAccounts}">
                    <c:forEach items="${allAccounts}" var="account">
                        <div class="list-group" style="background-color: #ffffff">
                            <a class="list-group-item" style="border: #ffffff">
                                <h5><b>Numero da Conta: </b> <c:out value="${account.id}" /> </h5>
                                <h5><b>Dono da Conta: </b> <c:out value="${account.user.name}" /> </h5>
                                <a class="btn btn-primary btn-sm" href="" style="background-color: lightslategrey; border: lightslategrey">Selecionar</a>
                            </a>
                        </div>
                    </c:forEach>
                </c:if>
            </div>
            <br>
        </div>
    </div>
<script src="../webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="../webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
