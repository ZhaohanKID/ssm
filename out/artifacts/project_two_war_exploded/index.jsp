<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/21
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a {
        text-decoration: none;
        color: black;
        text-align: center;
        font-size: 18px;
      }
      h3 {
        width: 180px;
        height: 38px;
        margin: 100px auto;
        text-align: center;
        line-height: 38px;
        background-color: skyblue;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>
    <h3>
      <a href="${pageContext.request.contextPath}/allBook">查询所有书籍</a>
    </h3>
  </body>
</html>
