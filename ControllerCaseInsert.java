package com.demo.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerCaseInsert
 */
public class ControllerCaseInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerCaseInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	CaseData ob1 = new CaseData();
	DAOCase dao = new DAOCase();
	
	String c_id = request.getParameter("case_id");
	String dt = request.getParameter("date");
	String pl = request.getParameter("place");
	String d_c = request.getParameter("des_crime");
	String vct = request.getParameter("victims");
	String dd = request.getParameter("detailed_description");
	String sst = request.getParameter("suspect");
	String ps = request.getParameter("p_station");
	
	ob1.setCase_id(c_id);
    ob1.setDate(dt);
    ob1.setPlace(pl);
    ob1.setDes_crime(d_c);
    ob1.setVictims(vct);
    ob1.setDetailed_description(dd);
    ob1.setSuspect(sst);
    ob1.setP_station(ps);

    boolean flag_status=dao.insertCase(ob1);
	response.getWriter().print("Retuned flag_status = "+flag_status);
	
	request.setAttribute("reply", flag_status);
	
	RequestDispatcher rd=request.getRequestDispatcher("/ViewInsertCaseRecord.jsp");
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
