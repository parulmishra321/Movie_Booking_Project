package com.movies.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.movies.model.*;



@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
		.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration
		.buildSessionFactory(builder.build());
		return sessionFactory;
		}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String un = request.getParameter("Name");
				String pwd = request.getParameter("Password");
////				if(un.equals("Archit"))
////				{
////					out.println("Welcome,"+un);
////					HttpSession session = request.getSession(true);
////					session.setAttribute("user", un);
////					session.setMaxInactiveInterval(30);
////					response.sendRedirect("Home.jsp");
////				}
//				if(LoginAuthentication.validate(un,pwd)) {
//					RequestDispatcher rd = request.getRequestDispatcher("home.html");
//					rd.forward(request, response);
//				}
//				else
//				{
//					RequestDispatcher rd = request.getRequestDispatcher("Login_Page.html");
//					out.println("<font color = red> Either User Name or Password is wrong</font>");
//					rd.include(request, response);
//				}
		Session session = null;
	    Transaction transaction = null;
	    
	    try {
		      session = getSessionFactory().openSession();
		      transaction=session.getTransaction();
		        	  if(!transaction.isActive()) 
		      transaction.begin();
	
//		  		int custid = Integer.parseInt(request.getParameter("id"));
//		  		String cfirstname = request.getParameter("fname");
//		  		String clastname = request.getParameter("lname");
//		  		String cemail = request.getParameter("email");
			
//		      admin.setAdmin_id(Integer.parseInt(request.getParameter("id")));
//		      admin.setAdmin_name(request.getParameter("fname"));
		    
		    if(LoginAuthentication.validate(un,pwd)) {
		    	
		    	
		    	RequestDispatcher rd = request.getRequestDispatcher("index.html");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				//out.println("<font color = red> Either User Name or Password is wrong</font>");
				rd.include(request, response);
			}
		      
		
		      transaction.commit();
		    } catch (Exception e) {
		      if (transaction != null) {
		        transaction.rollback();
		      }
		      e.printStackTrace();
		    } finally {
		      if (session != null) {
		        session.close();
		      }
		    }
	   
	    
	    
		   
		  }
	
	
}

	

