package CSVOpgavePck;

class PrintOut {

    private final String textBold = "\u001B[1;0m";
    private final String textReset = "\u001B[0m";
    private final String textGreen = "\u001B[32m";
    private final String textRed = "\u001B[31m";
    private final String textBlue = "\u001B[34m";

    void mainMenu(){
        System.out.println(textBold);
        System.out.println("                    Movie Menu                    "+textReset);
        System.out.println("--------------------------------------------------");
        System.out.println("-------------  1. List all movies  ---------------");
        System.out.println("-------------  2. Search for an actor  -----------");
        System.out.println("-------------  3. Search for a director  ---------");
        System.out.println("-------------  4. Write movielist to file  -------");
        System.out.println("-------------  5. Exit  --------------------------");
        System.out.println("--------------------------------------------------");
    }

    void sortingMenu(){
        System.out.println(textBold);
        System.out.println("                    Sort by:                      "+textReset);
        System.out.println("--------------------------------------------------");
        System.out.println("-------------  1. IMDB Score  --------------------");
        System.out.println("-------------  2. Year  --------------------------");
        System.out.println("--------------------------------------------------");

    }

    void aMovie(MovieProfile[] movieProfiles, int i){
        System.out.print(textBold);
        System.out.print("Movie title: ");
        System.out.print(textBlue + movieProfiles[i].getMovieTitle());
        System.out.print(textBold);
        System.out.print(" Director: ");
        System.out.print(textGreen + movieProfiles[i].getDirectorName());
        System.out.print(textBold);
        System.out.print(" Genre: ");
        System.out.print(textRed + movieProfiles[i].getGenres());
        System.out.print(textBold);
        System.out.print(" Year: ");
        System.out.print(textRed + movieProfiles[i].getTitleYear());
        System.out.println(" "+textReset);
    }

    void allMovies(MovieProfile[] movieProfiles){
        for (int i = 0; i < 500 ; i++) {
            System.out.print(i+1+". ");
           aMovie(movieProfiles,i);
        }

    }




}
