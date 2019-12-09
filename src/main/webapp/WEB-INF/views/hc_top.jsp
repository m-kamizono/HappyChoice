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
 <link rel="stylesheet" href="/happychoice/resources/css/_cmn.css" />
 <link rel="stylesheet" href="/happychoice/resources/css/hc_top.css" />
 <script src="/happychoice/resources/js/hc_top.js"></script>
</head>
<body>
 <section class="container"><!-- TOP画面の全体領域確保 -->
 <c:if test="${topForm.emptyResultFlg}">
  <input type="hidden" id="noSearchVal" value="noVal" />
 </c:if>
 <!-- この中に書く -->
  <div class="top-area">
   <div class="logo">
    <img src="/happychoice/resources/img/hc_logo.png" alt="" />
   </div>
   <div class="fuki-area">
    <div class="fuki-back">
     <p id="searchAlert">全角ひらがな<br/>カタカナで入力してね</p>
    </div>
    <div class="chara-area">
     <img src="/happychoice/resources/img/hc_chara${topForm.characterNum}.png" alt="" />
    </div>
   </div>
   <div class="search">
    <input type="text" name="searchWord" id="searchWord" list=""  onInput="selectSearchWordText();" onkeyup="selectSearchWordText();">
    <datalist id="foodNameKana">
     <c:forEach items="${topForm.suggestWordList}" var="item" varStatus="sts">
      <option class="word" value="${item.foodNameKana}" label="${item.foodName}"></option>
     </c:forEach>
    </datalist>
    <div class="btn" id="js-show-modal" onclick="valid();">検索</div>
   </div>
  </div>
  <table class="foodtype-tbl">
   <tr>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/foodTypeIcon_10.png" alt="" onclick="foodTypeNum(10);" />
     </div>
    </td>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/foodTypeIcon_20.png" alt="" onclick="foodTypeNum(20);" />
     </div>
    </td>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/foodTypeIcon_30.png" alt="" onclick="foodTypeNum(30);" />
     </div>
    </td>
   </tr>
   <tr>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/foodTypeIcon_40.png" alt="" onclick="foodTypeNum(40);" />
     </div>
    </td>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/foodTypeIcon_50.png" alt="" onclick="foodTypeNum(50);" />
     </div>
    </td>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/foodTypeIcon_60.png" alt="" onclick="foodTypeNum(60);" />
     </div>
    </td>
   </tr>
   <tr>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/foodTypeIcon_70.png" alt="" onclick="foodTypeNum(70);" />
     </div>
    </td>
    <td>
    </td>
    <td>
    </td>
   </tr>
  </table>
 <!-- ここまで -->
 </section>
 <!-- モーダル部分 -->
 <div class="modal" id="js-modal">
  <div class="modal-inner">
   <div class="modal-pa">
    <div>検索した料理名は</div>
    <div>ヒットしませんでした。</div>
   </div>
   <div class="close-btn" id="js-close-btn"><input type="button" value="閉じる" /></div>
  </div>
  <div class="black-background" id="js-black-bg"></div>
 </div>
 <div style="display: none;">
  <form:form action="/happychoice/foodlist" name="foodListForm" method="post" enctype="multipart/form-data">
    <input type="hidden" name="searchWord" value="" />
    <input type="hidden" name="characterNum" value="${topForm.characterNum}" />
  </form:form>
  <form:form action="/happychoice/foodlist" name="foodTypeForm" method="post" enctype="multipart/form-data">
   <input type="hidden" name="foodType" value="" />
    <input type="hidden" name="characterNum" value="${topForm.characterNum}" />
  </form:form>
  <form:form action="/happychoice" name="emptyResulForm" method="post" enctype="multipart/form-data">
   <input type="hidden" name="emptyResultFlg" value="" />
  </form:form>
 </div>
</body>
</html>