<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有吉他</title>
<style type="text/css">
        .tb
        {
         border-width:1px;
         border-collapse:collapse;
         border-color:#669999;
         border-style:solid;
        }
        td
        {
         border-width:1px;
         border-collapse:collapse;
         border-color:#669999;
         border-style:solid;
         text-align:center;
        }
    </style>
</head>
<body>
	<table width="100%" border="1" cellpadding="2" cellspacing="0">
		<tr>
		    <td>编号</td>
			<td>类型</td>
			<td>型号</td>
			<td>厂商</td>
			<td>材质</td>
			<td>价格</td>
			<td>操作</td>
		</tr>
		<c:forEach var="guitars" items="${list}">
				<tr>
				    <td>${guitars.getId()}
					<td>${guitars.getSpec().getType()}</td>
				    <td>${guitars.getSpec().getModel()}</td>
				    <td>${guitars.getSpec().getBuilder()}</td>				
				    <td>${guitars.getSpec().getWood()}</td>
				    <td>${guitars.getPrice()}</td>
					<td><a href="http://localhost:8080/Guitar3/delguitar?id=${guitars.getId()}">删除</a></td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>