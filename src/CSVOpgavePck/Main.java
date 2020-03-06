package CSVOpgavePck;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    private static MovieProfile[] movieProfiles = new MovieProfile[500];
    private static Sorting sorting = new Sorting();
    private static PrintOut printOut = new PrintOut();
    private static Init init = new Init();


    public static void main(String[] args) {

        init.initialiseObjects(movieProfiles);
        Arrays.sort(movieProfiles, (b, a) -> a.titleYear.compareTo(b.titleYear));
        boolean run = true;

        while (run){

        printOut.mainMenu();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input) {
            case "1":
                sorting.sortByYear(movieProfiles);
                break;
            case "2":
                sorting.searchForActor(movieProfiles);
                break;
            case "3":
                run = false;
                break;
            default:
                System.out.print("invalid input, ");
        }
            if(!(input.equals("3"))){
                System.out.print("press any key for menu");
                scan.nextLine();
            }

        }

    }
}