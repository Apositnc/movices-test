public class Movie {
    private int movieId;
    private String name;
    private double price;

    public Movie(int movieId, String name, double price) {
        this.movieId = movieId;
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return "Movie ID: " + movieId + ", Name: " + name + ", Price: $" + price;
    }

    // Getters and Setters
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
