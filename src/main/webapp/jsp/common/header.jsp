<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />


<div class="header" style="border-bottom:1px solid #ccc; padding:10px;">
  <b>User:</b> ${sessionScope.username}
  |
  <b>Role:</b> ${sessionScope.role}
  |
  <a href="${pageContext.request.contextPath}/logout">Logout</a>
</div>

<!-- Admin Menu -->
<div class="menu">
<c:if test="${sessionScope.role == 'ADMIN'}">
  <ul>
    <li><a href="${pageContext.request.contextPath}/admin/dashboard">Dashboard</a></li>
    <li><a href="${pageContext.request.contextPath}/admin/shopkeepers">Manage Shopkeepers</a></li>
    <li><a href="${pageContext.request.contextPath}/admin/products">View Products</a></li>
  </ul>
</c:if>
</div>

<!-- Sub-Admin Menu -->
<div class="menu">
<c:if test="${sessionScope.role == 'SUB_ADMIN'}">
  <ul>
    <li><a href="${pageContext.request.contextPath}/subadmin/dashboard">Dashboard</a></li>
    <li><a href="${pageContext.request.contextPath}/subadmin/products">Manage Products</a></li>
  </ul>
</c:if>
</div>
<hr/>

<div class="container">
