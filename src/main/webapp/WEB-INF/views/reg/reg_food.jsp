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
 <form action="/happychoice/food/regFood" name="foodForm" method="post" enctype="multipart/form-data">
   <table>
    <tr><td>食品ID</td><td>${foodForm.foodId}</td></tr>
    <tr><td>食品名</td><td><input type="text" name="foodName" value="${foodForm.foodName}" /></td></tr>
    <tr><td>食品検索ワード</td><td><input type="text" name="searchWords" value="${foodForm.searchWords}" /></td></tr>
    <tr><td>和洋中</td><td><input type="text" name="wycType" value="${foodForm.wycType}" /></td></tr>
    <tr><td>主菜フラグ</td><td><input type="text" name="maindishFlg" value="${foodForm.maindishFlg}" /></td></tr>
    <tr><td>食品タイプ</td><td><input type="text" name="foodType" value="${foodForm.foodType}" /></td></tr>
    <tr><td>炭水化物</td><td><input type="text" name="carbo" value="${foodForm.carbo}" /></td></tr>
    <tr><td>タンパク質</td><td><input type="text" name="prot" value="${foodForm.prot}" /></td></tr>
    <tr><td>脂質</td><td><input type="text" name="fat" value="${foodForm.fat}" /></td></tr>
    <tr><td>ビタミンA</td><td><input type="text" name="va" value="${foodForm.va}" /></td></tr>
    <tr><td>ビタミンB1</td><td><input type="text" name="vb1" value="${foodForm.vb1}" /></td></tr>
    <tr><td>ビタミンB2</td><td><input type="text" name="vb2" value="${foodForm.vb2}" /></td></tr>
    <tr><td>ビタミンC</td><td><input type="text" name="vc" value="${foodForm.vc}" /></td></tr>
    <tr><td>鉄</td><td><input type="text" name="fe" value="${foodForm.fe}" /></td></tr>
    <tr><td>カルシウム</td><td><input type="text" name="ca" value="${foodForm.ca}" /></td></tr>
    <tr><td>食物繊維</td><td><input type="text" name="fib" value="${foodForm.fib}" /></td></tr>
    <tr><td>食塩相当量</td><td><input type="text" name="salt" value="${foodForm.salt}" /></td></tr>
    <tr><td>画像データ</td><td><input type="file" name="foodImg" /></td></tr>
   </table>
   <input type="submit" value="登録">
 </form>
</body>
</html>