package com.day;

import lib.FileReader;

public class day1 {
    
    public static String first(FileReader fileReader) {
        fileReader.getFile("day1.txt");

        Integer largest = 0;
        Integer num = 0;

        for (String line : fileReader.intoIter()) {
            if (line.isEmpty()) {
                largest = largest > num ? largest : num;
                num = 0;
            } else {
                num += Integer.parseInt(line);
            }
        }

        return Integer.toString(largest);
    }

    public static String second(FileReader fileReader) {
        return "Not Implemented Yet";
    }
}
