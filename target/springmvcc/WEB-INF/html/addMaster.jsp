<%--
  Created by IntelliJ IDEA.
  User: wangshuaitong
  Date: 2019/3/8
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加人物信息</title>
</head>
<body>
    <div>
        <form action="/user/addMaster" method="post">
            id:<input type="text" name="id" id="id">
            username:<input type="text" name="name">
            <%--pet:<input type="text" name="petName.name">--%>
            pet:<input type="text" name="petName.name">
            <input type="submit" value="添加信息">
        </form>
    </div>
</body>
</html>
