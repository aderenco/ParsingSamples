package com.learning.parsers;

import javax.json.*;
import java.io.*;

public class JsonParser {

    public void parseJsonObject(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        try (InputStream inputStream = new FileInputStream(file)) {
            JsonReader reader = Json.createReader(inputStream);
            JsonObject jsonObject = reader.readObject();
            reader.close();
            System.out.println("Student FirstName: " + jsonObject.getString("FirstName"));
            System.out.println("Student LastName: " + jsonObject.getString("LastName"));
            System.out.println("User Id: " + jsonObject.getInt("Id"));
            System.out.println("UserFirstName: " + jsonObject.getString("firstname"));
            System.out.println("UserLastName: " + jsonObject.getString("lastname"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseJsonArray(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        try (InputStream inputStream = new FileInputStream(file)) {
            JsonReader reader = Json.createReader(inputStream);
            JsonObject jsonObject = reader.readObject();
            JsonArray jsonArray = jsonObject.getJsonArray("people");
            System.out.println("Parsed JSon Array: \n");
            for (JsonValue value : jsonArray) {
                System.out.println(value.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
