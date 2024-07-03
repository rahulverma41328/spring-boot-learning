package com.user;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Register extends HttpServlet{


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("user_name");
        String email = request.getParameter("user_email");
        String password = request.getParameter("user_password");

        //out.println(name+ " " + password+ " "+ email);

        // connection...
        try {

            Thread.sleep(3000);
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","rahul");

            // query...
            String q = "insert into users(name,password,email) values(?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            pstmt.setString(3,email);

            pstmt.executeUpdate();

            out.println("done");
        }catch (Exception e){
            e.printStackTrace();
            out.println("error");
        }



        // store data...

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req,resp);
        }catch (ServletException e){
            throw new ServletException(e);
        }
    }
}
