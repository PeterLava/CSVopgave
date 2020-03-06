package CSVOpgavePck;
import java.util.Arrays;
import java.util.Scanner;

class Sorting {

    private static PrintOut printOut = new PrintOut();

    void sortByYear(MovieProfile[] movieProfiles){
      Arrays.sort(movieProfiles, (b,a) -> a.titleYear.compareTo(b.titleYear));
      printOut.allMovies(movieProfiles);
    }

    void sortByRating(MovieProfile[] movieProfiles){
        Arrays.sort(movieProfiles, (b,a) -> a.imdbScore.compareTo(b.imdbScore));
        printOut.allMovies(movieProfiles);
    }

    void searchForActor(MovieProfile[] movieProfiles){
        System.out.print("Which actor would you like to look up?:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < 500 ; i++) {

            if (    (input.equals(movieProfiles[i].actor1Name))
                ||  (input.equals(movieProfiles[i].actor2Name))
                ||  (input.equals(movieProfiles[i].actor3Name))
                ){
                printOut.aMovie(movieProfiles,i);
            }
        }
    }

    void searchForDirector(MovieProfile[] movieProfiles){
        System.out.print("Which director would you like to look up?:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < 500 ; i++) {

            if (input.equals(movieProfiles[i].directorName)){
                printOut.aMovie(movieProfiles,i);
            }
        }
    }

}
