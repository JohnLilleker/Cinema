package Cinema.Cinema.services;

import java.util.HashMap;
import java.util.Map;

import Cinema.Cinema.models.Movie;

public class MovieService {
	
	private Map<Integer, Movie> movies;
	private int highestID = 0;

	public MovieService() {
		movies = new HashMap<>();
	}
	
	public void addMovie(Movie movie) {
		movies.put(highestID, movie);
		highestID++;
	}
	
	public Movie getMovie(int id) {
		return movies.get(Integer.valueOf(id));
	}
	
	public int numberOfMovies() {
		return movies.size();
	}
	
	public String showAllMovies() {
		StringBuilder builder = new StringBuilder();
		
		movies.forEach((key, value) -> builder.append(key + " | " + value.toString() + "\n"));
		
		return builder.toString();
	}
	
	
	
}
