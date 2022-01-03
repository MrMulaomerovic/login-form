
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Third</title>
</head>
<body>
<form action="Servlet" method="post">

    <input hidden type="text" name= "firstName" value="${param.firstName}">
    <input hidden type="text" name="lastName" value="${param.lastName}">
    <input hidden type="text" name= "streetName" value="${param.streetName}">
    <input hidden type="text" name="streetNo" value="${param.streetNo}">

      Profession :
      <input type="text" name="profesija">


      <input type="submit" value="Send Data">
    <input type="submit" value="Prev Page" onclick="this.form.action='seconde.jsp'">

</form>
</body>
</html>
