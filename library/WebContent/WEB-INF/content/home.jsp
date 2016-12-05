<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="mystyle.css" rel="stylesheet" type="text/css">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="msapplication-tap-highlight" content="no" />
<meta name="viewport" content="initial-scale=1, maximum-scale=1" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<link rel="stylesheet" type="text/css" href="bodycss/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="bodycss/css/default.css">
<link rel="stylesheet" href="bodycss/css/bamboo.css">
<title>首页</title>
</head>
<body>
	
	<%@ include file="leftMenu.jsp" %>

	<div id="container">

		<header class="primary">
			<span class="open icon">&#9776;</span>
			<hgroup><h1>电子书下载</h1></hgroup>
		</header>
		<section id="scroller" class="overflow">
			<div id="content">
				<header class="htmleaf-header">	
					<p>本站点免费提供电子书下载</p>
					<p>若侵犯您的版权，请联系站长2680828469@qq.com</p>
					<P>建议在WiFi的环境下下载</P>
					<p>技术有限,有bug的地方请及时联系站长</p>
					<p>后续开发进行中...ㄟ(▔▽▔)ㄏ</p>
					<!-- <h1>通过servlet程序下载文件</h1>
					<a href="downloadtest?id=2">111</a> -->
				</header>
				<!-- Content goes in here -->
				
				<img src="images/library.jpg">
		</section>


	</div>
	
	
	<script src="http://libs.useso.com/js/jquery/1.11.0/jquery.min.js"></script>
	<script src="bodycss/js/bamboo.0.1.js"></script>

	<script>
		var site = new Bamboo();
	</script>
</body>
</html>