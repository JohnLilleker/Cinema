package Cinema.Cinema.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Cinema.Cinema.models.Movie;
import Cinema.Cinema.services.MovieService;

public class TestServiceFilter {

	MovieService service;

	@Before
	public void setUp() {
		service = new MovieService();
		service.addMovie(new Movie("Alien", "Sci-fi", "18"));
		service.addMovie(new Movie("Avatar", "Sci-fi", "12"));
		service.addMovie(new Movie("Moana", "Disney", "PG"));
		service.addMovie(new Movie("Aliens", "Sci-fi", "18"));
		service.addMovie(new Movie("The Hobbit", "Adventure", "12"));
		service.addMovie(new Movie("It", "Horror", "15"));
	}

	@Test
	public void testSciFiCount() {
		assertEquals(3, service.countGenre("sci-fi"));
	}

	@Test
	public void testFictionCount() {
		assertEquals(0, service.countGenre("fiction"));
	}

}
