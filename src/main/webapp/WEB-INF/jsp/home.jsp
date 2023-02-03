<%--
  Created by IntelliJ IDEA.
  User: FOODNAMOO
  Date: 2023-02-03
  Time: 오후 4:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns:c="">
<head>
    <title>Title</title>
</head>

<style>

    .layout {
        width : 500px;
        margin : 0 auto;
        margin-top : 40px;
    }

</style>

<body>
    <div class="layout">
        <table>
            <thead>
                <tr>
                    <th>닉네임</th>
                    <th>제목</th>
                </tr>
            </thead>
            <tbody>
                    <td><c:forEach items="${posts}" var="post">
                        <tr>
                            <td><c:out value="${post.nickname}"/></td>
                            <td><a href="/post/view/${post.id}"><c:out value="${post.title}"/></a></td>
                            <td><a href="javascript:remove(${post.id})"><b>삭제</b></a></td>
                        </tr>
                    </c:forEach></td>
            </tbody>
        </table>
    </div>
</body>
</html>
<script type="script" src=""></script>