<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<!-- <form action="file-upload" class="dropzone">
  <div class="fallback">
    <input name="pic" type="file" multiple />
  </div>
  <input type="submit" value="上传"/>
</form>  -->
	<div class="upload">
		<s:form action="file-upload" enctype="multipart/form-data" method="post" class="upload-form">
	  		<!-- enctype="multipart/form-data"   此处是一个很容易忽略的盲点 -->
	  		<s:file name="pic" label="上传" class="upload-file"/>
  		<s:submit value="提交" class="upload-submit btn"/>
  	</s:form>
	</div>
	
</body>
</html>