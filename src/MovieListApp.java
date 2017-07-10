import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joyapuryear on 7/7/17.
 */
public class MovieListApp {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram(){
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            Movie movie = new Movie();
            System.out.println("Enter a category:  (Drama, Action, Romance, or Comedy)");
            Scanner scan = new Scanner(System.in);


            //System.out.println();
            String userChoice = scan.nextLine();
            do{validEntry(userChoice);}while(false);


            for (Movie m : movie.listOfMovies()) {
                //System.out.println(m);

                if (userChoice.equalsIgnoreCase(m.getCategory())) {

                    System.out.println(m);
                }

            }




            System.out.println("Would you like to input another category? (y/n)");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye!");
    }

    public static boolean validEntry(String s) {
        boolean foundIt = false;
        ArrayList<String> category = new ArrayList<>();
        category.add("Drama");
        category.add("Comedy");
        category.add("Action");
        category.add("Romance");

        String tester = "";


            for (int i = 0; i < category.size(); i++) {
                tester = category.get(i);
                if(tester.equals(s)){foundIt = true;}
            }
            System.out.println("Invalid input! Please enter a valid catergory: ");
            String s1 = "";
            Scanner scan = new Scanner(System.in);
            s1 = scan.nextLine();
            //runProgram();
            //validEntry(s1);

        return foundIt;
    }
}
