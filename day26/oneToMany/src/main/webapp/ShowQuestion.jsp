<%@page import="com.infinite.oneToMany.Question" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "dao" class = "com.infinite.oneToMany.QuestionDAO"/>
<table border ="3" align ="center">
<tr>
<th>Question</th>
<th>Answer</th>
</tr>
<c:forEach var="ques" items ="${dao.showQuestions() }">
<tr>
<td><c:out value="${ques }"/></td>
<td><a href = "AddAnswer.jsp">Answer</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>