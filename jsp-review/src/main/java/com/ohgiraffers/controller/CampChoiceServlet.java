package com.ohgiraffers.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/camp/choice")
public class CampChoiceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String campName = req.getParameter("campName");
        System.out.println("campName = " + campName);

        req.setAttribute("campName", campName);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/lol_champion_choice.jsp");
        requestDispatcher.forward(req, resp);
        
    }
}
