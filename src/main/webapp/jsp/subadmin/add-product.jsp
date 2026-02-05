<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/jsp/common/header.jsp" />

<h2>Add Product</h2>

<form method="post"
      action="${pageContext.request.contextPath}/subadmin/add-product">

    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id" required /></td>
        </tr>

        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" required /></td>
        </tr>

        <tr>
            <td>Price:</td>
            <td><input type="text" name="price" required /></td>
        </tr>
        
        <tr>
            <td>Category:</td>
            <td><input type="text" name="category" required /></td>
        </tr>

        <tr>
            <td colspan="2">
                <button type="submit">Add Product</button>
                &nbsp;
                <a href="${pageContext.request.contextPath}/subadmin/products">
                    Cancel
                </a>
            </td>
        </tr>
    </table>
</form>

<jsp:include page="/jsp/common/footer.jsp" />

</body>
</html>