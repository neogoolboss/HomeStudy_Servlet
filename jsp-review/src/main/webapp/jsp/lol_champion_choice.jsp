<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>L.O.L Champion Choice</title>
</head>
<body>
    <form action="/champion/choice" method="post">
    <%
        String campName = (String) request.getAttribute("campName");
        System.out.println("choice campName = " + campName);
    %>
    <h1> <%= campName %> 챔피언을 선택해주세요.</h1>
        <input type="hidden" name="campName" value="<%= campName %>">
        <%
            switch (campName) {
                case "데마시아" :
        %>
                <select name="championName" id="champion">
                    <option value="가렌">가렌</option>
                    <option value="럭스">럭스</option>
                    <option value="갈리오">갈리오</option>
                    <option value="자르반4세">자르반4세</option>
                    <option value="뽀삐">뽀삐</option>
                </select>
        <%
                break;
                case "공허" :
        %>
                <select name="championName">
                    <option value="초가스">초가스</option>
                    <option value="카직스">카직스</option>
                    <option value="벨베스">벨베스</option>
                    <option value="벨코즈">벨코즈</option>
                    <option value="카사딘">카사딘</option>
                </select>
        <%
                break;
                case "녹서스" :
        %>
                <select name="championName">
                    <option value="다리우스">다리우스</option>
                    <option value="카타리나">카타리나</option>
                    <option value="드레이븐">드레이븐</option>
                    <option value="스웨인">스웨인</option>
                    <option value="사미라">사미라</option>
                </select>
        <%
                break;
                case "프렐요드" :
        %>
                <select name="championName">
                    <option value="애쉬">애쉬</option>
                    <option value="트린다미어">트린다미어</option>
                    <option value="세주아니">세주아니</option>
                    <option value="누누와윌럼프">누누와윌럼프</option>
                    <option value="브라움">브라움</option>
                </select>
        <%
                break;
                case "자운" :
        %>
                <select name="championName">
                    <option value="빅토르">빅토르</option>
                    <option value="신지드">신지드</option>
                    <option value="우르곳">우르곳</option>
                    <option value="자크">자크</option>
                    <option value="트위치">트위치</option>
                </select>
        <%
                break;
                }
        %>
        <button type="submit">선 택 완 료</button>
    </form>


</body>
</html>
