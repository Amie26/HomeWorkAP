package HomeworkWeek3;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Excercise9 {
    static String city;
    public static void main(String[] args) {
        getNameOfCity();
        System.out.println(city);
    }

    public static String getNameOfCity( ) {
//        String city = "";
        Scanner mySc = new Scanner(System.in);
        System.out.println("Please enter an alphabet : ");
        String char1 = mySc.next();
        char1=char1.toLowerCase();
        switch (char1) {
            case "a":
                break;
            case "b":
                city = "Brisbane";
                break;
            case "c":
                city = "California";
                break;
            case "d":
                city = "Denver";
                break;
            case "e":
                city = "edinburgh";
                break;
            case "f":
                city = "frankfurt";
                break;

            default:

                System.out.println("Please enter an alphabet between a to f ");
        }return city;

    }
}
