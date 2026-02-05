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

<h2>Add Shopkeeper</h2>

<form method="post"
      action="${pageContext.request.contextPath}/admin/add-shopkeeper">

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
            <td>Mobile:</td>
            <td><input type="text" name="mobile" required /></td>
        </tr>

        <tr>
            <td colspan="2">
                <button type="submit">Add Shopkeeper</button>
                &nbsp;
                <a href="${pageContext.request.contextPath}/admin/shopkeepers">
                    Cancel
                </a>
            </td>
        </tr>
    </table>
</form>

<jsp:include page="/jsp/common/footer.jsp" />

</body>
</html>