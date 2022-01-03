
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Seconde</title>
</head>
<body>

<%
   String name =  request.getParameter("firstName");
   String lastname = request.getParameter("lastName");
%>
<form action="third.jsp" method="post">

    <input hidden type="text" name= "firstName" value="<%=name%>">
    <input hidden type="text" name="lastName" value="${param.lastName}">

        Street Name :
        <input type="text" name="streetName">

        Street Number :
       <input type="number" name="streetNo">

    <input type="submit" value="Prev Page" onclick="this.form.action='index.jsp'">

    <input type="submit" value="Next Page">

</form>

</body>
</html>
