package org.dogetdopost.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class javaForm extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			PrintWriter out = resp.getWriter();
			String name = req.getParameter("name");
			String EMail = req.getParameter("EMail");
			String pagename = javaForm.class.getSimpleName();
			/*
			out.println("HELLO: " + name);
			out.println("Your EMail: " + EMail);
			*/
			out.println("<html>");
			out.println("<head>");
			out.println("<title>"+ pagename +"</title>");
			out.println("<head/>");
			out.println("<body>");
			out.println("<h1>Hello: " + name + "<h1/>");
			out.println("<h1>Your EMail: " + EMail + "<h1/>");
			out.println("<body/>");
			out.println("<html/>");
			
		}
}
