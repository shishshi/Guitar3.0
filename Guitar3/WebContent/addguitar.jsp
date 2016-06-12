<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
            .center{
                position: fixed;
                top: 18%;
                right:35%;
                bottom:16%;
                left:37%;
                text-align: center;
                border: 2px solid  #669999;
            }
            .centerContent{
                position: absolute;
                top: 10%;
                bottom: 50%;
                left:15%
            }
        </style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addguitar">
<div class="center">
<span class="centerContent">
<a href="http://localhost:8080/Guitar3/allguitar">显示所有</a>
    <p>编号<input type="text" name="id"></p>
    <p>类型<input type="text" name="type"/></p>
    <p>型号<input type="text" name="model"/></p>
    <p>厂商<input type="text" name="builder"/></p>
    <p>材质<input type="text" name="wood"/></p>
	<p>价格<input type="text" name="price"/></p>
    <p><input type="submit" value="添加" style="background-color:#5EA2A2;width:50px;height:23px;color:white"/></p>
</span>
</div>
</form>
</body>
</html>