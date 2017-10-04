<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath }" />
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />
<spring:url value="/resources/images" var="images" />
<title>${title }</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="${css}/bootstrap.min.css" />

<!-- Page related CSS -->
<link rel="stylesheet" type="text/css" href="${css}/shop-homepage.css" />
</head>
<body>
	<div id="wrapper_body">
		<!-- Navigation -->
		<%@ include file="./fragments/navbar.jsp" %>
		
		<div class="container" id="container">
			<div class="jumbotron">
				<h2>${errorTitle }</h2>
				<hr />
				<blockquote class="blockquote">
					${errorDescription }
				</blockquote>
			</div>
		</div>
		
		<!-- Footer -->
		<%@ include file="./fragments/footer.jsp" %>
		
		<!-- Bootstrap core JavaScript -->
		<%@ include file="/WEB-INF/views/fragments/cdns.jsp" %>
		<script src="${js}/myapp.js"></script>
	</div>
</body>
</html>