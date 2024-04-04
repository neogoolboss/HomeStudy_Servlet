package com.ohgiraffers.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/champion/choice")
public class ChampionChoiceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String championName = req.getParameter("championName");
        String campName = req.getParameter("campName");
        System.out.println("Attribute campName = " + campName);
        System.out.println("championName = " + championName);

        String position ="";

        switch (championName) {

            case "가렌" : case "다리우스" : case "초가스" :
            case "트린다미어" : case "우르곳" : case "신지드" :
                position = "탑";
                break;

            case "자르반4세" : case "뽀삐" : case "카직스" :
            case "벨베스" : case "세주아니" : case "누누와윌럼프" :
            case "자크" :
                position = "정글";
                break;

            case "갈리오" : case "카사딘" : case "카타리나" : case "빅토르" :
                position = "미드";
                break;

            case "드레이븐" : case "사미라" : case "애쉬" : case "트위치" :
                position = "원딜";
                break;
            case "럭스" : case "벨코즈" : case "스웨인" :
            case "브라움" :
                position = "서폿";
                break;
        }

        req.setAttribute("championName", championName);
        req.setAttribute("position", position);
        req.setAttribute("campName", campName);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/yourChoice.jsp");
        requestDispatcher.forward(req, resp);
    }
}
