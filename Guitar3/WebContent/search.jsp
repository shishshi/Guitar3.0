<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>搜索</title>
<style>
            .center{
                position: fixed;
                top: 30%;
                right:35%;
                bottom:25%;
                left:35%;
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
</head>
<body>
<div class="center">
<span class="centerContent">
<form action="search">
<p>类型<input type="text" name="type"/></p>
<p>型号<input type="text" name="model"/></p>
<p>厂商<input type="text" name="builder"/></p>
<p>材质<input type="text" name="wood"/></p>
<p><input type="submit" value="搜索" style="background-color:#5EA2A2;width:50px;height:23px;color:white"/></p>
</span>
</div>


</form>
</body>
</html>