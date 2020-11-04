package HomeworkWeek4;

import java.util.Scanner;

public class Answer5PalindromeNumber {
// Program to check the Palindrome number
    public static void main(String[] args) {
        System.out.println(" Enter any number : ");
        Scanner mySc = new Scanner(System.in);
        int i = mySc.nextInt();
        System.out.println(isPalindrome(i));

    }

    public static boolean isPalindrome (int number){
        boolean check = true;
        int reverse = 0, remember = 0;
        int temp = number;
        while (temp !=0) {

            remember = temp %10;
            reverse = reverse * 10 + remember;
            temp = temp / 10;

        }
        if (number == reverse){
            check = true;
            System.out.println(" This is a Palindrome Number ");

        } else {
            check = false;
            System.out.println(" This is not a Palindrome Number ");

        }
        return check;
    }

}
