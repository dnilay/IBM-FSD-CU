<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student" method="post">
    <label>first name</label><form:input path="firstName"/><br/>
    <label>last name</label><form:input path="lastName"/><br/>
    <label>email</label><form:input path="email"/><br/>
    <input type="submit">
</form:form>
</body>
</html>
