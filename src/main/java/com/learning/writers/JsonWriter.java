package com.learning.writers;

import com.learning.entities.Student;
import com.learning.entities.User;

import javax.json.*;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    Student student = new Student("Ana", "Codreanu");
    User user = new User(2, "Ryan", "Betsy");

    public void JsonPWrite(String filename) throws IOException {
        JsonObject json = Json.createObjectBuilder()
                .add("FirstName", student.getFirstname())
                .add("LastName", student.getLastname())
                .add("Id", user.getId())
                .add("firstname", user.getFirstname())
                .add("lastname", user.getLastname())
                .build();

        String result = json.toString();
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(result.toString());
        }
    }

    public void JsonArrayWrite(String fileName) throws IOException {
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        arrayBuilder.add(student.getFirstname());
        arrayBuilder.add(student.getLastname());
        JsonArray jsonArray = arrayBuilder.build();
        objectBuilder.add("People", jsonArray);

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(String.valueOf(objectBuilder));
        }
    }
}
