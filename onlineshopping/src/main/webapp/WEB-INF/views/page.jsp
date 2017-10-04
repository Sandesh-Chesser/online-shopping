<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="root" value="${pageContext.request.contextPath }" />
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />
<spring:url value="/resources/images" var="images" />
<title>Online Shopping - ${title }</title>
<script>
	window.menu = "${title }";
	window.contextRoot = "${root }";
</script>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="${css}/bootstrap.min.css" />

<!-- Bootstrap dataTable CSS -->
<link rel="stylesheet" type="text/css" href="${css}/dataTables.jqueryui.min.css" />

<!-- Page related CSS -->
<link rel="stylesheet" type="text/css" href="${css}/shop-homepage.css" />

</head>

<body>
<div id="wrapper_body">
	<!-- Navigation -->
	<%@ include file="./fragments/navbar.jsp" %>

	<!-- Page Content -->
	<c:if test="${userClickHome == true }">
		<%@ include file="home.jsp" %>
	</c:if>
	<c:if test="${userClickAbout == true }">
		<%@ include file="about.jsp" %>
	</c:if>
	<c:if test="${userClickContact == true }">
		<%@ include file="contact.jsp" %>
	</c:if>
	<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
		<%@ include file="listProducts.jsp" %>
	</c:if>
	<c:if test="${userClickShowProduct == true }">
		<%@ include file="singleProduct.jsp" %>
	</c:if>
	<!-- Footer -->
	<%@ include file="./fragments/footer.jsp" %>
	<!-- Bootstrap core JavaScript -->
	<%@ include file="/WEB-INF/views/fragments/cdns.jsp" %>
	<script src="${js}/jquery.dataTables.min.js"></script>
	<script src="${js}/dataTables.jqueryui.min.js"></script>
	<script src="${js}/myapp.js"></script>
</div>
</body>

</html>
