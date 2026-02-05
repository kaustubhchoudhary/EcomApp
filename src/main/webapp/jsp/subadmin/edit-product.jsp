<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Product</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/jsp/common/header.jsp" />

<h2>Edit Product</h2>

<form method="post"
      action="${pageContext.request.contextPath}/subadmin/update-product">

  <input type="hidden" name="id" value="${product.id}" />

  Name:
  <input type="text" name="name"
         value="${product.name}" /><br><br>

  Price:
  <input type="text" name="price"
         value="${product.price}" /><br><br>

  Category:
  <input type="text" name="category"
         value="${product.category}" /><br><br>

  <button>Update Product</button>
</form>

<jsp:include page="/jsp/common/footer.jsp" />

</body>
</html>