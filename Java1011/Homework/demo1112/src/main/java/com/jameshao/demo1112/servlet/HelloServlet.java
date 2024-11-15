package com.jameshao.demo1112.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jameshao.demo1112.domain.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name = "helloServlet", value = "/hello",loadOnStartup = 0,
            initParams = { //初始参数
                @WebInitParam(name="setChar",value="utf-8")
            })
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException{
        System.out.println("----------init-----------");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("----------Get-----------");
//        ServletConfig config = this.getServletConfig();
//        String param1 = config.getInitParameter("serChar");
//        String username = request.getParameter("username");
//        PrintWriter out = response.getWriter();
//        response.setCharacterEncoding(param1);
//        System.out.println("初始参数:"+param1);
//        out.println("<html><body>");
//        out.println("<h1>username = " + username + "</h1>");
//        out.println("<p>初始参数 : " + param1 + "</p>");
//        out.println("</body></html>");

        request.setCharacterEncoding("utf-8");
        List<User> list = new ArrayList<>();
        list.add(new User("a",20));
        list.add(new User("b",22));

        PrintWriter pw = response.getWriter();
        ObjectMapper om = new ObjectMapper();

        pw.print(list);
        pw.flush();
        pw.close();

    }

    public void destroy() {
        System.out.println("----------destroy-----------");
    }
}