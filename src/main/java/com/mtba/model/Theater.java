package com.mtba.model;

import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Theater {
	private String name;
	private City city;
	private String address;
	private Point2D location;
	private Set<Movie> movies;
	private Map<Screen,Movie> screenToMovies;
	
	public Theater(String name,City city) {
		this.name = name;
		this.city = city;
		screenToMovies = new HashMap<Screen,Movie>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Point2D getLocation() {
		return location;
	}

	public void setLocation(Point2D location) {
		this.location = location;
	}
	
	public void addMovie(Movie movie) {
		if(!movies.contains(movie)) movies.add(movie);
	}
}
