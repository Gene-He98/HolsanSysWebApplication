<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/admin/css/Style.css"
	type="text/css" rel="stylesheet">
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/public.js"></script>
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/check.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/admin/js/My97DatePicker/WdatePicker.js"></script>

</HEAD>
<body>
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/MedicineEditUpdateServlet" method="get">
	
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>修改药品</STRONG> </strong>
				</td>
			</tr>

			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">药品名称：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="medicineName" class="bg" autocomplete="off" value="${medicine.medicineName}"/>
				</td>
				<td align="center" bgColor="#f5fafe" class="ta_01">药品别名：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="medicineAnotherName" class="bg" autocomplete="off" value="${medicine.medicineAnotherName}"/>
				</td>
			</tr>
			
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">预期用途：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="usage" cols="30" rows="3" 
						style="WIDTH: 50%">${medicine.usage}</textarea>
				</TD>
			</TR>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">用法用量：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="dosage" cols="30" rows="3" 
						style="WIDTH: 50%">${medicine.dosage}</textarea>
				</TD>
			</TR>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">注意事项：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="cautions" cols="30" rows="3" 
						style="WIDTH: 50%">${medicine.cautions}</textarea>
				</TD>
			</TR>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">有效期至：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<input type="text" name="validity" autocomplete="off" value="${medicine.validity}" onfocus="WdatePicker({minDate:'%y-%M-{%d}'})"/>
				</TD>
			</TR>
			<TR>
				<td align="center" colSpan="4" class="sep1"><img
					src="${pageContext.request.contextPath}/admin/images/shim.gif">
				</td>
			</TR>

			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4">
					
					
						
					<input type="submit" class="button_ok" value="确定">	
						
					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					
					
					
					<input type="reset" value="重置" class="button_cancel">

					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT> <INPUT
					class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
					<span id="Label1">
					
					</span>
				</td>
			</tr>
		</table>
	</form>




</body>
</HTML>