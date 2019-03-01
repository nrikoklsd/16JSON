package json;

import json.schema.JSONSchemeValidator;
import model.Gun;

import java.io.File;
import java.util.List;

public class JSONUser {

  public static void main(String[] args) {
    File json = new File("src/main/resources/beerJSON.json");
    File schema = new File("src/main/resources/beerJSONScheme.json");
      //System.out.println(JSONSchemeValidator.validateJSON(json,schema));

    JSONParser parser = new JSONParser();

    printList(parser.getBeerList(json));
  }

  private static void printList(List<Gun> beers) {
    System.out.println("JSON");
    for (Gun beer : beers) {
      System.out.println(beer);
    }


  }
}
