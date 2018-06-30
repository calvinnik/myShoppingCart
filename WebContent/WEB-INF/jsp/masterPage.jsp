<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>MyShop | ${title}</title>


<!-- BOOTSTRAP CDN's -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>


<!-- Custome CSS -->

<style type="text/css">
html {
	height: 100%;
}
body {
	height: 100%;
}

.containe {
	min-height: 100%;
	position: relative;
}

}

footer{
	margin: 0;
}

#footer {
	position: absolute;
	bottom: 0px;
	height: 60px;
}

.content{
	padding-bottom: 60px;
}
</style>
</head>

<body>
	<div class="container containe">
		<!--Including Navigation Bar here -->

		<%@include file="./common/navigationBar.jsp"%>


		<!-- Page Content -->
		<div class="content">
			<!-- Inclusion of the HomePage -->
			<c:if test="${homeTrue == true}">
				<%@include file="./homePage.jsp"%>
			</c:if>

			<!-- Inclusion of the AboutUs -->
			<c:if test="${aboutTrue == true}">
				<%@include file="./aboutUs.jsp"%>
			</c:if>

			<!-- Inclusion of the ContactUs -->
			<c:if test="${contactTrue == true}">
				<%@include file="./contactUs.jsp"%>
			</c:if>

		</div>


		<!-- Including the Footer here -->

		<%@include file="./common/footer.jsp"%>

	</div>


	<!-- Start of custom JS -->
	<script type="text/javascript">
		window.page = '${title}';

		$(document).ready(function() {
			switch (page) {
			case 'About Us':
				$('#about').addClass('active');
				break;

			case 'Contact Us':
				$('#contact').addClass('active');
				break;

			case 'Home':
				$('#home').addClass('active');
				break;
			}
		});
	</script>
</body>

</html>
