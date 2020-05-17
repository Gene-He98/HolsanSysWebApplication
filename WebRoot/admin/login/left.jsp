<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/admin/css/left.css" rel="stylesheet" type="text/css">
<link rel="StyleSheet" href="${pageContext.request.contextPath}/admin/css/dtree.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/dtree.js"></script>
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	
	<script type="text/javascript">
		<!--
		d = new dTree('d');
		d.add(0,-1,'系统功能区');
		d.add(1,0,'用药人管理','${pageContext.request.contextPath}/PatientListServlet','','mainFrame');
		d.add(2,0,'药品管理','${pageContext.request.contextPath}/MedicineListServlet','','mainFrame');
		
		document.write(d);
		//-->
	</script>
</div>	</td>
  </tr>
</table>
</body>
</html>
