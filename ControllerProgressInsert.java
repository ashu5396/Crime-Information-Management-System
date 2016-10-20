package com.demo.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerProgressInsert
 */
public class ControllerProgressInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerProgressInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	ProgressData ob1 =new ProgressData();
		 DAOProgress dao = new DAOProgress();
		 
String ca_id= request.getParameter("case_id");
String cr_id= request.getParameter("cri_id");
String dt= request.getParameter("date");
String cmt= request.getParameter("comment");
String sts= request.getParameter("status");

ob1.setCase_id(ca_id);
ob1.setCri_id(cr_id);
ob1.setDate(dt);
ob1.setComment(cmt);
ob1.setStatus(sts);

boolean flag_status=dao.insertProgress(ob1);
response.getWriter().print("Retuned flag_status = "+flag_status);

request.setAttribute("reply", flag_status);

RequestDispatcher rd=request.getRequestDispatcher("/ViewInsertProgress.jsp");
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
