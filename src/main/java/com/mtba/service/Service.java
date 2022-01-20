package com.mtba.service;

import java.util.List;

import com.mtba.model.City;
import com.mtba.model.Movie;
import com.mtba.model.Theater;

public interface Service {
	public List<Theater> getTheaters(City city);
	public List<Theater> getTheaters(Movie movie);
	public List<Movie> getMovies(Theater theater);
	public List<Movie> getMovies(City city);
	public List<Movie> getMoviesAboveRating(float rating);
	public List<String> getAllShows(Theater theater, City city);
}
