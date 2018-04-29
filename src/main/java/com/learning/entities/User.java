package com.learning.entities;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlType(propOrder = {"firstname", "lastname", "id"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "user")
public class User {

    @XmlAttribute(name = "id")
    private int id;
    @XmlAttribute(name = "firstname")
    private String firstname;
    @XmlAttribute(name = "lastname")
    private String lastname;
    @XmlAttribute(name = "contacts")
    private List<String> contacts;

    public User() {
    }

    public User(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User(int id, String firstname, String lastname, List<String> contacts) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
