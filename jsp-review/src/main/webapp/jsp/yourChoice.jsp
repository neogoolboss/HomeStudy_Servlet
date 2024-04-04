<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Choice</title>
</head>
<body>
    <%
        String campName = (String) request.getAttribute("campName");
        String championName = (String) request.getAttribute("championName");
        String position = (String) request.getAttribute("position");
    %>
    <h3>선택하신 진영은 : <%= campName %> 입니다.</h3>
    <h3>선택하신 챔피언은 : <%= championName %> 입니다.</h3>
    <h3>포지션은 <%= position %> 으로 배치됩니다.</h3>

</body>
</html>
