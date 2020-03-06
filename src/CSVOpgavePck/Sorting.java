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
            String actor1 = movieProfiles[i].actor1Name.toLowerCase();
            String actor2 = movieProfiles[i].actor2Name.toLowerCase();
            String actor3 = movieProfiles[i].actor3Name.toLowerCase();
            if (actor1.contains(input) ||  actor2.contains(input) ||  actor3.contains(input)){
                printOut.aMovie(movieProfiles,i);
            }
        }
    }

    void searchForDirector(MovieProfile[] movieProfiles){
        System.out.print("Which director would you like to look up?:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < 500 ; i++) {
        String director = movieProfiles[i].directorName.toLowerCase();
            if (director.contains(input)){
                printOut.aMovie(movieProfiles,i);
            }
        }
    }

}
