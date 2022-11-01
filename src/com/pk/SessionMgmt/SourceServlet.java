package com.pk.SessionMgmt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SourceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		
		String UserName = request.getParameter("username");

		HttpSession session = request.getSession();
		session.setAttribute("myuser", UserName);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<a href='TargetServlet'>Click Here To Get The User Name</a>");

	}
}
