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
 <script src="/happychoice/resources/js/hc_reg.js"></script>
</head>
<body>
 <input type="button" onclick="location.href='./reg/reg_food.jsp'" value="新規登録">
 <form action="/happychoice/food/allChange" name="allFoodForm" method="post" enctype="multipart/form-data">
  <input type="file" name="foodImgList" multiple="multiple" />
  <input type="submit" value="一括更新" />
 </form>
 <form action="/happychoice/food/change" name="foodForm" method="post" enctype="multipart/form-data">
  <input type="hidden" name="foodId" value="" />
  <input type="hidden" name="foodImgFile" value="" />
   <table style="border: 1px;">
   <thead>
    <tr>
     <th style="border-color: #EE0000"><font color="#FFFFFF">画像</font></th>
     <th style="border-color: #EE0000"><font color="#FFFFFF">食品ID</font></th>
     <th style="border-color: #EE0000"><font color="#FFFFFF">食品名</font></th>
     <th style="border-color: #EE0000"><font color="#FFFFFF">更新用画像</font></th>
     <th style="border-color: #EE0000"><font color="#FFFFFF"></font></th>
    </tr>
   </thead>
   <c:forEach items="${foodForm.foodList}" var="item" varStatus="loop">
    <tr>
     <td><img src="data:image/png;base64,${item.foodImg}"></td>
     <td>${item.foodId}</td>
     <td><input type="text" name="foodName" value="${item.foodName}" /></td>
     <td><input type="file" name="foodImg" value="" accept="image/png" /></td>
     <td><input type="button"  value="更新"  onclick="setFoodId(${item.foodId}, ${loop.index});" disabled /></td>
    </tr>
   </c:forEach>
  </table>
 </form>
</body>
</html>