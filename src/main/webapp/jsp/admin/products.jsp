<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>

<jsp:include page="/jsp/common/header.jsp" />

<h2>Products (View Only)</h2>

<c:if test="${empty products}">
    <p>No products available</p>
</c:if>

<c:if test="${not empty products}">
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Category</th>
    </tr>

    <c:forEach var="p" items="${products}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.category}</td>
        </tr>
    </c:forEach>
</table>
</c:if>

<jsp:include page="/jsp/common/footer.jsp" />

</body>
</html>