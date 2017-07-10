import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joyapuryear on 7/7/17.
 */
public class Movie {
    private String title;
    private String category;


    //constructor

    public Movie() {

    }

    // overload constructor
    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return title ;
    }

    public ArrayList<Movie> listOfMovies() {

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Love and Basketball", "Drama"));
        list.add(new Movie("Gone With the Wind", "Drama"));
        list.add(new Movie("Citizen Kane", "Drama"));
        list.add(new Movie("Spiderman: Homecoming", "Action"));
        list.add(new Movie("The House", "Comedy"));
        list.add(new Movie("Cars 3", "Action"));
        list.add(new Movie("Boss Baby", "Comedy"));
        list.add(new Movie("The Sandlot", "Comedy"));
        list.add(new Movie("Everything, Everything", "Romance"));
        list.add(new Movie("The Big Sick", "Romance"));


        return list;

    }
}
