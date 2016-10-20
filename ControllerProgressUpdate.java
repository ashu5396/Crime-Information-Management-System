package com.demo.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerProgressUpdate
 */
public class ControllerProgressUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerProgressUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		String ca_id= request.getParameter("case_id");
		String cmt= request.getParameter("comment");
		String sts= request.getParameter("status");
		
		DAOProgress dao= new DAOProgress();
		
		boolean flag_status=dao.updateProgress(ca_id,cmt,sts);
		response.getWriter().print("Retuned flag_status = "+flag_status);
		
		request.setAttribute("reply", flag_status);
		
		RequestDispatcher rd=request.getRequestDispatcher("/ViewUpdateProgress.jsp");
		rd.forward(request, response);
		
	
	
	
	
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
