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
 <title>HappyChoice_RECOM</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge" />
 <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
 <link rel="stylesheet" href="/happychoice/resources/css/_cmn.css" />
 <link rel="stylesheet" href="/happychoice/resources/css/hc_recom.css" />
</head>
<body>
 <section class="container"><!-- 相方表示画面の全体領域確保 -->
 <!-- この中に書く -->
  <div class="recom-area">
   <div class="logo">
    <img src="/happychoice/resources/img/hc_recom.png" alt="" />
   </div>
  </div>
  <table class="foodtype-tbl">
   <tr>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/food1.png" alt="" />
      <font size="2"><b>ほうれん草の胡麻和え</b></font>
     </div>
    </td>
    <td>
     <div class="foodtype-icn">
       <img src="/happychoice/resources/img/food2.png" alt=""  />
       <font size="2"><b>ほうれん草の胡麻和え</b></font>
     </div>
    </td>
    <td>
     <div class="foodtype-icn">
       <img src="/happychoice/resources/img/food3.png" alt="" />
       <font size="2"><b>ほうれん草の胡麻和え</b></font>
     </div>
    </td>
   </tr>
   <tr>
    <td>
     <div class="foodtype-icn">
      <img src="/happychoice/resources/img/sabanomisoni.png" alt="" onclick="foodTypeNum(40);" />
     </div>
    </td>
   </tr>
  </table>

   <div class="fuki-area">
    <div class="fuki-back">
     <p id="lessNutMsg" style="margin-left: 2em;margin-top: 20pt;">
      <font size="2">ビタミンC<br/>が不足しています！</font></p>
    </div>
   </div>

  <div class="chara-position">
   <img src="/happychoice/resources/img/hc_chara001.png" alt="" width="100%"/>
  </div>

  <div class="backButton" onclick="history.back()">戻る</div>
  <div class="topButton" onclick="location.href='hc_top.jsp'">TOP</div>

</section>
</body>
</html>