<%@ page language="java" contentType="text/html; charset=utf-8" 
pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>WebSample</title>
</head>
<body>
<div><h2>Get Form</h2></div>
<form name="doGet" method="get" action="/device/user">
	<div>userId=<input type="text" name="userId" value="${userId}"></div>
	<div>userName=<input type="text" name="userName" value="${userName}"></div>
	<div>divisionCd=<input type="text" name="divisionCd" value="${divisionCd}"></div>
	<div>departmentCd=<input type="text" name="departmentCd" value="${departmentCd}"></div>
	<div>deviceCd=<input type="text" name="deviceCd" value="${deviceCd}"></div>
	<div>imei=<input type="text" name="imei" value="${imei}"></div>
	<div>dstUserId=<input type="text" name="dstUserId" value="${dstUserId}"></div>
	<div>dstGroupCd=<input type="text" name="dstGroupCd" value="${dstGroupCd}"></div>
	<div>groupWhileCd=<input type="text" name="groupWhileCd" value="${groupWhileCd}"></div>
	<input type="submit" value="submit"> 
</form>
<hr>
<div><h2>Post Form</h2></div>
<form name="doPost" method="post" action="/pc/user">
	<div>userId=<input type="text" name="userId" value="${userId}"></div>
	<div>userName=<input type="text" name="userName" value="${userName}"></div>
	<div>divisionCd=<input type="text" name="divisionCd" value="${divisionCd}"></div>
	<div>departmentCd=<input type="text" name="departmentCd" value="${departmentCd}"></div>
	<div>deviceCd=<input type="text" name="deviceCd" value="${deviceCd}"></div>
	<div>imei=<input type="text" name="imei" value="${imei}"></div>
	<div>dstUserId=<input type="text" name="dstUserId" value="${dstUserId}"></div>
	<div>dstGroupCd=<input type="text" name="dstGroupCd" value="${dstGroupCd}"></div>
	<div>groupWhileCd=<input type="text" name="groupWhileCd" value="${groupWhileCd}"></div>
	<input type="submit" value="submit"> 
</form>
</body>
</html>