<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>订单列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="订单">
<grid:grid id="dmWhOrderGridId" url="${adminPath}/crowdfunding/dmwhorder/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<%-- <grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" /> --%>
	<grid:column label="订单编号"  name="id" />
	<grid:column label="项目名称"  name="project.title" query="true" condition="like"/>
	<grid:column label="发起人"  name="sellUser.userName" query="true"/>
	<grid:column label="回报名称"  name="projectRepay.payTitle" query="true"/>
	<grid:column label="下单用户"  name="buyUser.userName" query="true"/>
    <grid:column label="购买份数"  name="count" />
    <grid:column label="是否发货"  name="isSend" query="true" queryMode="select" condition="eq" dict="isSend"/>
    <grid:column label="是否支付"  name="isPay" query="true" queryMode="select" condition="eq" dict="isPay"/>
    <grid:column label="收货信息"  name="receiveInfo.completeInfo" />
    
    <grid:column label="创建时间"  name="orderDate"  query="true" queryMode="date" condition="between"/>
    <grid:column label="支付时间"  name="payTime" />
    <grid:column label="是否收货"  name="yxbz" dict="sf" query="true" queryMode="select" condition="eq"/>
    
    
  <%--   <grid:query label="创建时间"  name="orderDate" queryMode="date" condition="ge"/>
     <grid:query label="至"  name="orderDate" queryMode="date" condition="le"/>
 --%>
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
<script type="text/javascript">
$(window).load(function(){
		var $this = $("#dmWhOrderGridIdGridQuery select[name='project.title']");
		$this.attr("name","project.id");
	})
		
</script>
</body>
</html>