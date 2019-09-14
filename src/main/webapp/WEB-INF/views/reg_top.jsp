<!DOCTYPE html>
<?xml version="1.0" encoding="UTF-8"?>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
 <title>HappyChoice_TOP</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge" />
 <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
</head>
<body>
 <form action="/happychoice/food/regFood" name="foodForm" method="post" enctype="multipart/form-data">
   <table>
    <c:forEach items="${foodForm.foodList}" var="item" varStatus="loop">
     <tr><td>食品ID</td><td>${foodForm.foodId}</td></tr>
     <tr><td>食品名</td><td><input type="text" name="foodName" value="${foodForm.foodName}" /></td></tr>
     <tr><td>画像データ</td><td><input type="file" name="foodImg" /></td></tr>
    </c:forEach>
   </table>
   <input type="submit" value="登録">
 </form>
</body>
</html>