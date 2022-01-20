package com.mtba.servicetest;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.mtba.service.ServiceImpl;

public class TestServiceA {
	
	@Before
	public void setup() throws IOException {
		ServiceImpl serviceA = new ServiceImpl();
		serviceA.readData(new String("../Movie-ticket-booking-app/data/testdata.csv"));
		ServiceImpl serviceB = new ServiceImpl();
	}
	
	@Test
	public void testGetMoviesA() {
		
	}
	
	@Test
	public void testGetMoviesB() {
		
	}
	
	@Test
	public void getMoviesAboveRating() {
		
	}

}
