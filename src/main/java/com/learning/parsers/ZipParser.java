package com.learning.parsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipParser {

    public void parseZip(String fileName) {
        try {
            ZipFile zipFile = new ZipFile(fileName);
            Enumeration entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                System.out.println("File: " + zipEntry.getName());
                long size = zipEntry.getSize();
                if (size > 0) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
