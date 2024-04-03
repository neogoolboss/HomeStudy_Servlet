package com.ohgiraffers.forword;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forwordinfo")
public class ReceiveInformation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // data 가져오기
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        String userName = req.getParameter("userName");
        String gender = req.getParameter("gender");
        String[] hobbies = req.getParameterValues("hobbies");
        String idol = req.getParameter("idol");

        // console에서 확인하기
        System.out.println("userId = " + userId);
        System.out.println("password = " + password);
        System.out.println("userName = " + userName);
        System.out.println("gender = " + gender);
        for(String hobby : hobbies) {
            System.out.println("hobby = " + hobby);
        }
        System.out.println("idol = " + idol);

        req.setAttribute("userId", userId);
        req.setAttribute("password", password);
        req.setAttribute("userName", userName);
        req.setAttribute("gender", gender);
        req.setAttribute("hobbies", hobbies);
        req.setAttribute("idol", idol);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("print");
        requestDispatcher.forward(req, resp);


    }
}
