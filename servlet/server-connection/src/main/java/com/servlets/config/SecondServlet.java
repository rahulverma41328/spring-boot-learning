package com.servlets.config;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this is second servlet");

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();

        out.println("This is second servlet");
    }
}
