<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="com.comp.tasktracker.util.time.DateCreator" %>
<%@ page import="com.comp.tasktracker.util.constants.Const" %>
<div>
	<%
		DateCreator dateCreator = new DateCreator(Const.DateMode.Dayfull_YYYY_MM_DD_HH_MM);
		String now = dateCreator.formatDate(new Date());
	%>
	dagens datum: <%=now %>
</div>