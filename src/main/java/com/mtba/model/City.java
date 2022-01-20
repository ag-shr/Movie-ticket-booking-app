package com.mtba.model;

import java.util.ArrayList;
import java.util.List;

public class City {
	private String name;
	private List<Theater> theaters;
	private String state;
	
	public City(String name) {
		this.name = name;
		this.theaters = new ArrayList<Theater>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void addTheater(Theater theater) {
		int index = this.theaters.indexOf(theater);
		if(index == -1) this.theaters.add(theater);
	}
	
	public List<Theater> getTheaters(){
		return this.theaters;
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equals(((City)obj).getName());
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
