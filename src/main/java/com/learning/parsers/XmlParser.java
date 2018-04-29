package com.learning.parsers;

import com.learning.entities.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlParser {

    File file = new File("src/test/java/files/user.xml");

    public void parseXmlJaxb() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        User user = (User) unmarshaller.unmarshal(file);
        System.out.println(user.toString());
    }
}
