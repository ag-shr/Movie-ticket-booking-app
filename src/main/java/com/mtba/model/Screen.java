package com.mtba.model;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen {
	private String name;
	private Theater theater;
	private Movie movie;
	private int daysInAdvance = 30;
	private Map<Integer,String> shows;
	private int numSeats = 200;
	private Map<Integer,String> seats;
	private File calculationInfo;
	private MovieTicket[][][] screenToSeats;
	
	public Screen(String name, Theater theater, Movie movie) {
		this.name = name;
		this.theater = theater;
		this.shows = new HashMap<Integer,String>();
		
		this.shows.put(0, "09:00 AM - 12:00 PM");
		this.shows.put(1, "12:00 PM - 03:00 PM");
		this.shows.put(2, "03:00 PM - 06:00 PM");
		this.shows.put(3, "06:00 PM - 09:00 PM");
		this.shows.put(4, "09:00 PM - 12:00 AM");
		
		this.screenToSeats = new MovieTicket[this.daysInAdvance][this.shows.size()][this.numSeats];
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Theater getTheater() {
		return theater;
	}
	
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public int getDaysInAdvance() {
		return daysInAdvance;
	}
	
	public int getNumShows() {
		return this.shows.size();
	}
	public int getNumSeats() {
		return numSeats;
	}
}
