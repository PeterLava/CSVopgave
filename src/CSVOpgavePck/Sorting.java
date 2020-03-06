package CSVOpgavePck;

import java.util.Arrays;
import java.util.Scanner;

class Sorting {

    private final String textGreen = "\u001B[32m";
    private final String textRed = "\u001B[31m";
    private final String textBlue = "\u001B[34m";
    private final String textReset = "\u001B[1;0m";

    void sortByYear(MovieProfile[] movieProfiles){
      Arrays.sort(movieProfiles, (b,a) -> a.titleYear.compareTo(b.titleYear));

        for (int i = 0; i < 500 ; i++) {
            System.out.print(textReset);
            System.out.print("Movie title: ");
            System.out.print(textBlue + movieProfiles[i].getMovieTitle() + textReset);
            System.out.print(" Director: ");
            System.out.print(textGreen + movieProfiles[i].getDirectorName() + textReset);
            System.out.print(" Genre: ");
            System.out.print(textRed + movieProfiles[i].getGenres() + textReset);
            System.out.print(" Year: ");
            System.out.println(textRed + movieProfiles[i].getTitleYear() + textReset);
        }
    }
    void searchForActor(MovieProfile[] movieProfiles){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < 500 ; i++) {

          //System.out.println(movieProfiles[i].actor1Name);
          //  System.out.println(movieProfiles[i].actor2Name);
          //  System.out.println(movieProfiles[i].actor3Name);

            if (input.equals(movieProfiles[i].actor1Name)){
                System.out.print(textReset);
                System.out.print("Movie title: ");
                System.out.print(textBlue + movieProfiles[i].getMovieTitle() + textReset);
                System.out.print(" Director: ");
                System.out.print(textGreen + movieProfiles[i].getDirectorName() + textReset);
                System.out.print(" Genre: ");
                System.out.print(textRed + movieProfiles[i].getGenres() + textReset);
                System.out.print(" Year: ");
                System.out.println(textRed + movieProfiles[i].getTitleYear() + textReset);
            }
        }
    }
}
