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
 <title>HappyChoice</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge" />
 <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
 <link rel="apple-touch-icon" href="/happychoice/resources/img/happychoice_icon.png">
 <link rel="stylesheet" href="/happychoice/resources/css/_cmn.css" />
 <link rel="stylesheet" href="/happychoice/resources/css/hc_foodrecom.css" />
</head>
<body>
 <section class="container">
  <!-- 相方表示画面の全体領域確保 -->
  <section class="header">
   <div class="logo">
    <img src="/happychoice/resources/img/hc_recom.png" alt="" />
   </div>
  </section>
  <section class="contents">
   <div class="select-food">
   <div class="img-area">
     <img src="data:image/png;base64,${foodRecomForm.selectedFoodEty.foodImg}" alt="" />
    </div>
    <div class="text-area">
     <p class="left">${foodRecomForm.selectedFoodEty.foodName}は</p>
     <p class="center"><c:forEach items="${foodRecomForm.selectedFoodEty.lessNutNames}" var="item" varStatus="sts">${item}<c:choose><c:when test="${sts.count % 2 == 0 and !sts.last}"><br></c:when><c:when test="${!sts.last}">、</c:when></c:choose></c:forEach></p>
     <p class="right">が不足しているよ！</p>
    </div>
   </div>
   <div class="scrollable‐box">
    <ul class="recomfoodlist">
     <c:forEach items="${foodRecomForm.recomFoodEtyList}" var="item" varStatus="sts">
      <li>
       <div>
        <img src="data:image/png;base64,${item.foodImg}" alt="" />
        <p>${item.foodName}</p>
       </div>
      </li>
     </c:forEach>
    </ul>
   </div>
  </section>
  <div class="fuki-area">
   <div class="fuki-back">
    <p>不足している栄養素を<br>補う食品を食べよう！</p>
   </div>
   <div class="chara-area">
    <img src="/happychoice/resources/img/hc_chara${foodRecomForm.characterNum}.png" alt="" />
   </div>
  </div>
  <div class="btn-area">
   <div class="btn" onclick="history.back()">戻る</div>
   <div class="btn" onclick="location.href='./'">TOP</div>
  </div>
 </section>
</body>
</html>