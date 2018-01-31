<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>众筹 用户列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="众筹 用户">
<grid:grid id="userGridId" url="${adminPath}/crowdfunding/user/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<%-- <grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" /> --%>
	<grid:column label="用户编号"  name="id" />
	<grid:column label="用户名"  name="userName"  query="true"  queryMode="input"  condition="eq" />
    <grid:column label="性别"  name="sex" query="true" queryMode="select" condition="eq" dict="sex"/>
    <grid:column label="电话号码"  name="phone" />
    <grid:column label="电子邮箱"  name="email" />
   <%--  <grid:column label="密码"  name="password" /> --%>
    <grid:column label="真实姓名"  name="realName" />
    <grid:column label="所在城市"  name="city" />
    <grid:column label="身份证号"  name="idNumber" />
    <grid:column label="出生日期"  name="dateOfBirth" />
    <%-- <grid:column label="img_path"  name="imgPath" /> --%>
    
    <grid:column label="注册时间"  name="dateOfRegistration" query="true" queryMode="date" condition="between"/>
    
  <%--    <grid:query label="注册时间"  name="dateOfRegistration" queryMode="date" condition="ge"/>
     <grid:query label="至"  name="dateOfRegistration" queryMode="date" condition="le"/>
     --%>
 	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>