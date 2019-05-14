package com.jee.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jee.spring.dao.BaseDao;
import com.jee.spring.dao.BaseDaoImpl;
import com.jee.spring.pojo.User;

/**
 * Servlet implementation class RegistrationController
 */
//@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("registre.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg = "Password and Conform Passwords must be same";
		String page = "userRegistration.jsp";
		if(request.getParameter("password").equals(request.getParameter("confPassword"))){
			User user = new User();
		    user.setUsername(request.getParameter("username"));
		    user.setPassword(request.getParameter("password"));
		    user.setFirstName(request.getParameter("firstName"));
		    user.setLastName(request.getParameter("lastName"));
		    user.setDob(request.getParameter("dob"));
		    user.setEmailId(request.getParameter("emailId"));
		    user.setMobileNo(request.getParameter("mobileNo"));
		   
		    System.out.println(user.toString());
		    BaseDao baseDao = new BaseDaoImpl();
		    msg = baseDao.register(user);
			page = "login.jsp";
		}
		request.setAttribute("msg2", msg);
		request.getRequestDispatcher(page).include(request, response);
	}

}
