<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <title>process form</title>
</head>
<body>
<div class="container">
    <p>displaying student details</p>
    Student First Name:${student.firstName}<br/>
    Student Last Name:${student.lastName}<br/>
    Student Email:${student.email}<br/>
    Country:${student.country}<br/>
    OS:
    <c:forEach var="os" items="${student.operatingSystems}">
        ${os}
    </c:forEach>
<br/>
    Faveroute language:${student.language}
</div>
</body>
</html>
