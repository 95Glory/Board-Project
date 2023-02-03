<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>게시글 수정하기</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
    게시글 수정
</h1>
<form id="postUpdate" onsubmit="update(${post.id})">
    <table>
        <tr>
            <td>닉네임</td>
            <td><input type="text" name="nickname" value="${post.nickname}" required="required"></td>
        </tr>
        <tr>
            <td>제목</td>
            <td><input type="text" name="title" value="${post.title}" required="required"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><input type="text" name="content" value="${post.content}" required="required"></td>
        </tr>
    </table>
    <input type="submit" value="수정하기">
</form>
</body>
</html>
<script type="text/javascript" src="/js/post.js"></script>
