<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page session="false" %>
<%@ page import="link.thinkonweb.spring.Person"%>
<%@ page import="link.thinkonweb.spring.Player"%>

<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%
	ApplicationContext ctx = new ClassPathXmlApplicationContext("link/thinkonweb/spring/beans.xml");

%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

		<div id="bd" class="yui-t6">
			<h1>Welcome to GeekWarez</h1>
			<div id="yui-main">
				<div class="yui-b">
					<h2>Your Cart</h2>
					Your cart currently contains ${shoppingCart.itemCount} items.
					<a href="${contextPath}/spring/checkout">Checkout &raquo;</a>
				  <img class="product-thumb" src="img/git-transport.png" alt="aaa" />
					<h2>Our Products</h2>
					<table>
						<c:forEach var="product" items="${products}">
							<tr>
								<td><img class="product-thumb" src="resources/img/${product.imageUrl}" alt="${product.description}" /></td>
								<td>${product.description}</td>
								<td class="numeric">${product.priceInDollars}</td>
								<td><a href="${contextPath}/spring/addToCart?productId=${product.id}">[add to cart]</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<div class="yui-b">
				<h2>Satisfaction Guaranteed</h2>
				<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec mattis metus sed est. Pellentesque facilisis facilisis dolor. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Praesent in libero at leo porta hendrerit.</p>
				
				<h2>Return Policy</h2>
				<p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec dignissim, risus ac convallis accumsan, felis leo feugiat purus, tempor blandit nunc ante vel dui. Nullam ut turpis id magna hendrerit tempor. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
			</div>
		</div>

<div><a href="account/register">Register</a></div>
</body>
</html>
