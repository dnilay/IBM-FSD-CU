<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Scriptet--%>
<%
    List<String> list= (List<String>) request.getAttribute("errors");
    if (list!=null)
    {
        out.println("connect the bellow errors<br/>");
        for(String s:list)
        out.println("<font color='red'>"+s+"</font><br/>");
    }

%>
<form action="controller.do" method="post">
    <label>Player Name:</label><input type="text" name="pName"><br/>
    <label>Player Age:</label><input type="text" name="pAge"><br/>
    <label>Team</label><select name="pTeam">
    <option value="UNKNOWN">Select..</option>
    <option value="Kolkata Knight Rider">Kolkata Knight Rider</option>
    <option value="Hyderabad Sunrise">Hyderabad Sunrise</option>
    <option value="Chennai Super Kings">Chennai Super Kings</option>
</select><br/>
    <input type="submit" value="Add A New Player">
</form>
</body>
</html>
