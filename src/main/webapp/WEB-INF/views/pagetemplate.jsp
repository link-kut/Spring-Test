<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<html>
	<head>
		<title> - GeekWarez</title>
		<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.4.0/build/reset-fonts-grids/reset-fonts-grids.css" />
		<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.4.0/build/base/base-min.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/styles.css" />

	</head>
	<body>
		<div id="doc">
			<div id="hd">
				<div class="banner">GeekWarez<br />Your Source for All Things Geek</div>
				<div>
					<a href="${contextPath}/home">Home</a> |
					<a href="${contextPath}/checkout">Checkout</a> |
					<a href="${contextPath}/account/register">Create Account</a> |
					<a href="${contextPath}/account/login">Login</a>
				</div>
			</div>

			<div id="ft">
				<div>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</div>
				<div>
					<a href="${contextPath}/home">Home</a> |
					<a href="${contextPath}/about.html">About</a> |
					<a href="${contextPath}/contact.html">Contact</a> |
					<a href="${contextPath}/legal.html">Legal</a>
				</div>
			</div> 
		</div>
	</body>
</html>
