package com.servlet.attr;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;

public class Sum extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            SerialException, IOException{
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()){
         //   out.println("<!DOCTYPE html");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");

            String n1  = request.getParameter("n1");
            String n2 = request.getParameter("n2");

            int nn1 = Integer.parseInt(n1);
            int nn2 = Integer.parseInt(n2);

            //add
            int s = nn1+nn2;

            // attribute..........
            request.setAttribute("sum",s);

            // forward request .....
            RequestDispatcher rd = request.getRequestDispatcher("sum1");
            rd.forward(request,response);


            out.println("</body");
            out.println("</html");
        } catch (ServletException e) {
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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req,resp);
        } catch (SerialException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }
}
