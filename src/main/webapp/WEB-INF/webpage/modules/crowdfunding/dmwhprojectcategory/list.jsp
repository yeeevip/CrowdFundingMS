<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>项目分类列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="项目分类">
<grid:grid id="dmWhProjectcategoryGridId" url="${adminPath}/crowdfunding/dmwhprojectcategory/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
<%-- 	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" /> --%>
	<grid:column label="类别名称"  name="categoryName" />
	<grid:column label="备注"  name="note" />
	<grid:column label="创建时间"  name="createDate" />
    <grid:column label="更新时间"  name="changeDate" />
    <grid:column label="修改人"  name="changePerson" />
    
    <grid:column label="创建时间"  name="createDate" />
    
 	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>