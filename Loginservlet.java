package com.demo.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String lname=request.getParameter("logname");
		String pword=request.getParameter("password");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd=request.getRequestDispatcher("link.html");
		rd.include(request,response);
		
		if(pword.equals("admin123")){
			out.print("<br>Your are Successfully login...");
			out.print("<br>W E L C O M E !!...");
			Cookie ck=new Cookie("logname",lname);
			response.addCookie(ck);
			
			
			
			
		}else{
			out.print("<br>Your login is Incorrect...<br><br>");
			
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
