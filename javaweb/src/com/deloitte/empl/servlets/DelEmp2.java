package com.deloitte.empl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;

/**
 * Servlet implementation class DelEmp2
 */
@WebServlet("/DelEmp2")
public class DelEmp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int code = Integer.parseInt(request.getParameter("code"));
		  Emp emp = dao.getEmpByCode(code);
		  
		  request.setAttribute("emp", emp);
		  request.getRequestDispatcher("DelEmp.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		
		
		Emp emp = new Emp();
		
		emp.setEmpno(empno);
		
		
		
		int rows = dao.delEmp2(emp);
		request.getRequestDispatcher("GetEmpls").forward(request, response);
		
		
	}

}
