import com.learning.parsers.XmlParser;
import org.junit.Test;

import javax.xml.bind.JAXBException;

public class XmlParserTest {

    XmlParser xmlParser = new XmlParser();

    @Test
    public void parseXml() throws JAXBException {
        xmlParser.parseXmlJaxb();
    }
}
