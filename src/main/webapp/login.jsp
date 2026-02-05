<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

<%
if (session != null && session.getAttribute("role") != null) {
    String role = (String) session.getAttribute("role");
    if ("ADMIN".equals(role)) {
        response.sendRedirect(request.getContextPath() + "/admin/dashboard");
    } else {
        response.sendRedirect(request.getContextPath() + "/subadmin/dashboard");
    }
    return; // very important
}
%>

<!-- Login form starts here -->

<h2>Login</h2>

<form method="post" action="<%=request.getContextPath()%>/login">
  User-name: <input type="text" name="username" /><br><br>
  Password: <input type="password" name="password" /><br><br>
  <input type="submit" value="Login" />
</form>

</body>
</html>
