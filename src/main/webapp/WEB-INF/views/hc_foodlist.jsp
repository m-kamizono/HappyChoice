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
     <!-- TODO: ライス固定になっているのでfoodTypeから画像を表示する -->
     <img src="resources/img/rice.png" alt="">
    </div>
    <div class="icon"></div>
    <div class="icon">
     <!-- TODO: オンクリックでjava側でListの並び順を逆にして画面を読み込む -->
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
    <table class="foodtype-tbl">
     <!-- TODO: forEachの処理が微妙なので書き換える -->
     <tr>
      <c:forEach items="${foodListForm.foodList}" var="item" varStatus="loop">
       <c:if test="${not loop.first and loop.index % 3 == 0}">
     </tr>
     <tr>
      </c:if>
      <td>
       <div>
        <!-- TODO: byte[]から画像表示（拡張子はpng） -->
        <img src="o.write(${item.foodImg});" />
        <img src="resources/img/sabanomisoni.png" alt="" onclick="foodId(${item.foodId});" />
        <p>${item.foodName}</p>
       </div>
      </td>
      </c:forEach>
     </tr>
    </table>
    <!-- TODO: 戻るボタンにブラウザバックの処理をさせる -->
    <div class="backButton">戻る</div>
   </div>
  </section>
 </section>
 <div style="display: none;">
  <form:form action="/HappyChoice/testHappyChoice" name="foodListForm" method="post" enctype="multipart/form-data">
   <input type="hidden" name="foodId" value="" />
  </form:form>
 </div>
</body>
</html>
