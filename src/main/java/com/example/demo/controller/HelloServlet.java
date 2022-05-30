package com.example.demo.controller;

import com.example.demo.Model.MySqlUserModel;
import com.example.demo.Model.UserModel;
import com.example.demo.entity.Account;
import com.example.demo.entity.User;

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
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String birthday = (req.getParameter("birthday"));
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setFullName(fullName);
        account.setEmail(email);
        account.setPhone(phone);
        account.setBirthday(birthday);
        MySqlUserModel mySqlUserModel = new MySqlUserModel();
        mySqlUserModel.save(account);
        req.getRequestDispatcher("/user/register-success.jsp").forward(req, resp);
    }
}