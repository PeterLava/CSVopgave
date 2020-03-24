package CSVOpgavePck;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    private static Sorting sorting = new Sorting();
    private static PrintOut printOut = new PrintOut();
    private static Init init = new Init();


    public static void main(String[] args) throws IOException, ParseException {
        MovieProfile[] movieProfiles = new MovieProfile[500];
        init.initialiseObjects(movieProfiles);
        Arrays.sort(movieProfiles, (b, a) -> a.titleYear.compareTo(b.titleYear));
        boolean run = true;

        while (run){

        printOut.mainMenu();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input) {
            case "1":
                printOut.sortingMenu();
                input = scan.nextLine();
                switch (input) {
                    case "1": sorting.sortByRating(movieProfiles);
                        break;
                    case "2": sorting.sortByYear(movieProfiles);
                        break;
                    default: break;
                }
                break;
            case "2":
                sorting.searchForActor(movieProfiles);
                break;
            case "3":
                sorting.searchForDirector(movieProfiles);
                break;
            case "4":
                WriteToCSV writeToCSV = new WriteToCSV();
                writeToCSV.convertToCSV(movieProfiles);
                break;
            case "5":
                InitJson initJson = new InitJson();
                initJson.Jsoninitialiser();
                break;
            case "6":
                run = false;
                break;
            default:
                System.out.print("invalid input, ");
        }
            if(!(input.equals("6"))){
                System.out.print("press any key for menu");
                scan.nextLine();
            }

        }

    }
}