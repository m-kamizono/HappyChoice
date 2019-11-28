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
 <title>HappyChoice_FoodRecom</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge" />
 <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
 <link rel="stylesheet" href="/happychoice/resources/css/_cmn.css" />
 <link rel="stylesheet" href="/happychoice/resources/css/hc_foodrecom.css" />
</head>
<body>
 <section class="container">
  <!-- 相方表示画面の全体領域確保 -->
  <!-- この中に書く -->
  <section class="header">
   <div class="logo">
    <img src="/happychoice/resources/img/hc_recom.png" alt="" />
   </div>
  </section>
  <section class="contents">
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
    <p>${foodRecomForm.selectedFoodEty.lessNutMsg}</p>
   </div>
   <div class="chara-area">
    <img src="/happychoice/resources/img/hc_chara${foodRecomForm.characterId}.png" alt="" />
   </div>
  </div>
  <div class="btn-area">
   <div class="btn" onclick="history.back()">戻る</div>
   <div class="btn" onclick="location.href='hc_top.jsp'">TOP</div>
  </div>
 </section>
</body>
</html>