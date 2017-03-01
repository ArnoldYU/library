<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function firm() {  
    //利用对话框返回的值 （true 或者 false）  
    if (confirm("是否继续上传")) {  
    	window.location.href='upload';
    }  
    else {  
    	window.location.href='homepage';
    }  

} 
</script>
<title>上传成功</title>
</head>
<body onload=firm()>

</body>
</html>