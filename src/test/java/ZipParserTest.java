import com.learning.parsers.ZipParser;
import org.junit.Test;

public class ZipParserTest {

    ZipParser zipParser = new ZipParser();

    @Test
    public void parseZipTest() {
        zipParser.parseZip("src/test/java/files/archive.zip");
    }
}
