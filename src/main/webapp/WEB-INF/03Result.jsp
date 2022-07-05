<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Result.JSP</h1>
Email : <%=request.getParameter("email") %><br>
PW : <%=request.getParameter("pwd") %><br>
Addr1 : <%=request.getParameter("Addr1") %><br>
Addr2 : <%=request.getParameter("Addr2") %><br>

</body>
</html>