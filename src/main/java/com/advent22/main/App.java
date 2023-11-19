package com.advent22.main;

import lib.FileReader;
import com.day.*;

public class App {
    FileReader fileReader;

    private App() {
        // set up the environment
        // *** if you want to change the location of the input files, change the string in the FileReader below ***
        this.fileReader = new FileReader("/src/main/resources");
    }

    public static void main(String[] args) {
        App app = new App();
        String answer = app.handleInput(args);

        System.out.println(answer);
        System.out.println("Exiting program...");
    }
    
    public String handleInput(String[] args) {
        switch (args.length) {
            case 0:
                return "Please enter a number 1-24 to select a day, and a number 1-2 to select a problem";
            case 1:
                return find_first(args[0]);
            case 2:
                return find_second(args[0]);
            default:
                return "Too many arguments. Please enter a number 1-24 to select a day, and a number 1-2 to select a problem";
        }
    }
    
    public String find_first(String day) {
        switch(day) {
            case "1":
                return day1.first(this.fileReader);
            case "2":
                return day2.first(this.fileReader);
            case "3":
                return day3.first(this.fileReader);
            case "4":
                return day4.first(this.fileReader);
            case "5":
                return day5.first(this.fileReader);
            case "6":
                return day6.first(this.fileReader);
            case "7":
                return day7.first(this.fileReader);
            case "8":
                return day8.first(this.fileReader);
            case "9":
                return day9.first(this.fileReader);
            case "10":
                return day10.first(this.fileReader);
            case "11":
                return day11.first(this.fileReader);
            case "12":
                return day12.first(this.fileReader);
            case "13":
                return day13.first(this.fileReader);
            case "14":
                return day14.first(this.fileReader);
            case "15":
                return day15.first(this.fileReader);
            case "16":
                return day16.first(this.fileReader);
            case "17":
                return day17.first(this.fileReader);
            case "18":
                return day18.first(this.fileReader);
            case "19":
                return day19.first(this.fileReader);
            case "20":
                return day20.first(this.fileReader);
            case "21":
                return day21.first(this.fileReader);
            case "22":
                return day22.first(this.fileReader);
            case "23":
                return day23.first(this.fileReader);
            case "24":
                return day24.first(this.fileReader);
            default:
                return "Error accessing day. Please enter a number 1-24 to select a day, and a number 1-2 to select a problem";
        }
    }

    public String find_second(String day) {
        switch(day) {
            case "1":
                return day1.second(this.fileReader);
            case "2":
                return day2.second(this.fileReader);
            case "3":
                return day3.second(this.fileReader);
            case "4":
                return day4.second(this.fileReader);
            case "5":
                return day5.second(this.fileReader);
            case "6":
                return day6.second(this.fileReader);
            case "7":
                return day7.second(this.fileReader);
            case "8":
                return day8.second(this.fileReader);
            case "9":
                return day9.second(this.fileReader);
            case "10":
                return day10.second(this.fileReader);
            case "11":
                return day11.second(this.fileReader);
            case "12":
                return day12.second(this.fileReader);
            case "13":
                return day13.second(this.fileReader);
            case "14":
                return day14.second(this.fileReader);
            case "15":
                return day15.second(this.fileReader);
            case "16":
                return day16.second(this.fileReader);
            case "17":
                return day17.second(this.fileReader);
            case "18":
                return day18.second(this.fileReader);
            case "19":
                return day19.second(this.fileReader);
            case "20":
                return day20.second(this.fileReader);
            case "21":
                return day21.second(this.fileReader);
            case "22":
                return day22.second(this.fileReader);
            case "23":
                return day23.second(this.fileReader);
            case "24":
                return day24.second(this.fileReader);
            default:
                return "Error accessing day. Please enter a number 1-24 to select a day, and a number 1-2 to select a problem";
        }
    }

}
