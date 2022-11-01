package com.pk.SessionMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		String UserName = (String) session.getAttribute("myuser");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>User Name is " + UserName + "</h1>");

	}

}
