package com.mtba.model;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Screen {
	private String name;
	private Theater theater;
	private Movie movie;
	private int daysInAdvance = 30;
	private Map<Integer,String> shows;
	private int numSeats;
	private Map<Integer,String> seats;
	private File calculationInfo;
	private MovieTicket[][][] screenToSeats;
	
	public Screen(String name, Theater theater, int numSeats, List<String> shows) {
		this.name = name;
		this.theater = theater;
		this.numSeats = numSeats;
		for(int i = 0;i < shows.size();i++) {
			this.shows.put(i, shows.get(i));
		}
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
