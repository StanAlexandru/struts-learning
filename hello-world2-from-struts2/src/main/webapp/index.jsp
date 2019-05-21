<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<h2>Hello World!</h2>



<p><a href="<s:url action='editPerson'/>" >Edit Person Details</a></p>

<hr/>
<a href='<s:url action="index" namespace="config-browser" />'>Launch the configuration browser</a>

</body>
</html>
