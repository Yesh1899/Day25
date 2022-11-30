<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form method="get" action="AddAnswer.jsp">
  	<center>
  	   
  		Enter Answer :
  		<input type="text" name="Answer:" /><br/><br/>
  		
  		<input type="submit" value="Save" />
  	</center>
  </form>
  <c:set var="name" value="${param.id}" />
  	<c:if test="${param.id!= null}">
    <jsp:useBean id="beanDao" class="com.infinite.oneToMany.QuestionDAO"/>
	<jsp:useBean id="beanAdding" class="com.infinite.oneToMany.Adding" />
	
		<jsp:setProperty property="id" name="beanAdding" />
		
		<c:out value="${beanDao.AddingAnswer(beanAdding)}"></c:out>
		
		 <br/><br/>
	</c:if>


</body>
</html>