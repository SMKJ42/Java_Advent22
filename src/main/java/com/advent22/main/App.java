package com.advent22.main;

import lib.FileReader;
import com.day.*;

public class App {
    FileReader root;

    private App() {
        root = new FileReader();
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
        String root = this.root.conical;
        switch(day) {
            case "1":
                return day1.first(root);
            case "2":
                return day2.first(root);
            case "3":
                return day3.first(root);
            case "4":
                return day4.first(root);
            case "5":
                return day5.first(root);
            case "6":
                return day6.first(root);
            case "7":
                return day7.first(root);
            case "8":
                return day8.first(root);
            case "9":
                return day9.first(root);
            case "10":
                return day10.first(root);
            case "11":
                return day11.first(root);
            case "12":
                return day12.first(root);
            case "13":
                return day13.first(root);
            case "14":
                return day14.first(root);
            case "15":
                return day15.first(root);
            case "16":
                return day16.first(root);
            case "17":
                return day17.first(root);
            case "18":
                return day18.first(root);
            case "19":
                return day19.first(root);
            case "20":
                return day20.first(root);
            case "21":
                return day21.first(root);
            case "22":
                return day22.first(root);
            case "23":
                return day23.first(root);
            case "24":
                return day24.first(root);
            default:
                return "Error accessing day. Please enter a number 1-24 to select a day, and a number 1-2 to select a problem";
        }
    }

    public String find_second(String day) {
        String root = this.root.conical;
        switch(day) {
            case "1":
                return day1.second(root);
            case "2":
                return day2.second(root);
            case "3":
                return day3.second(root);
            case "4":
                return day4.second(root);
            case "5":
                return day5.second(root);
            case "6":
                return day6.second(root);
            case "7":
                return day7.second(root);
            case "8":
                return day8.second(root);
            case "9":
                return day9.second(root);
            case "10":
                return day10.second(root);
            case "11":
                return day11.second(root);
            case "12":
                return day12.second(root);
            case "13":
                return day13.second(root);
            case "14":
                return day14.second(root);
            case "15":
                return day15.second(root);
            case "16":
                return day16.second(root);
            case "17":
                return day17.second(root);
            case "18":
                return day18.second(root);
            case "19":
                return day19.second(root);
            case "20":
                return day20.second(root);
            case "21":
                return day21.second(root);
            case "22":
                return day22.second(root);
            case "23":
                return day23.second(root);
            case "24":
                return day24.second(root);
            default:
                return "Error accessing day. Please enter a number 1-24 to select a day, and a number 1-2 to select a problem";
        }
    }

}
