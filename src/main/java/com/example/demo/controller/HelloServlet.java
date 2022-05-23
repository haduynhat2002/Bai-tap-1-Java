package com.example.demo.controller;

import com.example.demo.entity.Account;

import java.io.*;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/user/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       resp.setContentType("type/html; character=UTF-8");
       resp.setCharacterEncoding("UTF-8");
       Account account = new Account();
       String userName = req.getParameter("userName");
       account.setUserName(userName);
       String password = req.getParameter("password");
       account.setPassword(password);
       String fullName = req.getParameter("fullName");
       account.setFullName(fullName);
       String email = req.getParameter("email");
       account.setEmail(email);
       String phone = req.getParameter("phone");
       account.setPhone(phone);
       String birth = req.getParameter("birthday");
       account.setBirthday(birth);
       req.setAttribute("account", account);
       req.getRequestDispatcher("/user/register-success.jsp").forward(req, resp);
    }
}