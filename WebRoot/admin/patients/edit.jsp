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
</HEAD>
<body>
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/PatientEditUpdateServlet" method="post">
	
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>修改用药人</STRONG> </strong>
				</td>
			</tr>

			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">姓名：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="patientName" class="bg" autocomplete="off" value="${patient.patientName}"/>
				</td>
				<td align="center" bgColor="#f5fafe" class="ta_01">年龄：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="patientAge" class="bg" autocomplete="off" value="${patient.patientAge}"/>
				
				</td>
			</tr>
			
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">性别：</TD>
				<td class="ta_01" bgColor="#ffffff">
				<select name="patientSex"
					id="patientSex">
						<option value="男"<%if(request.getAttribute("patientSex").equals("男")) { %>selected="selected"<%} %>>男</option>
						<option value="女"<%if(request.getAttribute("patientSex").equals("女")) { %>selected="selected"<%} %>>女</option>
						<option value="其他"<%if(request.getAttribute("patientSex").equals("其他")) { %>selected="selected"<%} %>>其他</option>
				</select></td>
				<TD class="ta_01" align="center" bgColor="#f5fafe">血型：</TD>
				<td class="ta_01" bgColor="#ffffff">
				<select name="patientBloodType"
					id="patientBloodType">
						<option value="A"<%if(request.getAttribute("patientBloodType").equals("A")) { %>selected="selected"<%} %>>A</option>
						<option value="B"<%if(request.getAttribute("patientBloodType").equals("B")) { %>selected="selected"<%} %>>B</option>
						<option value="AB"<%if(request.getAttribute("patientBloodType").equals("AB")) { %>selected="selected"<%} %>>AB</option>
						<option value="O"<%if(request.getAttribute("patientBloodType").equals("O")) { %>selected="selected"<%} %>>O</option>
						<option value="其他"<%if(request.getAttribute("patientBloodType").equals("其他")) { %>selected="selected"<%} %>>其他</option>
				</select></td>
				</td>
			</TR>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">住址：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="patientAddress" cols="30" rows="3" 
						style="WIDTH: 50%">${patient.patientAddress}</textarea>
				</TD>
			</TR>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">病史：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="patientMedicalHistory" cols="30" rows="3" 
						style="WIDTH: 50%">${patient.patientMedicalHistory}</textarea>
				</TD>
			</TR>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">过敏史：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="patientAllergy" cols="30" rows="3" 
						style="WIDTH: 50%">${patient.patientAllergy}</textarea>
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