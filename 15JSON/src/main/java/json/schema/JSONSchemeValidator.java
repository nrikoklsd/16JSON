package json.schema;

import com.fasterxml.jackson.databind.JsonNode;

import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;



import javax.ws.rs.ProcessingException;

import java.io.File;
import java.io.IOException;


public class JSONSchemeValidator {
    public static boolean validateJSON(File json1, File schema){

        try {
            JsonNode json = JsonLoader.fromFile(json1);
            JsonNode jsonSchema = JsonLoader.fromFile(schema);
            JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.byDefault();
//            JsonValidator jsonValidator = jsonSchemaFactory.getValidator();

//            System.out.println(jsonValidator.validate(jsonSchema, json));
            return true;
        } catch (IOException | ProcessingException e) {
            e.printStackTrace();
            return false;
        }


    }
}
