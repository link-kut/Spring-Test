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
	Person cmkim = (Person) ctx.getBean ( "cm");
%>
<%= "[name ="+ cmkim.getName () + "]"%>
<%= cmkim.getMusicTitle()%>
<%

	//cmkim.listenMusic ();
%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
