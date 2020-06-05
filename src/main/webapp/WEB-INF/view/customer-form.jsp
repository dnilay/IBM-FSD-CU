<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <title>Save Customer</title>

    <link type="text/css"
          rel="stylesheet"
          href="css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="css/add-customer-style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">
    <h3>Save Customer</h3>

    <form:form action="saveCustomer" modelAttribute="customer" method="POST">
        <form:hidden path="id" />
        <div class="form-group">
            <label>First name:</label>
            <form:input path="firstName"/>

        </div>
        <br/>
        <div class="form-group">
            <label>Last name:</label>
            <form:input path="lastName"/>

        </div>
        <br/>
        <div class="form-group">
            <label>Email:   </label>
            <form:input path="email"/>
        </div>
        <br/>
        <input type="submit" value="Save" class="save"/>
    </form:form>

    <p>
        <a href="${pageContext.request.contextPath}/customer/listCustomer">Back to List</a>
    </p>

</div>

</body>

</html>








