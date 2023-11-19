package lib;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.List;


public class FileReader {
    public String path;
    public File file;

    public FileReader(String relativePath) {
        try {
            path = new java.io.File(".").getCanonicalPath() + relativePath + "/";
        } catch (java.io.IOException e) {
            System.out.println("Error getting canonical path");
        }
        }

    public void getFile(String fileName) {
        file = new File(path + fileName);
    }

    public List<String> intoIter() {
        Scanner sc = null;
        try {
            sc = new Scanner(this.file);
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
