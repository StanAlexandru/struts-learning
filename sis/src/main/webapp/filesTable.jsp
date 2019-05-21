<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIS</title>
<style>
	table {
	    font-family: arial, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	}	
	td, th {
	    border: 1px solid #dddddd;
	    text-align: left;
	    padding: 8px;
	}	
	tr:nth-child(even) {
	    background-color: #dddddd;
	}
</style>
</head>
<body>

	<h1>SIS Files Table</h1> 
	
	<table>
		<tr>
		    <th>File</th>
		    <th>Download</th>
		</tr>
		<s:iterator value="tableFiles">
			<tr>
				<td>
					<s:property value="fileName" />
				</td>
				<td>
					<s:url action="downloadFile" var="downloadFileLink">
						<s:param name="filePath"><s:property value="filePath"/></s:param>
					</s:url>
					<a href="${downloadFileLink}">Download</a>
				</td>
			</tr>
		</s:iterator>
	</table>

	<p><a href="index.jsp">Home</a></p>

</body>
</html>