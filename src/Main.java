public class Main {
    public static void main(String[] args) {
        MovieSystem movieSystem = new MovieSystem();

        // 添加电影
        movieSystem.addMovie(new Movie(1, "出拳吧，妈妈", 9.99));
        movieSystem.addMovie(new Movie(2, "一点就到家", 7.99));
        movieSystem.addMovie(new Movie(3, "月球坠落", 8.99));

        // 展示所有电影
        System.out.println("All movies in the system:");
        movieSystem.displayMovies();

        // 查询特定电影的详细信息
        int movieIdToFind = 2;
        System.out.println("\nDetails of movie with ID " + movieIdToFind + ":");
        System.out.println(movieSystem.findMovieById(movieIdToFind));
    }
}