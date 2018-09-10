<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listing Trainee</title>
</head>
<body>
<h1>Listing all</h1>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border="6">
    <c:forEach var="tr" items="${tlist}">
        <tr>
            <td>${tr.id}</td>
            <td>${tr.name}</td>
            <td>${tr.domain}</td>
            <td>${tr.location}</td>
        </tr>
    </c:forEach>        
</table>
</body>
</html>
