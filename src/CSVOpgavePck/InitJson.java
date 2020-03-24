package CSVOpgavePck;

import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;


class InitJson{


    void Jsoninitialiser() throws IOException, ParseException {
        String jsonFile ="C:/Users/lenovo/desktop/file.json";
        FileReader fileReader = new FileReader(jsonFile);
        JSONParser parser = new JSONParser();
        Object object = parser.parse(fileReader);
        JSONArray jsonArray = (JSONArray) object;
        JSONObject jsonObject;
        FileWriter fileWriter = new FileWriter("final.json");


        for (Object o : jsonArray){
            jsonObject = (JSONObject) o;
            JSONObject jObj = new JSONObject();
            jObj.put("Country",jsonObject.get("Country"));
            jObj.put("Year",jsonObject.get("Year"));
            jObj.put("Population",jsonObject.get("Total population"));
            System.out.println(jObj);
            fileWriter.write(jObj.toJSONString());
        }





    }
    }