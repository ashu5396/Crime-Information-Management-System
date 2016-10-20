package com.demo.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ControllerUpdate
 */
public class ControllerUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String cr_id = request.getParameter("cri_id");
		String nm = request.getParameter("name");
		 String add = request.getParameter("address");
		 String mk = request.getParameter("mark");
		 
		 DAOCrime dao=new DAOCrime();
	
		 boolean flag_status=dao.updateCriminal(cr_id,nm,add,mk);
			response.getWriter().print("Retuned flag_status = "+flag_status);
			
			request.setAttribute("reply", flag_status);
			
			RequestDispatcher rd=request.getRequestDispatcher("/ViewUpdateRecord.jsp");
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
