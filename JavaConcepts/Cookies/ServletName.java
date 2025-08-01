package com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletName extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	
	 Cookie c1 = new Cookie("username", username);
	 Cookie c2 =  new Cookie("password",password);
	
	resp.addCookie(c1);
	resp.addCookie(c2);
	System.out.println("Cookies added Successfully.");
}
}
