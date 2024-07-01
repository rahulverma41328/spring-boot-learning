package com.servlet.session;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;


public class servlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()){
            out.println("<h1>this is servlet process request</h2>");

            String name = request.getParameter("name");
            out.println("<br><br>");
            out.println("<h1>this is servlet 1</h1>");
            out.println("<h1>Hello, " + name + "welcome to my website..</h1>");
            out.println("<h1><a href='servlet2'>Go to servlet 2</a></h1>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processRequest(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");

        out.println("</body>");
        out.println("</html>");
    }

}
