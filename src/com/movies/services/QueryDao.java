package com.movies.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QueryDao")
public class QueryDao extends HttpServlet {

	private static final long serialVersionUID = 1L;
	static String name;

	public static String query() {

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
				String poster = rs.getString("m_poster");
				String trailer = rs.getString("m_trailer");
				String category = rs.getString("m_category");
				 name = rs.getString("m_name");
				String cast = rs.getString("m_cast");
				String release_date = rs.getString("m_release_date");
				String duration = rs.getString("m_duration");
				String short_desc = rs.getString("short_desc");
				String long_desc = rs.getString("long_desc");
				String country = rs.getString("m_country");
				String lang = rs.getString("m_lang");
				System.out.println(poster);
				System.out.println(trailer);
				System.out.println(category);
				System.out.println(name);
				System.out.println(cast);
				System.out.println(release_date);
				System.out.println(duration);

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
		//response.sendRedirect("action.jsp?name="+name);
		
		

	}

}
