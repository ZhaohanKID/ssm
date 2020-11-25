<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有书籍</title>
    <style>
        #table1 {
            margin: 10px auto;
            border: 1px solid black;
            text-align: center;
        }
        #div1 {
            width: 100px;
            height: 30px;
            background-color: pink;
            border-radius: 5px;
            margin: 10px auto;
            text-align: center;
        }
        #div1 a {
            line-height: 30px;
            text-decoration: none;
            font-size: 16px;
            color: black;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center">所有书籍展示</h1>

    <table id="table1">
        <thead>
            <tr>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍详情</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${allBook}" var="book">
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/toUpdatePaper?id=${book.bookID}">修改</a>
                        &nbsp; | &nbsp;
                        <a href="${pageContext.request.contextPath}/deleteBook/${book.bookID}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div id="div1">
        <a href="${pageContext.request.contextPath}/jsp/addBook.jsp">添加书籍</a>
    </div>
</body>
</html>
