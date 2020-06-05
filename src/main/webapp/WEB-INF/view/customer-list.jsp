<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>

<html>

<head>
    <link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <title>List Customers</title>

    <!-- reference our style sheet -->

    <link type="text/css"
          rel="stylesheet"
          href="css/style.css" />

</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>
    <input type="button" onclick="window.location.href='showFormForAdd'; return false"
    class="add-button" value="Add New Customer">
<br/><br/>
<div id="container">
    <div id="content">
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Email</th>
            </tr>

            <c:forEach var="tempCustomer" items="${customers}">

            <tr>
                <td> ${tempCustomer.firstName} </td>
                <td> ${tempCustomer.lastName} </td>
                <td> ${tempCustomer.email} </td>
            </tr>

            </c:forEach>

        </table>

    </div>

</div>


</body>

</html>







