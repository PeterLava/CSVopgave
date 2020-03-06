package CSVOpgavePck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Reader {

    public static void main(String[] args) {

        String csvFile = "C:/Users/lenovo/desktop/movie_metadata_500.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        MovieProfile[] movieProfiles = new MovieProfile[500];
        int i = 0;
        final String textGreen = "\u001B[32m";
        final String textRed = "\u001B[31m";
        final String textBlue = "\u001B[34m";
        final String textReset = "\u001B[1;0m";




        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String movieLine[] = line.split(cvsSplitBy);
                movieProfiles[i] = new MovieProfile(movieLine[0],movieLine[1],movieLine[2],movieLine[3],
                        movieLine[4],movieLine[5],movieLine[6],movieLine[7],movieLine[8],movieLine[9],
                        movieLine[10],movieLine[11],movieLine[12],movieLine[13],movieLine[14],movieLine[15],
                        movieLine[16],movieLine[17],movieLine[18],movieLine[19],movieLine[20],movieLine[21],
                        movieLine[22],movieLine[23],movieLine[24],movieLine[25],movieLine[26],movieLine[27]);
                i++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


      Arrays.sort(movieProfiles, (b,a) -> a.titleYear.compareTo(b.titleYear));

        for (int j = 0; j < 500 ; j++) {
            System.out.print(textReset);
            System.out.print("Movie title: ");
            System.out.print(textBlue+movieProfiles[j].getMovieTitle()+textReset);
            System.out.print(" Director: ");
            System.out.print(textGreen+movieProfiles[j].getDirectorName()+textReset);
            System.out.print(" Genre: ");
            System.out.print(textRed+movieProfiles[j].getGenres()+textReset);
            System.out.print(" Year: ");
            System.out.println(textRed+movieProfiles[j].getTitleYear()+textReset);

        }

    }

}