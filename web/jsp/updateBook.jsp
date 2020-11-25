<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/25
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/updateBook" method="post">

        <%--隐藏域--%>
        <input type="hidden" value="${QBook.bookID}" name="bookID">
        <table>
            <tr>
                <td>书籍编号：</td>
                <td><input type="text" name="bookID" value="${QBook.bookID}" disabled="disabled"></td>
            </tr>
            <tr>
                <td>书籍名称：</td>
                <td><input type="text" name="bookName" value="${QBook.bookName}"></td>
            </tr>
            <tr>
                <td>书籍数量：</td>
                <td><input type="text" name="bookCounts" value="${QBook.bookCounts}"></td>
            </tr>
            <tr>
                <td>书籍详情：</td>
                <td><input type="text" name="detail" value="${QBook.detail}"></td>
            </tr>
        </table>
        <button type="submit">确认修改</button>
    </form>
</body>
</html>
