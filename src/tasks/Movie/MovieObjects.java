package tasks.Movie;
public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021",
                "Kuzzat Altay");
        String[] casts = {"Asiya", "Adam", "Muhtar", "Burak", "Hilal", "Yasin", "Luna", "Fatih"};
        movie1.addCasts(casts);
        System.out.println(movie1);
    }
}
