package com.learning.writers;

import com.learning.entities.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvWriter {

    private final static String COMMA = ",";
    private final static String SEPARATOR = "\n";

    public void writeCsv(String filename) {
        Student student = new Student("Joan", "Smith");
        Student student1 = new Student("Sharon", "Black");
        Student student2 = new Student("Vanessa", "White");
        Student student3 = new Student("Nadine", "Hodge");
        Student student4 = new Student("Harold", "Hugo");
        Student student5 = new Student("Bennie", "Hugh");
        Student student6 = new Student("Lawrence", "Cooper");
        Student student7 = new Student("Joey", "Ballard");
        Student student8 = new Student("Madeline", "Summers");
        Student student9 = new Student("Dana", "Gonsalez");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter((filename)))) {
            for (Student stud : students) {
                bufferedWriter.append(String.valueOf(stud.getFirstname()));
                bufferedWriter.append(COMMA);
                bufferedWriter.append(String.valueOf(stud.getLastname()));
                bufferedWriter.append(SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
