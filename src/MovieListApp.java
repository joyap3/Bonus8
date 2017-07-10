import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joyapuryear on 7/7/17.
 */
public class MovieListApp {


    public static void main(String[] args) {

        runProgram("");

//        String choice = "y";
//        String userChoice = "";
//        Scanner scan = new Scanner(System.in);
//        //runProgram();
//
//        do {
//
//            Movie movie = new Movie();
//            System.out.println("Enter a category:  (Drama, Action, Romance, or Comedy)");
//
//            userChoice = scan.nextLine();
//            validEntry(userChoice);
//
//
//            for (Movie m : movie.listOfMovies()) {
//
//                if (userChoice.equalsIgnoreCase(m.getCategory())) {
//
//                    System.out.println(m);
//                }
//
//            }
//
//            System.out.println("Would you like to input another category? (y/n)");
//            choice = scan.nextLine();
//
//        } while (!choice.equalsIgnoreCase("n"));
//        {
//
//            System.out.println("Goodbye!");
//        }
//    }
    }


    public static void validateEntry(String s) {
//
//        ArrayList<String> category = new ArrayList<>();
//        category.add("Drama");
//        category.add("Comedy");
//        category.add("Action");
//        category.add("Romance");
//
//        String tester = "";
//
//        for (int i = 0; i < category.size(); i++) {
//            tester = category.get(i);
            if (!tester.equalsIgnoreCase(m)) {
                System.out.println("Invalid input! Please enter a valid catergory: ");
                String s1 = "";
                Scanner scan = new Scanner(System.in);
                s1 = scan.nextLine();
                //validateEntry(s1);
            }
            Movie movie = new Movie();
            String userChoice = "";
            for (Movie m : movie.listOfMovies()) {

                if (userChoice.equalsIgnoreCase(m.getCategory())) {

                    System.out.println(m);
                }

            }

        }
    }

    public static void runProgram(String r) {
        String choice = "y";
        String userChoice = "";
        Scanner scan = new Scanner(System.in);

        do {

            Movie movie = new Movie();
            System.out.println("Enter a category:  (Drama, Action, Romance, or Comedy)");

            userChoice = scan.nextLine();
            validateEntry(userChoice);


            for (Movie m : movie.listOfMovies()) {

                if (userChoice.equalsIgnoreCase(m.getCategory())) {

                    System.out.println(m);
                }

            }

            System.out.println("Would you like to input another category? (y/n)");
            choice = scan.nextLine();

        } while (!choice.equalsIgnoreCase("n"));
        {

            System.out.println("Goodbye!");
        }
    }

}


