<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

<title>图书馆</title>
</head>
<body>
	
	<%@ include file="leftMenu.jsp" %>

	<div id="container">

		<header class="primary">
			<span class="open icon">&#9776;</span>
			<hgroup><h1>工大电子书下载</h1></hgroup>
		</header>
		<section id="scroller" class="overflow">
			<div id="content">
				<header class="htmleaf-header">	
					${books[0].type }
				</header>
				<!-- Content goes in here -->
				<form class="input-append" action="SearchBook" method="post">
					  	<input type="text" class="span2" placeholder="书名" name="onebook.name">
					  	<input type="submit" class="btn" value="查找">
					  	<!-- <input type="button" class="btn" value="测试" onclick=sendCode()> -->
				</form>
				<table class="table" style="top:30px;position:relative"> 
					<tr>
						<th>名称</th>
						<th>详情</th>
						<th>下载</th>
						<th>备用下载</th>
						<th>链接失效反馈</th>
						
					</tr>
					<s:iterator value="books" var="au"> 
					<tr>
						<td > ${au.name }</td>
						<!-- <td><a href="#">介绍</a></td> -->
						<td><button onclick=sorry() value=${au.id }>介绍</button></td>
						<%-- <td><button onclick=fun(this) value=${au.id }>下载</button></td> --%>
						<%-- <td><input type=button onclick=fun(this) name=${au.id } value="下载"></td> --%>
						<td><a href="downloadtest?id=${au.id }">下载</a></td>
						<td><a href=${au.download }>备用下载</a></td>
						<%-- <td><button onclick=fankui(this) value=${au.id }>反馈</button></td> --%>
						<td><input type=button onclick=fankui(this) name=${au.id } value="反馈"></td>
					</tr>
					</s:iterator>
				</table>
		</section>


	</div>
	
	
	<script src="http://libs.useso.com/js/jquery/1.11.0/jquery.min.js"></script>
	<script src="bodycss/js/bamboo.0.1.js"></script>
	<script>
		var site = new Bamboo();
	</script>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
	<script>
	function sorry(){
		alert("sorry-暂时不提供介绍...后续开发中")
	}
	function fun(btn){
		/* btn.onclick=function(){download(btn);sendCode(btn);} */
		btn.onclick=function(){download(btn);}
	}
	function fankui(btn){
		id=btn.name
		/* alert(id) */
        var information = prompt("请输入反馈信息", ""); //将输入的内容赋给变量 name ，  
        //这里需要注意的是，prompt有两个参数，前面是提示的话，后面是当对话框出来后，在对话框里的默认值  
        if (information)//如果返回的有内容  
        {  
            alert("谢谢您的反馈");  
        }  

	   	$.ajax({
	   		url:"FK.action",
	   		type:"POST",
	   		data:{
	   			id:id,
	   			information:information,
	   		},
	   		error:function(){
	   			alert("error");
	   		},
	   		success:function(){
	   			alert("反馈成功")
	   		}
	   	});
	}
	function download(btn){
		id=btn.name
		var url=prompt("请输入存放的文件路径","比如D:\XXX\XXX");
		if (url == null){
			
		}
		else{
			$.ajax({
		   		url:"download.action",
		   		type:"POST",
		   		data:{
		   			id:id,
		   			url:url
		   		},
		   		error:function(){
		   			alert("error");
		   		},
		   		success:function(){
		   			alert("成功");
		   		}
		   	});
		}
	   	
	}
	var clock = '';
	var nums = 10;
	function sendCode(btn)
	{
	    clock = setInterval(doLoop(btn), 1000); //一秒执行一次
		
	 }
	function doLoop(btn)
	{
	    nums--;
	    if(nums >= 0){
	    	
	    	 $.ajax({
	 	        url:'getsize.action',
	 	        data:{
	 	        },
	 	        type:'post',
	 	        success:function(){
	 	            
	 	        }
	 	    })
	    } else {
	    	btn.value="下载"
	        clearInterval(clock); //清除js定时器
	        btn.disabled = false;
	        nums = 10; //重置时间
	    }
	}

	</script>
</body>
</html>