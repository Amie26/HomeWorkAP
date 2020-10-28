package HomeworkWeek3;

import java.util.Scanner;

public class Excercise1 {
    //Java program to check odd or even number with ternary operator
    public static void main(String[] args) {
        System.out.println("Please enter a number : ");
        Scanner mySc = new Scanner (System.in);
        int a = mySc.nextInt();
        String Result = (a % 2 ==0)? "Even number" : "Odd number";
        System.out.println(a + " is " + Result);

    }
}
