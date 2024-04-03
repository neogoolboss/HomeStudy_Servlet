package com.ohgiraffers.redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("RedirectServlet으로 redirect 성공");

        // redirect에서는 값을 불러 올 수 없다. Array에서 null 때문에 500 에러가 나므로 주석처리함.
//        String userId = req.getParameter("userId");
//        String password = req.getParameter("password");
//        String userName = req.getParameter("userName");
//        String gender = req.getParameter("gender");
//        String[] hobbies = req.getParameterValues("hobbies");
//        String idol = req.getParameter("idol");
//
//        // console에서 확인하기
//        System.out.println("userId = " + userId);
//        System.out.println("password = " + password);
//        System.out.println("userName = " + userName);
//        System.out.println("gender = " + gender);
//        for(String hobby : hobbies) {
//            System.out.println("hobby = " + hobby);
//        }
//        System.out.println("idol = " + idol);


    }
}
