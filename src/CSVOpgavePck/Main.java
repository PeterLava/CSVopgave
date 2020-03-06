package CSVOpgavePck;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    private static MovieProfile[] movieProfiles = new MovieProfile[500];
    private static Sorting sorting = new Sorting();
    private static Init init = new Init();


    public static void main(String[] args) {

        final String textBold = "\u001B[1;0m";
        final String textReset = "\u001B[0m";
        init.initialiseObjects(movieProfiles);


        System.out.println(textBold);
        System.out.println("                    Movie Menu                    "+textReset);
        System.out.println("--------------------------------------------------");
        System.out.println("-------------  1. List all movies  ---------------");
        System.out.println("-------------  2. Search for an actor  -----------");
        System.out.println("--------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch (input){
            case "1": sorting.sortByYear(movieProfiles);
            break;
            case "2": sorting.searchForActor(movieProfiles);
            break;
            default:  System.out.println("invalid input");


        }

    }
}