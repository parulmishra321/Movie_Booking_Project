package com.movies.services;

import java.io.IOException;
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

import com.movies.model.Admin;
import com.movies.model.User;



@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
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
		Session session = null;
	    Transaction transaction = null;
	    
	    try {
		      session = getSessionFactory().openSession();
		      transaction=session.getTransaction();
		        	  if(!transaction.isActive()) 
		      transaction.begin();
		      User user = new User();
//		  		int custid = Integer.parseInt(request.getParameter("id"));
//		  		String cfirstname = request.getParameter("fname");
//		  		String clastname = request.getParameter("lname");
//		  		String cemail = request.getParameter("email");
			
		     
		      user.setUser_name(request.getParameter("Name"));
		      user.setUser_Password(request.getParameter("Password"));
		      user.setUser_email(request.getParameter("Emailid"));
		      user.setUser_Pno(request.getParameter("PhoneNumber"));
		      user.setGender(request.getParameter("sex"));
		      session.save(user);	
		
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


