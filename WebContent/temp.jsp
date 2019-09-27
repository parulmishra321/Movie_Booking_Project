<%@page import="com.movies.model.Movies"%>
<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		ArrayList<Movies> allMovies = (ArrayList<Movies>) request.getAttribute("data");

		Iterator<Movies> iterator = allMovies.iterator();
		while (iterator.hasNext()) // iterate through all the data until the last record
		{
			Movies m = iterator.next(); //assign individual employee record to the employee class object
			out.println(m.getM_name());
	
		}
	%>
	
</body>
</html>