package com.ohgiraffers.forword;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // ReceiveInformation.java 에서 setAttribute 한 것을 받아옴
        String userId = (String) req.getAttribute("userId");
        String userName = (String) req.getAttribute("userName");
        String gender = (String) req.getAttribute("gender");
        String[] hobbies = (String[]) req.getAttribute("hobbies");
        String idol = (String) req.getAttribute("idol");

        // 잘 불러 왔는지 확인함
        System.out.println("print servlet userId = " + userId);

        StringBuilder responseText = new StringBuilder();



        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1 align=\"center\">\n")
                .append(userName)
                .append("님 환영합니다 </h1>\n")
                .append("<h3 align=\"center\"> 당신의 ID는 ")
                .append(userId)
                .append(" 입니다.</h3>\n")
                .append("<h3 align=\"center\"> 당신의 성별은 ")
                .append(gender)
                .append(" 입니다.</h3>\n")
                .append("<h3 align=\"center\"> 당신의 취미는 ");
                for (int i = 0; i < hobbies.length; i++) {
                    responseText.append(hobbies[i]);
                    if (i < hobbies.length - 1) {
                        responseText.append(", ");
                    }
                }
                responseText.append(" 입니다.</h3>\n")
                .append("<h3 align=\"center\"> 당신의 최애 아이돌은 ")
                .append(idol)
                .append(" 입니다.</h3>\n")

                .append("</body>\n")
                .append("</html>\n");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println(responseText);
        out.flush();
        out.close();

    }
}
