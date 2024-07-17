import java.util.ArrayList;
import java.util.List;

public class MovieSystem {
    private List<Movie> movies;

    public MovieSystem() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void displayMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.getMovieId() + ": " + movie.getName() + " - $" + movie.getPrice());
        }
    }

    public String findMovieById(int movieId) {
        for (Movie movie : movies) {
            if (movie.getMovieId() == movieId) {
                return movie.getDetails();
            }
        }
        return "Movie not found.";
    }
}