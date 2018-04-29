package com.learning.writers;

import com.learning.entities.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;

public class XmlWriter implements Serializable {

    User user = new User(1, "Harry", "Spring");
    User user1 = new User(3, "Joan", "Black",
            Arrays.asList("contact1", "contact2"));

    public void writeXml() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(user, new File("src/test/java/files/user1.xml"));
        marshaller.marshal(user1, new File("src/test/java/files/user.xml"));
        marshaller.marshal(user, System.out);
        marshaller.marshal(user1, System.out);
    }
}
