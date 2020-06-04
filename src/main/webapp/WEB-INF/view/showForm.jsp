<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <title>student form</title>
</head>
<body>
<div class="input-group mb-3">

    <form:form action="processForm" modelAttribute="student" method="post">
        First Name:<form:input path="firstName" cssClass="text"/><br/>
        Last Name<form:input path="lastName" cssClass="text"/><br/>
        Email:<form:input path="email" cssClass="text"/><br/>
        Country:<form:select path="country">
        <form:options items="${student.map}"/>
    </form:select><br/>Operating Systems:
        Linux<form:checkbox path="operatingSystems" value="Linux"/>
        MS-Windows<form:checkbox path="operatingSystems" value="MS-WIndows"/>
        Android<form:checkbox path="operatingSystems" value="Android"/>
        IOS<form:checkbox path="operatingSystems" value="IOS"/><br/>
        Favourite Language:<br/>Java<form:radiobutton path="language" value="Java"/>
        C#<form:radiobutton path="language" value="C#"/>
        Python<form:radiobutton path="language" value="Python"/><br/>
        <input type="submit" class="btn btn-primary">
    </form:form>

</div>
</body>
</html>
