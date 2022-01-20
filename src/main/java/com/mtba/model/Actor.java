package com.mtba.model;

import java.util.ArrayList;
import java.util.List;

public class Actor {
	String name;
	List<Movie> movies;
	
	public Actor(String name) {
		this.name = name;
		this.movies = new ArrayList<Movie>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addMovie(Movie movie) {
		int index = this.movies.indexOf(movie);
		if(index == -1) this.movies.add(movie);
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equals(((Actor)obj).getName());
	}
}
