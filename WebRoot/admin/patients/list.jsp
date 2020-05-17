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
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>用药人列表</strong>
					</TD>
				</tr>
				<tr>
					<td class="ta_01" align="right">
						<button type="button" id="add" name="add" value="&#28155;&#21152;"
							class="button_add" onclick="addPatient()">&#28155;&#21152;
						</button>
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								<td align="center" width="10%">姓名</td>
								<td align="center" width="5%">年龄</td>
								<td align="center" width="5%">性别</td>
								<td align="center" width="15%">住址</td>
								<td align="center" width="5%">血型</td>
								<td align="center"width="20%">病史</td>
								<td align="center"width="20%">过敏史</td>
								<td align="center"width="10%">用药记录查询</td>
								<td align="center"width="5%">编辑</td>
								<td align="center"width="5%">删除</td>
							</tr>
								<c:forEach items="${patients }" var="patient">
									<tr onmouseover="this.style.backgroundColor = 'white'"
										onmouseout="this.style.backgroundColor = '#F5FAFE';">
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="10%">${patient.patientName}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="5%">${patient.patientAge}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="5%">${patient.patientSex}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="15%">${patient.patientAddress}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="5%">${patient.patientBloodType}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="20%">${patient.patientMedicalHistory}</td>
										<td style="CURSOR: hand; HEIGHT: 22px" align="center"
											width="20%">${patient.patientAllergy}</td><td align="center" style="HEIGHT: 22px" width="5%">
										<a
											href="${pageContext.request.contextPath}/DrugRecordFindServlet?patientName=${patient.patientName}">
												<img
												src="${pageContext.request.contextPath}/admin/images/button_search.gif"
												border="0" style="CURSOR: hand"> </a>
										</td>
										<td align="center" style="HEIGHT: 22px" width="5%">
										<a
											href="${pageContext.request.contextPath}/PatientEditFindServlet?patientName=${patient.patientName}">
												<img
												src="${pageContext.request.contextPath}/admin/images/i_edit.gif"
												border="0" style="CURSOR: hand"> </a>
										</td>
	
										<td align="center" style="HEIGHT: 22px" width="5%"><a
											href="${pageContext.request.contextPath}/PatientDeleteServlet?patientName=${patient.patientName}">
												<img
												src="${pageContext.request.contextPath}/admin/images/i_del.gif"
												width="16" height="16" border="0" style="CURSOR: hand">
										</a>
										</td>
									</tr>
								</c:forEach>
							
								
						
						</table>
					</td>
				</tr>
			</TBODY>
		</table>
	</form>
</body>
</HTML>

