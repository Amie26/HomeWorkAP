package HomeworkWeek3;

import java.util.Scanner;

public class Excercise2 {
    // A program to check the leap year
    public static void main(String[] args) {
        year();

    }

    public static int year() {
        Scanner mySc = new Scanner(System.in);
        System.out.println("please enter a year : ");
        int year = mySc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year ");
        } else System.out.println(" is not a leap year ");
        return year;
    }
}
