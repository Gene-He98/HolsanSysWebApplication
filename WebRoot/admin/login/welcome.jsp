<%@ page language="java" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/admin/css/Style.css" type="text/css" rel="stylesheet" />
<style type="text/css">
<!--
body {
	background-color: #FFFFFF;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
body,td,th {
	color: #000000;
}
-->
    </style>
<style>
BODY {SCROLLBAR-FACE-COLOR: #cccccc; SCROLLBAR-HIGHLIGHT-COLOR: #ffffFF; SCROLLBAR-SHADOW-COLOR: #ffffff; SCROLLBAR-3DLIGHT-COLOR: #cccccc; SCROLLBAR-ARROW-COLOR:  #ffffff; SCROLLBAR-TRACK-COLOR: #ffffFF; SCROLLBAR-DARKSHADOW-COLOR: #cccccc; }
</style>
</head>

<body>

<form name="Form1" method="post" action="name.aspx" id="Form1">

	<table width="100%" border="0" height="88" border="1" background="${pageContext.request.contextPath}/admin/images/back1.JPG">
		<tr>
			<td colspan=3 class="ta_01" align="center" bgcolor="#f25d5d"><strong>系统首页</strong></td>
		</tr>

		<tr>
			<td style="CURSOR: hand; HEIGHT: 22px" align="center" valign="top">欢迎您,尊敬的用户${userName}</td>
		</tr>
		<tr><td height=2></td></tr>
	
	</table>

	</form>

</body>

</html>