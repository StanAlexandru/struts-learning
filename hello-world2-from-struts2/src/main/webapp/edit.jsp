<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>	
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Person</title>
</head>
<body>

<h2>Edit Person Details</h2>

	<s:form action="editPerson">
		<s:textfield key="personBean.firstName"/>
		<s:textfield key="personBean.lastName"/>
			
		<s:select headerKey="personBean.favoriteSport" list="favoriteSports" name="personBean.favoriteSport" value="defaultFavoriteSport"/>
		
		<s:radio key="personBean.gender" list="genders" value="defaultGender" />
		
		<s:select key="personBean.residency" list="states" value="defaultState" listKey="stateAbbr" listValue="stateName" />
		
		<s:checkbox key="personBean.over21" value="defaultOver21"/>
		
		<s:checkboxlist key="personBean.ownedCarModels" list="carModelsAvailable" value="defaultOwnedCarModels"/>

		<s:submit key="saveChanges"/>
	</s:form>
	
	<hr/>
	<p><a href="<s:url action='index' />" >Home</a></p>
</body>
</html>