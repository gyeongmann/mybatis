<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>학생 목록</title>
</head>
<body>
<h1>학생 목록</h1>
<table border="1">
    <tr>
        <th>학번</th>
        <th>이름</th>
        <th>학과</th>
        <th>학년</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.studentNo}</td>
            <td>${student.name}</td>
            <td>${student.department}</td>
            <td>${student.grade}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>