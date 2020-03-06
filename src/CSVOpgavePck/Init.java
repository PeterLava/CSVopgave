package CSVOpgavePck;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Init{

    void initialiseObjects(MovieProfile[] movieProfile) {
        String csvFile = "C:/Users/lenovo/desktop/movie_metadata_500.csv";
        BufferedReader br = null;
        String line;
        String cvsSplitBy = (",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

        try {
            br = new BufferedReader(new FileReader(csvFile));
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] movieLine = line.split(cvsSplitBy);
                for (int j = 0; j < 28; j++) {
                    movieLine[j] = movieLine[j].replace("\""," ");
                    movieLine[j] = movieLine[j].trim();
                }
                movieProfile[i] = new MovieProfile(movieLine[0], movieLine[1], movieLine[2], movieLine[3],
                        movieLine[4], movieLine[5], movieLine[6], movieLine[7], movieLine[8], movieLine[9],
                        movieLine[10], movieLine[11], movieLine[12], movieLine[13], movieLine[14], movieLine[15],
                        movieLine[16], movieLine[17], movieLine[18], movieLine[19], movieLine[20], movieLine[21],
                        movieLine[22], movieLine[23], movieLine[24], movieLine[25], movieLine[26], movieLine[27]);
                i++;
            }
        } catch (Exception e) {
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
    }
}
