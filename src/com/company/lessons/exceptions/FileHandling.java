package com.company.lessons.exceptions;

import java.io.*;

public class FileHandling {
    public void readFile() {
        try {
            File file = new File("D:/Work/LearningLab_Java/src/com/company/lessons/exceptions/text_file.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
