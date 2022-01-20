package com.mtba.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mtba.model.Actor;
import com.mtba.model.City;
import com.mtba.model.Movie;
import com.mtba.model.Theater;
import com.opencsv.CSVReader;

public class ServiceImpl implements Service{
	
	List<City> cities;
	List<Theater> theaters;
	List<Movie> movies;
	
	public ServiceImpl() {
		cities = new ArrayList<City>();
		theaters = new ArrayList<Theater>();
		movies = new ArrayList<Movie>();
	}

	public void readData(String path) throws IOException {
		FileReader fileReader = new FileReader(path);
		CSVReader csvReader = new CSVReader(fileReader);
		List<String[]> allLines = csvReader.readAll();
		csvReader.close();
		
		for(int i = 1; i < allLines.size();i++) this.addData(allLines.get(i));;
	}
	
	public void addData(String[] row) {
		City city = new City(row[0]);
		int index = cities.indexOf(city);
		if(index == -1) cities.add(city);
		
		city = cities.get(cities.indexOf(city));
		Theater theater = new Theater(row[1],city);
		city.addTheater(theater);
		index = theaters.indexOf(theater);
		if(index == -1) theaters.add(theater);
		
		Movie movie = new Movie(row[2]);
		movie.setRating(Double.parseDouble(row[6]));
		if(index == -1) theater.addMovie(movie);
		else theaters.get(index).addMovie(movie);
		index = movies.indexOf(movie);
		if(index == -1) movies.add(movie);
		
		for(int j = 3;j < row.length - 1;j++) {
			Actor actor = new Actor(row[j]);
			actor.addMovie(movie);
			if(index == -1) movie.addActor(actor);
			else movies.get(index).addActor(actor);
		}
	}
	
	public void printData() {
		for(City city:cities) {
			System.out.println(city.getName()+":");
			for(Theater theater:city.getTheaters()) {
				System.out.print(theater.getName()+"--> ");
				for(Movie movie:theater.getMovies()) System.out.print(movie.getName()+" ");
				System.out.println();
			}
			System.out.print("\n");
		}
	}
	
	public List<Theater> getTheaters(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Theater> getTheaters(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Movie> getMovies(Theater theater) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Movie> getMovies(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Movie> getMoviesAboveRating(float rating) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getAllShows(Theater theater, City city) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args){
		ServiceImpl service = new ServiceImpl();
		try {
			service.readData(new String("../Movie-ticket-booking-app/data/data.csv"));
			service.printData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
