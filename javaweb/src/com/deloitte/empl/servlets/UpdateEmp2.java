//In this program for a normal user only values are displayed
//only admin will get the update or delete option

package com.deloitte.empl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class UpdateEmp2
 */
@WebServlet("/UpdateEmp2")
public class UpdateEmp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpDao dao = new EmpDaoImpl();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int code = Integer.parseInt(request.getParameter("code"));
		  Emp emp = dao.getEmpByCode(code);
		  
		  request.setAttribute("emp", emp);
		  request.getRequestDispatcher("UpdateEmp.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		
		Emp emp = new Emp();
		
		emp.setEmpno(empno);
		emp.setEname(ename);
		emp.setJob(job);
		
		int rows = dao.updateEmp2(emp);
		request.getRequestDispatcher("GetEmpls").forward(request, response);
		
		
		
		
		
		
	}

}
