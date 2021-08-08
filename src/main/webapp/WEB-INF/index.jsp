<%--
  Created by IntelliJ IDEA.
  User: cindanojonathan
  Date: 08/08/2021
  Time: 01:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Facturation</title>
</head>
<body>
    <h1>Application de facturation de clients</h1>
    <h2>Liste des Clients</h2>
    <form action="index" method="get">

    </form>

    <table>
        <tr>
            <td>Nom</td>
            <td>Facture</td>
            <td>Actions</td>
        </tr>
        <c:forEach var="client" items="${clients}">
            <tr>
                <td>Client${client.id}</td>
                <td>Client${client.id}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
