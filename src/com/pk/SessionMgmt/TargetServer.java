package com.pk.SessionMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TargetServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("user");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>User Name is " + userName + "</h1>");

	}

}
