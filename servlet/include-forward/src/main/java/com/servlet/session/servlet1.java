package com.servlet.session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            SerialException, IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()){
            //   out.println("<!DOCTYPE html");
            out.println("<h1>this is servlet 1</h2>");

            // forward request .....
            RequestDispatcher rd = request.getRequestDispatcher("sum1");
            rd.forward(request,response);

        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req,resp);
        } catch (SerialException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req,resp);
        } catch (SerialException e) {
            throw new RuntimeException(e);
        }


    }
}
