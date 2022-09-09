<%-- 
    Document   : calcu
    Created on : 
    Author     : Adrian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Numeros pares</title>
</head>
<body>
       <%
             int numero = 2;
             int suma = 0;
             for (int i = 0; i < 100; i++){
                    out.println(numero);
                    suma = suma + numero;
                    numero = numero + 2;
             }
             out.println("<p>Suma total: " + suma + "</p>");
       %>
</body>
</html>