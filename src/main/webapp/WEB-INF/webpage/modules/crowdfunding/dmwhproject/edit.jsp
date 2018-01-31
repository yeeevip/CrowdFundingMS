<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>众筹项目</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="dmWhProjectForm">
    <form:form id="dmWhProjectForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					
					<td  class="width-15 active text-right">	
		              <label>has_fund_raising:</label>
		            </td>
					<td class="width-35">
						<form:input path="hasFundRaising" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>是否首页展示:</label>
		            </td>
					<td class="width-35">
						<form:input path="isIndex" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>user_id:</label>
		            </td>
					<%-- <td class="width-35">
						<form:input path="userId" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td> --%>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>days_raising:</label>
		            </td>
					<td class="width-35">
						<form:input path="daysRaising" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>项目状态 0：进行中  -1：集资失败 1：成功:</label>
		            </td>
					<td class="width-35">
						<form:input path="isFinish" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>title:</label>
		            </td>
					<td class="width-35">
						<form:input path="title" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>img_name:</label>
		            </td>
					<td class="width-35">
						<form:input path="imgName" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>category_id:</label>
		            </td>
					<td class="width-35">
						<form:input path="categoryId" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>-1:审核不通过 0:未审核 1:审核通过:</label>
		            </td>
					<td class="width-35">
						<form:input path="isAudits" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>total_fund_raising:</label>
		            </td>
					<td class="width-35">
						<form:input path="totalFundRaising" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>shenfen:</label>
		            </td>
					<td class="width-35">
						<form:input path="shenfen" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>blurb:</label>
		            </td>
					<td class="width-35">
						<form:input path="blurb" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>launch_date_raising:</label>
		            </td>
					<td class="width-35">
						<form:input path="launchDateRaising" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
		      
		   </tbody>
		</table>   
	</form:form>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor" />
</body>
</html>