<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rect" tagdir="/WEB-INF/tags" %>
<html>
  <body>
  <table cellspacing="1" cellpadding="1" width="20%"  border="0">
      <tr valign="bottom">
          <td><a href="/index.jsp"><font size=3>Calcular el área de un rectángulo</font> </a> </td>
          <td><a href="/index2.jsp"><font size=3>Calcular el área del círculo</font> </a> </td>
      </tr>
  </table>
    <p>Ingrese la longitud y el ancho del rectángulo:
    <FORM action="" method=get name=form>
      <table>
        <tr>
          <td>Ingrese el valor largo:</td>
          <td><input type="text" name="l"></td>
        </tr>
        <tr>
          <td>Ingrese el valor de ancho:</td>
          <td><input type="text" name="w"></td>
        </tr>
      </table>

      <br><input type="submit" value="enviar" name=submit>
    </FORM>
    <%
        String l = request.getParameter("l");
        String w = request.getParameter("w");
        if (l!=null&&w!=null){
    %>      <rect:Rect longg="<%=l%>" width="<%=w%>"/>
            <br><%=message%>
            <br><%=area%>
  <%
        }
    %>
  </body>
</html>