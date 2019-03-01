package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Gun;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONParser {
    private ObjectMapper objectMapper;

    public JSONParser() {
        this.objectMapper = new ObjectMapper();
    }

    public List<Gun> getBeerList(File jsonFile){
        Gun[] beers = new Gun[0];
//        List<Gun> beers = new ArrayList<>();
        try{
            beers = objectMapper.readValue(jsonFile, Gun[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Arrays.asList(beers);
    }
}
