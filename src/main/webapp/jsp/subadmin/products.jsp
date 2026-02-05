<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/jsp/common/header.jsp" />

<h2>Product List</h2>

<c:if test="${empty products}">
    <p>No products available</p>
</c:if>

<c:if test="${not empty products}">
<table border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Price</th><th>Category</th><th>Action</th>
    </tr>

    <c:forEach var="p" items="${products}">
        <tr>
            <td><c:out value="${p.id}" /></td>
            <td><c:out value="${p.name}" /></td>
            <td><c:out value="${p.price}" /></td>
            <td><c:out value="${p.category}" /></td>
            <td>
                <a href="edit-product?id=${p.id}">Edit</a> |
                <a href="delete-product?id=${p.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</c:if>

<p><a href="${pageContext.request.contextPath}/subadmin/add-product">
    Add Product
</a></p>

<jsp:include page="/jsp/common/footer.jsp" />
