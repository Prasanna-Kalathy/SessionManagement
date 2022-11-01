package com.pk.SessionMgmt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SourceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String username = request.getParameter("username");

		HttpSession session = request.getSession();
		session.setAttribute("user", username);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<button onclick='TargetServlet'>User Name</button>");

	}
}
