import com.learning.writers.CsvWriter;
import org.junit.Test;

public class CsvWriterTest {

    CsvWriter csvWriter = new CsvWriter();

    @Test
    public void writeCsvFileTest() {
        csvWriter.writeCsv("src/test/java/files/testfile.xls");
    }
}
