import com.learning.writers.XmlWriter;
import org.junit.Test;

import javax.xml.bind.JAXBException;

public class XmlWriterTest {

    XmlWriter xmlWriter = new XmlWriter();
    @Test
    public void writeXmlJaxb() throws JAXBException {
        xmlWriter.writeXml();
    }
}
