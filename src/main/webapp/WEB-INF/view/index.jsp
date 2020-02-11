<%--
  Created by IntelliJ IDEA.
  User: lucasgil
  Date: 10/02/20
  Time: 16:44
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
    <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
    <div class=" col-md-6 col-md-offset-3">
        <h1 class="text-center">Sistemas de Transferencia Finaceiras</h1>
        <h2 class="text-center">Selecione um Usuario</h2>
        <c:if test="${not empty allUsers}">
            <c:forEach items="${allUsers}" var="user">
                <table class="table table-hover">
                    <h3>${user.name}</h3>
                    <thead>
                        <a href="initial/${user.id}" class="btn btn btn-primary">Selecionar</a>
                    </thead>
                </table>
            </c:forEach>
        </c:if>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
