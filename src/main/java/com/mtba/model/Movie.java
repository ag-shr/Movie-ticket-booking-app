package com.mtba.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	String name;
	List<Actor> actors;
	double rating;
	
	public Movie(String name) {
		this.name = name;
		this.actors = new ArrayList<Actor>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public void addActor(Actor actor) {
		int index = this.actors.indexOf(actor);
		if(index == -1) this.actors.add(actor);
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equals(((Movie)obj).getName());
	}
}
