package com.deloitte.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class GetEmpls
 */
@WebServlet(urlPatterns={"/GetEmpls"},initParams=
		{@WebInitParam(name="mobile",value="12345"),
			@WebInitParam(name="mob",value="123")})
public class GetEmpls extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmpDao dao = new EmpDaoImpl();
		List<Emp> emplist = dao.getEmpls();
		
		request.setAttribute("empls", emplist); 
		request.getRequestDispatcher("ViewEmpls.jsp").forward(request, response); 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request,response);
	
	}
	
	}

