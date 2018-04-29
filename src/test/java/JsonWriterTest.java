import com.learning.writers.JsonWriter;
import org.junit.Test;

import java.io.IOException;

public class JsonWriterTest {
    JsonWriter jsonWriter = new JsonWriter();


    @Test
    public void WriteJsonP() throws IOException {
        jsonWriter.JsonPWrite("src/test/java/files/JsonTestFile.json");
    }

    @Test
    public void WriteJsonArray() throws IOException {
        jsonWriter.JsonArrayWrite("src/test/java/files/JsonTestFile.json");
    }
}
