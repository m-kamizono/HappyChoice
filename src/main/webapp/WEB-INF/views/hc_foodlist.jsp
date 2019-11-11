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
<title>HappyChoice_FoodList</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
<link rel="stylesheet" href="resources/css/_cmn.css" />
<link rel="stylesheet" href="resources/css/hc_foodlist.css" />
<script src="resources/js/hc_foodlist.js"></script>
</head>
<body>
 <section class="container">
  <section class="header">
   <div class="iconBox">
    <div class="icon">
     <img src="/happychoice/resources/img/foodTypeIcon_${foodListForm.foodType}.png" alt="">
    </div>
    <div class="icon"></div>
    <div class="icon">
     <!-- TODO: 並び替え -->
     <div onclick="ascdscFood();" class="foodSort">
      <div class="foodSort-inl-l">
       <div id="ascFood">A</div>
       <div id="dscFood">Z</div>
      </div>
      <div class="foodSort-inl-r">↓</div>
     </div>
    </div>
   </div>
  </section>
  <section class="contents">
   <div class="scrollable‐box">
    <ul class="foodlist-ul">
      <c:forEach items="${foodListForm.foodList}" var="item" varStatus="loop">
       <li>
        <div>
         <img src="data:image/png;base64,${item.foodImg}" alt="" onclick="foodId(${item.foodId});" />
         <p>${item.foodName}</p>
        </div>
       </li>
      </c:forEach>
    </ul>
    <div class="backButton" onclick="history.back()">戻る</div>
   </div>
  </section>
 </section>
 <div style="display: none;">
  <form:form action="/happychoice/foodrecom" name="foodListForm" method="post" enctype="multipart/form-data">
   <input type="hidden" name="foodId" value="" />
   <input type="hidden" name="characterId" value="${foodListForm.characterId}" />
  </form:form>
 </div>
</body>
</html>
