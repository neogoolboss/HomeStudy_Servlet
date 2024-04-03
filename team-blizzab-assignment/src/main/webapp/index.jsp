<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>2024.04.03 팀 과제</title>

    <link rel="stylesheet" href="./css/jspstyle.css" type="text/css">
</head>
<body>
    <h1 class="제목핑크">Forword 활용한 정보 받기</h1>
    <hr>

    <form action="forwordinfo" method="post">
        <table>
            <tr>
                <td>아이디 : </td>
                <td>
                    <input type="text" name="userId" placeholder="아이디를 입력하세요.">
                </td>
            </tr>
            <tr>
                <td>비밀번호 : </td>
                <td>
                    <input type="password" name="password" placeholder="비밀번호를 입력하세요.">
                </td>
            </tr>
            <tr>
                <td>이름 : </td>
                <td>
                    <input type="text" name="userName" placeholder="이름을 입력하세요.">
                </td>
            </tr>
            <tr>
                <td>성별 : </td>
                <td>
                    <!-- 라벨에 for="id"를 넣어주면 라벨 클릭 시 radio input 선택 가능-->
                    <input type="radio" name="gender" id="male" value="M">
                    <label for="male">남자</label>
                    <input type="radio" name="gender" id="female" value="F">
                    <label for="female">여자</label>
                </td>
            </tr>
            <tr>
                <td>취미 : </td>
                <td>
                    <input type="checkbox" name="hobbies" id="game" value="game">
                    <label for="game">게임</label>
                    <input type="checkbox" name="hobbies" id="drive" value="drive">
                    <label for="drive">운전</label>
                    <input type="checkbox" name="hobbies" id="baseball" value="baseball">
                    <label for="baseball">야구</label>
                </td>
            </tr>
            <tr>
                <td>좋아하는 아이돌 : </td>
                <td>
                    <select name="idol">
                        <option value="none">===선택===</option>
                        <option value="ive">아이브</option>
                        <option value="ses">SES</option>
                        <option value="finkl">핑클</option>
                        <option value="girlfriend">여자친구</option>
                        <option value="iu">아이유</option>
                        <!-- selected를 넣으면 default 값으로 지정 가능. -->
                    </select>
                </td>
            </tr>
        </table>
            <br>
            <div class="button">
                    <button type="submit">전송</button>
                    <button type="reset">초기화</button>
            </div>
    </form>
    <br>
    <hr>
    <h1 class="제목파랑">Redirect 연습</h1>
    <hr>

    <form action="otherservlet" method="get">
        <table>
            <tr>
                <td>아이디 : </td>
                <td>
                    <input type="text" name="userId" placeholder="아이디를 입력하세요.">
                </td>
            </tr>
            <tr>
                <td>비밀번호 : </td>
                <td>
                    <input type="password" name="password" placeholder="비밀번호를 입력하세요.">
                </td>
            </tr>
            <tr>
                <td>이름 : </td>
                <td>
                    <input type="text" name="userName" placeholder="이름을 입력하세요.">
                </td>
            </tr>
            <tr>
                <td>성별 : </td>
                <td>
                    <!-- 라벨에 for="id"를 넣어주면 라벨 클릭 시 radio input 선택 가능-->
                    <input type="radio" name="gender" id="male2" value="M">
                    <label for="male">남자</label>
                    <input type="radio" name="gender" id="female2" value="F">
                    <label for="female">여자</label>
                </td>
            </tr>
            <tr>
                <td>취미 : </td>
                <td>
                    <input type="checkbox" name="hobbies" id="game2" value="game2">
                    <label for="game2">게임</label>
                    <input type="checkbox" name="hobbies" id="drive2" value="drive2">
                    <label for="drive2">운전</label>
                    <input type="checkbox" name="hobbies" id="baseball2" value="baseball2">
                    <label for="baseball2">야구</label>
                </td>
            </tr>
            <tr>
                <td>좋아하는 아이돌 : </td>
                <td>
                    <select name="idol">
                        <option value="none">===선택===</option>
                        <option value="ive">아이브</option>
                        <option value="ses">SES</option>
                        <option value="finkl">핑클</option>
                        <option value="girlfriend">여자친구</option>
                        <option value="iu">아이유</option>
                        <!-- selected를 넣으면 default 값으로 지정 가능. -->
                    </select>
                </td>
            </tr>
        </table>
        <br>
        <div class="button">
            <button type="submit">전송</button>
            <button type="reset">초기화</button>
        </div>
    </form>


</body>
</html>