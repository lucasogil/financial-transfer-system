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
    <link rel="stylesheet" href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body style="background-color: #B3C8C8">
    <div class=" col-md-6 col-md-offset-3">
        <h1 class="text-center">Sistemas de Transferencia Finaceiras</h1>
        <h2 >Lista de Usuarios</h2>
        <table class="table table-striped">
            <thead style="background-color: lightslategrey" >
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Opções</th>
            </tr>
            </thead>
            <c:if test="${not empty allUsers}">
                <c:forEach items="${allUsers}" var="user">
                    <tbody>
                        <tr>
                            <th scope="row"><c:out value="${user.id}" /> </th>
                            <td><c:out value="${user.name}" /></td>
                            <td>
                                <a class="btn btn-primary btn-xm" href="../usuario/${user.id}" style="background-color: lightslategrey; border: lightslategrey" >Realizar Transferencia</a>
                                <a class="btn btn-primary btn-xm" href="../usuario/${user.id}/history" style="background-color: lightslategrey; border: lightslategrey" >Historico</a>
                            </td>
                        </tr>
                    </tbody>
                </c:forEach>
            </c:if>
        </table>
    </div>
    <script src="../webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="../webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
