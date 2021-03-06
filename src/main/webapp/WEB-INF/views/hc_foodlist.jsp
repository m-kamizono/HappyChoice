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
 <title>Happy Choice</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge" />
 <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
 <link rel="apple-touch-icon" href="/happychoice/resources/img/happychoice_icon.png">
 <link rel="stylesheet" href="resources/css/_cmn.css" />
 <link rel="stylesheet" href="resources/css/hc_foodlist.css" />
 <script src="resources/js/hc_foodlist.js"></script>
</head>
<body>
 <section class="container">
  <section class="header">
   <div class="iconBox">
    <div class="icon">
     <c:if test="${empty foodListForm.foodType}">
      <img src="/happychoice/resources/img/foodSearch.png" alt="">
     </c:if>
     <c:if test="${!empty foodListForm.foodType}">
      <img src="/happychoice/resources/img/foodTypeIcon_${foodListForm.foodType}.png" alt="">
     </c:if>
    </div>
    <div class="icon"></div>
    <div class="icon">
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
   <input type="hidden" id="foodlist_sort" value="<c:forEach items="${foodListForm.foodList}" var="food" varStatus="sts"><c:if test="${sts.index>0}">,</c:if>${sts.index}</c:forEach>" />
    <ul class="foodlist" id="foodlist_ul">
      <c:forEach items="${foodListForm.foodList}" var="item" varStatus="sts">
       <li id="foodlist_li_${sts.index}">
        <div>
         <img src="data:image/png;base64,${item.foodImg}" alt="" onclick="foodId(${item.foodId});" />
         <p>${item.foodName}</p>
        </div>
       </li>
      </c:forEach>
    </ul>
   </div>
   <div class="btn" onclick="history.back()">戻る</div>
  </section>
 </section>
 <div style="display: none;">
  <form:form action="/happychoice/foodrecom" name="foodRecomForm" method="post" enctype="multipart/form-data">
   <input type="hidden" name="foodId" value="" />
   <input type="hidden" name="characterNum" value="${foodListForm.characterNum}" />
  </form:form>
 </div>
</body>
</html>
