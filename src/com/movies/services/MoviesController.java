package com.movies.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;*/

import com.movies.model.Movies;

@WebServlet("/MoviesController")
public class MoviesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}*/

	
	 static ArrayList<Movies> allMovies = new ArrayList<>();
	public static String query() {
		allMovies.clear();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			ResultSet rs = null;
			try {
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbookingsystem",
						"root", "root");
				String sql = "select * from movies where m_category='action'";
				PreparedStatement ps = c.prepareStatement(sql);
				rs = ps.executeQuery();
				System.out.println("connected");
				System.out.println(rs.getFetchSize());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (rs.next()) {
				Movies movie = new Movies();
				String poster = rs.getString("m_poster");
				movie.setM_poster(poster);
				String trailer = rs.getString("m_trailer");
				movie.setM_trailer(trailer);
				String category = rs.getString("m_category");
				movie.setM_category(category);
				String name = rs.getString("m_name");
				movie.setM_name(name);
				String cast = rs.getString("m_cast");
				movie.setM_cast(cast);
				String release_date = rs.getString("m_release_date");
				movie.setM_release_date(release_date);
				String duration = rs.getString("m_duration");
				movie.setM_duration(duration);
				String short_desc = rs.getString("short_desc");
				movie.setShort_desc(short_desc);
				String long_desc = rs.getString("long_desc");
				movie.setLong_desc(long_desc);
				String country = rs.getString("m_country");
				movie.setM_country(country);
				String lang = rs.getString("m_lang");
				movie.setM_lang(lang);
				allMovies.add(movie);
//				System.out.println(poster);
//				System.out.println(trailer);
//				System.out.println(category);
//				System.out.println(name);
//				System.out.println(cast);
//				System.out.println(release_date);
//				System.out.println(duration);

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return null;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		query();
		//System.out.println("connected");

//		try {
//			QueryDao.query();
//			//System.out.println("connected");
//
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
	/*	Session session = null;
		Transaction transaction = null;
*///out.println("hello");
		//System.out.println(poster);
		
			/*session = getSessionFactory().openSession();
			transaction = session.getTransaction();
			if (!transaction.isActive())
				transaction.begin();
*/
		//System.out.println(allMovies);
				request.setAttribute("data", allMovies); 
				//response.sendRedirect("temp.jsp");
				RequestDispatcher rd = request.getRequestDispatcher("action.jsp");
				rd.include(request, response);
				//RequestDispatcher rd = request.getRequestDispatcher("register.html");
				//rd.include(request, response);
				//transaction.commit();
		// catch (Exception e) {
			/*if (transaction != null) {
				transaction.rollback()*/;
			
		//	e.printStackTrace();
		
	}

	

}
