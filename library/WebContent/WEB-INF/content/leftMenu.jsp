<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav id="main-nav" class="navigation overflow">
	<ul id="accordion" class="accordion">
		<li><a href="#">你们好啊</a>
		<li><a href="homepage">首页</a></li>
		<li><a href="upload">上传电子资料</a></li>
		<li>
			<a href=javascript:TJ()>推荐链接</a>
			<ul style="display:none" id="TJ">
				<a href="https://linuxstory.org/free-chinese-programming-books/">&nbsp 编程类开放书籍荟萃</a>
			</ul>
		</li>
		<li>
			<a href=javascript:SX()>数学类</a>
			<ul style="display:none" id="SX">
				<li><a href="GS">&nbsp 工科数学</a></li>
				<li><a href="XS">&nbsp 线性代数</a></li>
				<li><a href="LSSX">&nbsp 离散数学</a></li>
				<li><a href="JSDS">&nbsp 近世代数</a></li>
				<li><a href="SLLJ">&nbsp 数理逻辑</a></li>
				<li><a href="SXJM">&nbsp 数学建模-美赛参考资料</a>
			</ul>
		</li>
		<li>
			<a href=javascript:JSJ()>计算机类</a>
			<ul style="display:none" id="JSJ">
				<li><a href="JSJKX">&nbsp 计算机科学</a></li>
				<li><a href="AQL">&nbsp 安全类书籍</a></li>
				<li><a href="CXSJ">&nbsp 程序设计</a></li>
				<li><a href="WEB">&nbsp web相关</a></li>
			</ul>
		</li>
		<li>
			<a href=javascript:test()>课外电子书</a>
			<ul style="display:none" id="DZS" name="1">
				<li><a href="KWWFL">&nbsp 未分类</a>
				<li><a href="BYHZG">&nbsp 冰与火之歌</a></li>
				
			</ul>
		</li>
		<li><a href="DXWL">大物实验</a></li>
		<li><a href="DL">电路</a></li>
		<li><a href="MSSB">模式识别</a></li>
		<li><a href="DZYDLGJGKZ">多自由度连杆机构控制</a></li>
		<li><a href="ZZ">政治课</a></li>
		
		<li><a href="WFL">未分类</a></li>
		
	</ul>
</nav>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
	function test(){
		var obj=document.getElementById("DZS");
		if(obj.style.display=='none'){
			obj.style.display='block';
		}else{
		 	obj.style.display='none';
		}
	}
	function TJ(){
		var obj=document.getElementById("TJ");
		if(obj.style.display=='none'){
			 obj.style.display='block';
		}else{
			 obj.style.display='none';
		}
	}
	function SX(){
		var obj=document.getElementById("SX");
		if(obj.style.display=='none'){
			 obj.style.display='block';
		}else{
			 obj.style.display='none';
		}
	}
	function JSJ(){
		var obj=document.getElementById("JSJ");
		if(obj.style.display=='none'){
			 obj.style.display='block';
		}else{
			 obj.style.display='none';
		}
	}
</script>
</body>
</html>