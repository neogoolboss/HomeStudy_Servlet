<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>L.O.L Camp Choice</title>
    <link rel="stylesheet" href="jspstyle.css">
</head>
<body>
    <h1>진영 선택</h1>
    <form action="/camp/choice" method="post">
        <select name="campName" id="camp">
            <option value="데마시아">데마시아</option>
            <option value="공허">공허</option>
            <option value="녹서스">녹서스</option>
            <option value="프렐요드">프렐요드</option>
            <option value="자운">자운</option>
        </select>
        <button type="submit">선택 완료</button>
    </form>
</body>
</html>
