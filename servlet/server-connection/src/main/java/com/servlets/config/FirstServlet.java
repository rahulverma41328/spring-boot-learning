package com.servlets.config;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class FirstServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servicing ....");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("This is my output from servlet method");
        out.println("<h1>Todays date and time is "+ new Date().toString() + "</h1>");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
