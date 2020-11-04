package HomeworkWeek4;

import java.util.Scanner;

public class Answer7FirstAndLastDigitSum {
// Program to sum the first and last digit of a number

    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner mySc = new Scanner(System.in);
        int i = mySc.nextInt();
        System.out.println(sumFirstAndLastDigit(i));

    }
    public static int sumFirstAndLastDigit (int number){
        int a = number;
        if (a <0) {
            System.out.println("\tInvalid Number");
            return -1;

        }

        int lastdigit = number %10;
        while (a>=10) {
            a = a/ 10;

        }

        int firstdigit = a;
        System.out.println("\tThe sum of the given number is : ");
                return firstdigit + lastdigit;
    }

}
