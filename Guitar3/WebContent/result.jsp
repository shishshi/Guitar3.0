<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>搜索结果</title>
 <style type="text/css">
        .tb
        {
         border-width:2px;
         border-collapse:collapse;
         border-color:#669999;
         border-style:solid;
        }
        td
        {
         border-width:2px;
         border-collapse:collapse;
         border-color:#669999;
         border-style:solid;
         text-align:center;
        }
    </style>
</head>
<body>
<div>
    <table width="600" height="100" border="2" cellpadding="0" cellspacing="0" class="tb"align="center">

<center>搜索结果</center>
		<tr>
			<td>类型</td>
			<td>型号</td>
			<td>厂商</td>
			<td>材质</td>
			<td>价格</td>
		</tr>
	<c:forEach items="${matchingGuitars}" var="guitars" varStatus="status">
				<td>${guitars.getSpec().getType()}</td>
				<td>${guitars.getSpec().getModel()}</td>
				<td>${guitars.getSpec().getBuilder()}</td>				
				<td>${guitars.getSpec().getWood()}</td>
				<td>${guitars.getPrice()}</td>
			</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>