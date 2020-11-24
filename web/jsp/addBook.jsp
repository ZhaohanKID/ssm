<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/24
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/addBook" method="post">
        <table>
            <tr>
                <td>书籍编号：</td>
                <td><input type="text" name="bookID" placeholder="请输入书籍编号"></td>
            </tr>
            <tr>
                <td>书籍名称：</td>
                <td><input type="text" name="bookName" placeholder="请输入书籍名称"></td>
            </tr>
            <tr>
                <td>书籍数量：</td>
                <td><input type="text" name="bookCounts" placeholder="请输入书籍数量"></td>
            </tr>
            <tr>
                <td>书籍详情：</td>
                <td><input type="text" name="detail" placeholder="请输入书籍详情"></td>
            </tr>
        </table>
        <button type="submit" style="margin: 10px auto">提交</button>
    </form>
</body>
</html>
