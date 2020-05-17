<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/admin/css/Style.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/public.js"></script>
<script type="text/javascript">
	function addPatient() {
		window.location.href = "${pageContext.request.contextPath}/admin/patients/add.jsp";
	}
</script>
</HEAD>
<body>
	<form id="Form1" name="Form1">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>${patientName}用药记录</strong>
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								<td align="center" width="25%">时间</td>
								<td align="center" width="50%">提醒计划名称</td>
								<td align="center" width="25%">是否服用</td>
							</tr>
								<c:forEach items="${drugRecords }" var="drugRecord">
									<tr onmouseover="this.style.backgroundColor = 'white'"
										onmouseout="this.style.backgroundColor = '#F5FAFE';">
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="25%">${drugRecord.drugTime}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="50%">${drugRecord.notificationName}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="25%">${drugRecord.ifDrug}</td>
									</tr>
								</c:forEach>
						</table>
					</td>
				</tr>
				
			<TR>
				<td align="center" colSpan="4" class="sep1"><img
					src="${pageContext.request.contextPath}/admin/images/shim.gif">
				</td>
			</TR>
			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe">
					<INPUT
					class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
				</td>
			</tr>
			</TBODY>
		</table>
	</form>
</body>
</HTML>

