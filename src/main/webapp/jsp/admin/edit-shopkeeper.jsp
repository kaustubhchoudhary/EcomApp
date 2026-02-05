<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Shopkeeper</title>
</head>
<body>

<jsp:include page="/jsp/common/header.jsp" />

<h2>Edit Shopkeeper</h2>

<form method="post"
      action="${pageContext.request.contextPath}/admin/update-shopkeeper">

    <input type="hidden" name="id" value="${shopkeeper.id}" />

    Name:
    <input type="text" name="name" value="${shopkeeper.name}" /><br><br>

    Mobile:
    <input type="text" name="mobile" value="${shopkeeper.mobile}" /><br><br>

    <button>Update</button>
</form>

<jsp:include page="/jsp/common/footer.jsp" />

</body>
</html>