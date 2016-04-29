<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="reqUrl" value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}" />

<html>
<head>
	<title>Rapid mini主页</title>
</head>

<body>

<h3>Springmvc + Spring项目脚手架</h3>

<ul>
	<li>采用maven管理</li>
	<li>提供最小化maven项目，最基本的配置文件，方便进行web项目调试</li>
	<li>mini版本不提供数据访问操作</li>
</ul>

</body>
</html>
