<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页</title>
	<meta name="keywords" content="<spring:message code="sys.site.keywords" arguments="${platformName}"/>">
	<meta name="description" content="<spring:message code="sys.site.description" arguments="${platformName}"/>">

    <html:css  name="favicon,bootstrap,font-awesome,animate"/>
    <link href="${staticPath}/common/css/style.css" rel="stylesheet">
     <style>
		/* ECHARTS  */
		.echarts {
		    height: 250px!important;
		}
		.portlet2 {
	    clear:none!important;
	    }
	    .form-group {
		    display: inline-block;
		    margin-bottom: 0;
		    vertical-align: middle;
		}
		.control-label {
		    margin-bottom: 0;
		    vertical-align: middle;
		}
		.form-control {
		    display: inline-block;
		    width: auto;
		    vertical-align: middle;
		}
			
	</style>
    
</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="portlet box  portlet-grey">
<%-- 					 <div class="portlet-header">
						<div class="caption">${lineTitle}</div>
						<div class="tools">
	                        <i class="fa fa-chevron-up"></i>
	                        <i class="fa fa-refresh"></i><i class="fa fa-times"></i>
	                     </div>
					</div>	 --%>
					<div class="portlet-body">
						<div class="form-group" id="serviceSelect">
			 	          <label class="control-label">项目类型：</label>
			 	    	 	<select class="form-control" name="serviceComment">
			 	    	 		<option value="null">全部</option>
			 	    	 	</select>
			 	    	 	
			 	    	 	&nbsp;&nbsp;&nbsp;&nbsp;
			 	    	 	<label class="control-label">按
			 	    	 	<select class="form-control" name="sType">
			 	    	 	<option value="hour">小时</option>
			 	    	 		<option value="day">日</option>
			 	    	 		
			 	    	 	</select>
			 	    	 	统计</label>
			 	     	</div>
                        <div class="echarts" id="echarts-serviceTrade-chart"></div>
                    </div>
                </div>
            </div>
            <div  class="col-sm-12">
                <div class="portlet box  portlet-grey portlet2" style="width:49%;float:left;">
					<%--  <div class="portlet-header" >
						<div class="caption">${barTitle}</div>
						<div class="tools">
	                        <i class="fa fa-chevron-up"></i>
	                        <i class="fa fa-refresh"></i><i class="fa fa-times"></i>
	                     </div>
					</div> --%>	
					<div class="portlet-body">
                        <div class="echarts" id="echarts-authUser-chart"></div>
                    </div>
                </div>
                <div class="portlet box  portlet-grey portlet2" style="width:49%;float:right;">
				<%-- 	 <div class="portlet-header" >
						<div class="caption">${barTitle}</div>
						<div class="tools">
	                        <i class="fa fa-chevron-up"></i>
	                        <i class="fa fa-refresh"></i><i class="fa fa-times"></i>
	                     </div>
					</div>	 --%>
					<div class="portlet-body">
                        <div class="echarts" id="echarts-userLoan-chart"></div>
                    </div>
                </div>
            </div>
         </div> 
    </div>
    

    

	<!-- 全局js -->
	<html:js name="jquery,echarts" />
	
	<script src="${staticPath}/modules/charts/js/echarts/serviceTrade.js"></script>
	<script src="${staticPath}/modules/charts/js/echarts/authUser.js"></script>
	<script src="${staticPath}/modules/charts/js/echarts/userLoan.js"></script>
	
	<script type="text/javascript">
		var adminPath = "${adminPath}";
	</script>
</body>

</html>