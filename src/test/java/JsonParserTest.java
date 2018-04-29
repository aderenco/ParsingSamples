import com.learning.parsers.JsonParser;
import org.junit.Test;

import java.io.FileNotFoundException;

public class JsonParserTest {

    JsonParser jsonParser = new JsonParser();

    @Test
    public void JsonObjectParsingTest() throws FileNotFoundException {
        jsonParser.parseJsonObject("src/test/java/files/JsonTestFile.json");
    }
//
//    @Test
//    public void JsonArrayParsingTest() throws FileNotFoundException {
//        jsonParser.parseJsonArray("src/test/java/files/JsonTestFile.json");
//    }

}
