<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>SingleParamServlet</title>
</head>
<body>
  <h1>Servlet을 이용한 파라미터 전달</h1>
  <form name="paramform" method="post" action="singleparam">
    <div>
      <label for="userid">아이디 : </label>
      <input type="text" placeholder="아이디를 임력하세요." name="userid">
    </div>
    <div>
      <label for="username">이름 : </label>
      <input type="text" placeholder="이름을 입력하세요." name="username">
    </div>
    <div>
      <label for="area">지역 : </label>
      <select name="area">
        <option value="0">서울</option>
        <option value="1">경기</option>
        <option value="2">인천</option>
        <option value="3">강원</option>
        <option value="4">제주</option>
      </select>
    </div>
    <button type="submit">전송하기</button>

  </form>
</body>
</html>