package com.demo.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerCaseUpdate
 */
public class ControllerCaseUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerCaseUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String c_id = request.getParameter("case_id");
		String dt = request.getParameter("date");
		String pl = request.getParameter("place");
		String d_c = request.getParameter("des_crime");
		String vct = request.getParameter("victims");
		
		String sst = request.getParameter("suspect");
		String ps = request.getParameter("p_station");
		
		
		DAOCase dao = new DAOCase();
		
		boolean flag_status=dao.updateCase(dt,pl,d_c,vct,sst,ps,c_id);
		response.getWriter().print("Retuned flag_status = "+flag_status);
		
		request.setAttribute("reply", flag_status);
		
		RequestDispatcher rd=request.getRequestDispatcher("/ViewUpdateCaseRecord.jsp");
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
