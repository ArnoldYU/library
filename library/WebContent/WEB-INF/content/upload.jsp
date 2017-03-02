<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="mystyle.css" rel="stylesheet" type="text/css">
<script src="js/dropzone.js"></script>
<link rel="stylesheet" type="text/css" href="css/dropzone.css" />
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="msapplication-tap-highlight" content="no" />
<meta name="viewport" content="initial-scale=1, maximum-scale=1" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<link rel="stylesheet" type="text/css" href="bodycss/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="bodycss/css/default.css"/>
<link rel="stylesheet" href="bodycss/css/bamboo.css"/>
<link rel="stylesheet" href="css/upload.css" type="text/css">
<%@taglib uri="/struts-tags" prefix="s" %> 
</head>
<body>
	<%@ include file="leftMenu.jsp" %>
	<div id="container">
		<header class="primary">
			<span class="open icon">&#9776;</span>
			<hgroup><h1>文件上传</h1></hgroup>
		</header>
		<section id="scroller" class="overflow">
			<div id="content">
				<header class="htmleaf-header">	
					<p>感谢您的支持！</p>
					<P>建议在WiFi的环境下上传</P>
					<p>技术有限,有bug的地方请及时联系站长2680828469@qq.com</p>
					<p>后续开发进行中...ㄟ(▔▽▔)ㄏ</p>
					<div class="upload" >
						<s:form action="file-upload" enctype="multipart/form-data" method="post" class="upload-form">
					  		<!-- enctype="multipart/form-data"   此处是一个很容易忽略的盲点 -->
					  		<s:file name="pic" label="上传" class="upload-file"/>
				  			<s:submit value="提交" class="upload-submit btn"/>
				  		</s:form>
					</div>
				</header>
				<!-- Content goes in here -->
				<br/><br/><br/>
				<img src="images/library.jpg">
			</div>
		</section>
	</div>

	<script>
		var site = new Bamboo();
	</script>
</body>
</html>