<%--
  Created by IntelliJ IDEA.
  User: FOODNAMOO
  Date: 2023-02-03
  Time: 오전 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시글 작성하기</title>
</head>

<style>

    .layout {
        width : 500px;
        margin : 0 auto;
        margin-top : 40px;
    }

</style>

<body>
<h1>
    게시글 작성
</h1>
<form method="post" action="/">
    <table>
        <tr>
            <td>닉네임</td>
            <td><input type="text" name="nickname"></td>
        </tr>
        <tr>
            <td>제목</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><input type="text" name="content"></td>
        </tr>
    </table>
        <input type="submit" value="작성하기">
</form>
</body>
</html>
