package CSVOpgavePck;
import java.io.*;
import java.util.Arrays;
import java.util.List;

class WriteToCSV {


    void convertToCSV(MovieProfile[] movieProfiles) throws IOException {

List<String> data;
        String title;
        String director;
        String genre;
        String year;

        FileWriter csvWriter = new FileWriter("C:/Users/lenovo/desktop/movie500edited.csv");
        for (int i = 0; i < 500; i++) {
            title = movieProfiles[i].getMovieTitle();
            director = movieProfiles[i].getDirectorName();
            genre = movieProfiles[i].getGenres();
            year = movieProfiles[i].getTitleYear();

            if(title.equals("")){
                title = "unknown";
            }
            if(director.equals("")){
                director = "unknown";
            }
            if(genre.equals("")){
                genre = "unknown";
            }
            if(year.equals("")){
                year = "unknown";
            }
            data = Arrays.asList(title,director,genre,year);
            csvWriter.append(" ");
            csvWriter.append(String.join(",", data));
            csvWriter.append("\n");
        }


        csvWriter.flush();
        csvWriter.close();
    }



}
