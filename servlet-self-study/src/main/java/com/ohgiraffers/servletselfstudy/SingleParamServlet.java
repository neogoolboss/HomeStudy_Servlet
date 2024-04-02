package com.ohgiraffers.servletselfstudy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/singleparam")
public class SingleParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet 메서드 호출!");

        // 1.data get
        String name = req.getParameter("username");
        String id = req.getParameter("userid");
        int area = Integer.parseInt(req.getParameter("area"));

        // 2. 인삿말 글자색 적용하기(지역 value 값과 매칭)
        String color[] = {"blue", "orange", "pink", "green", "purple"};

        // 3. response page
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2 style=\"color:" + color[area] + "\"> 안녕하세요. " + name + "(" + id + ")님❤</h2>");
        out.println("</body>");
        out.println("</html>");

    }
    /* ===================================================================================================*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost 메서드 호출!");

        // 1. data get
        req.setCharacterEncoding("utf-8"); // doGet부분이랑 유일하게 다른 것. 내부적으로 io가 일어나기 때문에 인코딩 설정

        String name = req.getParameter("username");
        String id = req.getParameter("userid");
        int area = Integer.parseInt(req.getParameter("area"));

        // 2. 인삿말 글자색 적용하기
        String[] color = {"blue", "orange", "pink", "green", "purple"};

        // 3. response page
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2 style=\"color:" + color[area] + "\">안녕하세요. " + name + "(" + id + ")님❤</h2>");
        out.println("</body>");
        out.println("</html>");

    }

}
