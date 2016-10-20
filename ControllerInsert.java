package com.demo.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerInsert
 */
public class ControllerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	 CrimeData ob1 =new CrimeData();
	 DAOCrime dao = new DAOCrime();
	 
	 
	 String cr_id = request.getParameter("cri_id");
	 String nm = request.getParameter("name");
	 String sx = request.getParameter("sex");
	 String ag = request.getParameter("age");
	 String add = request.getParameter("address");
	 String mk = request.getParameter("mark");
	 String cr_ar = request.getParameter("crime_area");
	 String cr_at = request.getParameter("crime_attached");
	 
	 ob1.setCri_id(cr_id);
	 ob1.setName(nm);
	 ob1.setSex(sx);
	 ob1.setAge(ag);
	 ob1.setAddress(add);
	 ob1.setMark(mk);
	 ob1.setCrime_area(cr_ar);
	 ob1.setCrime_attached(cr_at);
	 
	 
	 boolean flag_status=dao.insertCriminal(ob1);
		response.getWriter().print("Retuned flag_status = "+flag_status);
		
		request.setAttribute("reply", flag_status);
		
		RequestDispatcher rd=request.getRequestDispatcher("/ViewInsertRecord.jsp");
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
