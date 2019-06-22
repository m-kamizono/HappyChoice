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
 <title>サンプル画面</title>
 <meta http-equiv="X-UA-Compatible" content="IE=edge" />
 <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport" />
</head>
<body>
 <form action="search" name="sampleForm" method="post" enctype="multipart/form-data">
  <div align="center">
   <table>
    <tr>
     <td>名前</td>
     <td><input type="text" name="name" value="${topForm.name}" /></td>
     <td><input type="hidden" name="id" value="${topForm.id}" /></td>
    </tr>
   </table>
   <input type="submit" value="検索">
  </div>
 </form>
</body>
</html>
