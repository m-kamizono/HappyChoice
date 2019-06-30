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
 <!-- この中に書く -->
  <div class="topArea">
   <div class="logo">
    <img src="/happychoice/resources/img/hc_logo.png" alt="" >
   </div>
   <div class="search">
    <input type="text" />
    <input id="js-show-modal" onclick="openModal();" type="submit" value="検索"  />
   </div>
  </div>
  <table class="foodtbl">
   <tr>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/rice.png" alt="" onclick="foodNum(10);">
     </div>
    </td>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/noodles.png" alt="" onclick="foodNum(20);">
     </div>
    </td>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/meat.png" alt="" onclick="foodNum(30);">
     </div>
    </td>
   </tr>
   <tr>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/fish.png" alt="" onclick="foodNum(40);">
     </div>
    </td>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/vegetables.png" alt="" onclick="foodNum(50);">
     </div>
    </td>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/soup.png" alt="" onclick="foodNum(60);">
     </div>
    </td>
   </tr>
   <tr>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/other.png" alt="" onclick="foodNum(70);">
     </div>
    </td>
    <td>
    </td>
    <td>
     <div class="foodicn">
      <img src="/happychoice/resources/img/chara.png" alt="">
     </div>
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
  <form:form action="/happychoice/foodcChoice" name="foodNumForm" method="post" enctype="multipart/form-data">
   <input type="hidden" name="id" value="" />
  </form:form>
 </div>
</body>
</html>
