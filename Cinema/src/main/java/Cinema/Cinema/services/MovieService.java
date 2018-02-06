package Cinema.Cinema.services;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Cinema.Cinema.models.Movie;

public class MovieService {

	private Map<Integer, Movie> movies;
	private ObjectMapper toJSON;
	private int highestID = 0;

	public MovieService() {
		movies = new HashMap<>();
		toJSON = new ObjectMapper();
	}

	public void addMovie(Movie movie) {
		movies.put(highestID, movie);
		highestID++;
	}

	public Movie getMovie(int id) {
		return movies.get(Integer.valueOf(id));
	}

	public String getMovieAsJSON(int id) {
		try {
			return toJSON.writeValueAsString(getMovie(id));
		} catch (JsonProcessingException e) {
			return "null";
		}
	}

	public int numberOfMovies() {
		return movies.size();
	}

	public String showAllMovies() {
		StringBuilder builder = new StringBuilder();

		movies.forEach((key, value) -> builder.append(key + " | " + value.toString() + "\n"));

		return builder.toString();
	}

	public String getAllMoviesAsJSON() {
		try {
			return toJSON.writeValueAsString(movies);
		} catch (JsonProcessingException e) {
			return "null";
		}
	}

	public int countGenre(String genre) {
		int count = 0;

		for (Integer key : movies.keySet()) {
			Movie m = movies.get(key);
			if (m.getGenre().equalsIgnoreCase(genre)) {
				count++;
			}
		}

		return count;
	}

}
