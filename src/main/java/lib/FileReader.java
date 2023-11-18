package lib;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.List;


public class FileReader {
    public String conical;

    public FileReader() {
        try {
            conical = new java.io.File(".").getCanonicalPath();
        } catch (java.io.IOException e) {
            System.out.println("Error getting canonical path");
        }
    }

    public static List<String> intoIter(String path) {
        File file = new File(path);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        }
        List<String> lines = new java.util.ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        sc.close();
        return lines;
    }

}
