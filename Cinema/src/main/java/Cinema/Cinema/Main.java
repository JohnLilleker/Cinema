package Cinema.Cinema;

import Cinema.Cinema.models.Movie;
import Cinema.Cinema.services.MovieService;

public class Main {

	public static void main(String[] args) {
		MovieService service = new MovieService();
		
		service.addMovie(new Movie("Movie", "Documenatry", "U"));
		service.addMovie(new Movie("Film", "Action", "12A"));
		
		System.out.println(service.getMovie(1));
		
		System.out.println(service.getMovie(4));
		
		System.out.println(service.numberOfMovies());
		
		System.out.println(service.showAllMovies());
		
	}

}
