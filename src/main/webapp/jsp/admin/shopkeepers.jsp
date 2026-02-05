<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/jsp/common/header.jsp" />

<h2>Shopkeepers</h2>

<c:if test="${empty shopkeepers}">
    <p>No shopkeepers available</p>
</c:if>

<c:if test="${not empty shopkeepers}">
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Mobile</th>
        <th>Action</th>
    </tr>

    <c:forEach var="s" items="${shopkeepers}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.mobile}</td>
            <td>
                <a href="edit-shopkeeper?id=${s.id}">Edit</a> |
                <a href="delete-shopkeeper?id=${s.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</c:if>

<p><a href="${pageContext.request.contextPath}/admin/add-shopkeeper">
    Add Shopkeeper
</a></p>

<br><br>

<jsp:include page="/jsp/common/footer.jsp" />
