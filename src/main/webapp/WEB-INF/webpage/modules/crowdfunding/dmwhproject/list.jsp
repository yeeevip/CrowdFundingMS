<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>众筹项目列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="众筹项目">
<grid:grid id="dmWhProjectGridId" url="${adminPath}/crowdfunding/dmwhproject/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="项目名称"  name="title" query="true"  condition="like"/>
	<grid:column label="项目简介"  name="blurb" />
	<grid:column label="发起人"  name="user.phone" />
	<grid:column label="项目类别"  name="projectcategory.categoryName" query="true" queryMode="select" dict="qxz" condition="eq"/>
	<grid:column label="目标集资额"  name="totalFundRaising" />
    <grid:column label="已筹金额"  name="hasFundRaising" />
    
    <grid:column label="已筹天数"  name="daysRaising" />
    <grid:column label="首页展示"  name="isIndex"  query="true" queryMode="select" dict="syzs" condition="eq" />
    <grid:column label="项目进展"  name="isFinish"  query="true" queryMode="select" dict="xmzt" condition="eq" />
    <grid:column label="审核状态"  name="isAudits" query="true" queryMode="select" dict="shzt" condition="eq" />
    <grid:column label="所有者"  name="shenfen" />
    <grid:column label="发起时间"  name="launchDateRaising"  query="true" queryMode="date" condition="between"/>
    
    <%-- <grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/> --%>
	<%-- <grid:button groupname="opt" title="去审核" function="delete" /> --%>
    
 <%--    
    <grid:query label="发起日期起" name="launchDateRaising" queryMode="date" condition="ge" />
    <grid:query label="至" name="launchDateRaising" queryMode="date" condition="le" />
     --%>
 	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	<grid:toolbar title="项目审核" function="toShenhe"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>



<script type="text/javascript">
$(window).load(function(){
		var $this = $("#dmWhProjectGridIdGridQuery select[name='projectcategory.categoryName']");
		$this.attr("name","projectcategory.id");
		$.get("${adminPath}/crowdfunding/dmwhprojectcategory/getAllCategory", function(
						data, status) {
					//alert(status);
					data = eval('(' + data + ')');
					for ( var i in data) {
						$this.append('<option value="'+data[i].id+'">'
								+ data[i].categoryName + '</option>');
					}

				});
/* 
		$("#dmWhProductGridIdGrid tr td").each(function(){
	    	$(this).css("white-space","inherit");
	    	$(this).css("vertical-align", "middle"); 
	    });
 */

})

function shenhe(title,url,gridId,width,height){
	alert(url);
	$.get("${adminPath}/crowdfunding/dmwhprojectcategory/+", function(data, status) {});
	
	
	toShenhe(title,url,gridId,width,height);
	
}

 /* 	$(document).ready(function(){
 		//alert($("#tbAuthContentGridIdGrid tr").length);
 		//alert($("#gview_tbAuthContentGridIdGrid").length);
 		
 		$("#gview_dmWhProductGridIdGrid").bind('DOMNodeInserted', function(e) {  
		     //有变化后执行的内容
		    $("#gview_dmWhProductGridIdGrid tr td").each(function(){
			    
		    	$(this).css("white-space","inherit");
		    	$(this).css("vertical-align", "middle");
		    });
			});  
 	}) */


</script>
</body>


</html>