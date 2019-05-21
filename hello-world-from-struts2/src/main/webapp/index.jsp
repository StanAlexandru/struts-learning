<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome from Struts 2 - Welcome</title>
</head>
<body>
	<h1>Welcome from Struts 2!</h1>

	<p>
		<a href="<s:url action='helloworld'/>">Hello World!</a>
	</p>

	<s:url action='helloworld' var="helloWorldLink">
		<s:param name="messageStore.username">John</s:param>
	</s:url>
	<p>
		<a href="${helloWorldLink}">Hello John</a>
	</p>

	<p>Get your own personal hello by filling out and submitting this
		form.</p>

	<s:form action="helloworld">
		<s:textfield name="messageStore.username" label="Username" />
		<s:submit value="Submit" />
	</s:form>

	<s:url action="register" var="registerLink" >
		<s:param name="request_locale">en</s:param>
	</s:url>
	<p>
		<a href="${registerLink}">Please register</a> for our prize drawing.
	</p>


	<s:url action="register" var="registerInputLinkES">
		<s:param name="request_locale">es</s:param>
	</s:url>
	<p>
		<a href="${registerInputLinkES}">Por favor, regístrese</a> para nuestro sorteo
	</p>

	<hr />
	<s:url action="downloadFile" var="downloadFileLink" />
	<p>
		<a href="${downloadFileLink}">Download File</a>
	</p>

	<hr />
	<a href='<s:url action="index" namespace="config-browser" />'>Launch the configuration browser</a>

	<hr />
	<s:text name="contact" />

</body>
</html>