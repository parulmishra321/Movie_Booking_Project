package com.movies.model;

import java.time.*;

public class MovieHall {
	
	private int User_Id;
	private int Hall_no;
	private int No_of_seats;
	private LocalTime Movie_Start_Time;
	private String Seat_No;
	private String Seat_Type;
	
	public MovieHall(int hall_no, int no_of_seats, LocalTime movie_Start_Time, String seat_No, String seat_Type) {
		
		Hall_no = hall_no;
		No_of_seats = no_of_seats;
		Movie_Start_Time = movie_Start_Time;
		Seat_No = seat_No;
		Seat_Type = seat_Type;
	}
	
	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	
	public int getHall_no() {
		return Hall_no;
	}
	public void setHall_no(int hall_no) {
		Hall_no = hall_no;
	}
	public int getNo_of_seats() {
		return No_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		No_of_seats = no_of_seats;
	}
	public LocalTime getMovie_Start_Time() {
		return Movie_Start_Time;
	}
	public void setMovie_Start_Time(LocalTime movie_Start_Time) {
		Movie_Start_Time = movie_Start_Time;
	}
	public String getSeat_No() {
		return Seat_No;
	}
	public void setSeat_No(String seat_No) {
		Seat_No = seat_No;
	}
	public String getSeat_Type() {
		return Seat_Type;
	}
	public void setSeat_Type(String seat_Type) {
		Seat_Type = seat_Type;
	}
	
}
