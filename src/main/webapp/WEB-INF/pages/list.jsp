<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: FangChen
  Date: 2023/3/11
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询成功</h3>
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>

    <h4>qqqqq</h4>


</body>
</html>
