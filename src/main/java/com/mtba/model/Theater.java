package com.mtba.model;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Theater {
	private String name;
	private City city;
	private String address;
	private Point2D location;
	private Map<Screen,Movie> screenToMovies;
	
	public Theater(String name,City city) {
		this.name = name;
		this.city = city;
		this.screenToMovies = new HashMap<Screen,Movie>();
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
		if(!this.screenToMovies.values().contains(movie)) {
			Screen screen = new Screen("Screen ".concat(Integer.toString(screenToMovies.size()+1)),this,movie);
			this.screenToMovies.put(screen, movie);
		}
	}
	
	public Movie[] getMovies(){
		Object[] arr = this.screenToMovies.values().toArray();
		return Arrays.copyOf(arr,arr.length,Movie[].class);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getName().concat(this.getCity().getName()).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getName().equals(((Theater)obj).getName()) && this.getCity().equals(((Theater)obj).getCity());
	}

}
