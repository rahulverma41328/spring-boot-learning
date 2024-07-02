package com.servlet.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("this is servlet2");

        // get all cookies
        Cookie[] cookies = req.getCookies();

        boolean f = false;
        String name = "";
        if (cookies==null){
            out.println("<h1>you are new user go to home page and submit your name");
            return;
        }
        else {
            for (Cookie cookie:cookies){
                String tname = cookie.getName();
                if (tname.equals("user_name")){
                    f=true;
                    name = cookie.getValue();
                }
            }
        }
        if (f){
            out.println("<h1>Hello, "+ name + "welcome back to my website... </h1>");
        }else {
            out.println("<h1>you are new user go to home page and submit your name");
        }

        out.println("<br><br>");
        out.println("</body>");
        out.println("</html>");
    }
}
