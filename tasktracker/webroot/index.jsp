<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
    "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>" />
    <style type="text/css">
			@import "css/tasktracker.css";
	</style>

    <title>index.jsp RELEASEVERSION_TO_BE_REPLACED</title>

	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
	<meta http-equiv="description" content="This is my page" />

  </head>

  <body>
  	<%@ include file="/includes/menu.jsp" %>

  	<div>
  		index.jsp RELEASEVERSION_TO_BE_REPLACED
  	</div>

  	<%@ include file="/includes/footer.jsp" %>

  </body>
</html>