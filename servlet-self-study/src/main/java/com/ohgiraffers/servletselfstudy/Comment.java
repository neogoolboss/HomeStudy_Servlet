package com.ohgiraffers.servletselfstudy;

public class Comment {

    public static void main(String[] args) {

        /* Servlet이란?
        *  Java를 사용하여 웹페이지를 동적으로 생성하는 서버측 프로그램 혹은 그 사양을 말한다.
        * JSP와 비슷하지만 JSP는 HTML 문서 안에 Java코드를 포함하는 반면,
        * 서블릿은 자바코드안에 HTML을 포함하고 있다.
        * */

        /* Servlet Life-Cycle
        *  Init() : 서블릿이 메모리에 로드될 때 한번만 호출(코드 수정 시 다시 호출) 🔴
        *  doGet() : GET방식으로 data 전송 시 호출 🟡
        *  doPost() : POST방식으로 data 전송 시 호출 🟡
        *  service() : 모든 요청은 service()를 통해 doGET() or doPost() 메서드로 이동 🟡
        *  destroy() : 서블릿이 메모리에서 해제되면 호출 🔴
        *
        * 🔴 : 최초 요청 시 한번만 실행
        * 🟡 : 요청시마다 반복 실행
        * */

        /* Parameter 전송방식
        *  ✅ GET 방식
        *       - 특징 : 전송되는 데이터가 URL 뒤 QueryString으로 전달
        *       - 장점 : 간단한 데이터를 빠르게 전송. form tag 뿐만 아니라 직접 URL에 입력하여 전송 가능
        *       - 단점 : 데이터 양에 제한이 있다. 보안상의 문제(URL에 노출)
        *
        *  ✅ POST 방식
        *       - 특징 : URL과 별도로 전송. HTTP header 뒤 body에 입력 스트림 데이터로 전달
        *       - 장점 : 데이터의 제한이 없음. 최소한의 보안유지 효과
        *       - 단점 : 전달 데이터의 양이 같은 경우 GET보다 느리다.(전송패킷을 body에 구성해야 하기 때문)
        * */

        /* GET 방식 참고
        *
        *   http://www.ohgiraffers.com/study.jsp?parameter1=value1&parameter2=value2
        *   - www.ohgiraffers.com/study.jsp : URL
        *   - ? : QueryString 시작
        *   - parameter1 : Parameter 명(이름)
        *   - =value1 : Parameter 값
        *   - & : QueryString 구분
        * */


    }

}
