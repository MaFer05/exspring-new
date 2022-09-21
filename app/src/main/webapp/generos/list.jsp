<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=<device-width>, initial-scale=1.0">
        <title>Gêneros</title>
    </head>
    <body>
        <h1>Gêneros</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>NOME</th>
            </tr>
            <c:forEach var="g" items="${generos}">
                <tr>
                    <td>${g.id}</td>
                    <td>${g.nome}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>