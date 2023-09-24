package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.Details;
import com.register.DetailsBO;

public class servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname=req.getParameter("firstname");
				String lname= req.getParameter("lastname");
				String email= req.getParameter("email");
				String country= req.getParameter("country");
				String password= req.getParameter("password");
				
				Details d = new Details(fname,lname,email,country,password);
				DetailsBO bo=new DetailsBO();
				int i=bo.save(d);
				resp.setContentType("text/HTML");
				PrintWriter out=resp.getWriter();
				if(i==1)
				{
					req.getRequestDispatcher("/registersucess.html").forward(req, resp);
					
					
				}
				else
				{
					req.getRequestDispatcher("/registrationunsucess.html").forward(req, resp);
				}
				

	}
		

}
