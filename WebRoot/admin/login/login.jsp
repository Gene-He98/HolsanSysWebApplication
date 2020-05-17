<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/admin/css/login2.css">
<title>火山药馆</title>
<style>
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
	background-image: url("${pageContext.request.contextPath}/admin/images/log_back.jpg");
	background-size:cover;
}
</style>
</head>
<body class="fluid_container" id="container_bg" style="height: 100%;">
	<div class="floor2">
		<form id="loginForm" action="${pageContext.request.contextPath}/LoginServlet" method="post">
			<div class="content_login_box" id="login_content">
				<div class="login-tab-con">
					<a id="password_login" class="tab-inside active">账号登录</a>
				</div>
				<div class="error">
					<span class="notice" style="display: none;" id="errormsg">用户名或密码错误</span>
			</div>
	
			<div class="login_box_up">
				<input id="un" type="text" class="login_box_input user-pic pic-input" placeholder="用户名或手机号"
						style="margin-top: 13px" name="UserName" required="required"/> 
				<input id="pd" type="password" class="login_box_input password-pic pic-input" placeholder="密码"
						autocomplete="off" name="UserPass" required="required"/>
						
				<div class="down_link_choice">
					<input class="login_box_checkbox" type="checkbox"
						id="rememberName"> <span
						class="login_box_checkbox_label">记住用户名</span>
				</div>
				<span class="landing_btn_bg"> <input type="submit"
					class="login_box_landing_btn" id="index_login_btn" value="立即登录" style="color:#ffffff"/>
				</span>
				<div class="login_box_down">
					<p class="new_student">温馨提示: 注册功能仅在Android端实现，如为新用户，请下载火山药馆Android端进行注册。</p>
					<p class="browser">
						<span class="left">建议浏览器：</span>
							<a class="firefox_pic" target="_blank" href="http://www.firefox.com.cn/download/">火狐</a>
							<a class="google_pic" target="_blank" href="https://www.google.cn/intl/zh-CN/chrome/">谷歌</a>
						</p>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
<%
		HttpSession sess = request.getSession();
		String message = (String)sess.getAttribute("mes");
	
	if(message != null && !message.equals("")){
		%>
			 <script type="text/javascript">
					alert("<%=message %>");
			 </script>
		<%
		sess.setAttribute("mes", "");
	}
 %>
</html>