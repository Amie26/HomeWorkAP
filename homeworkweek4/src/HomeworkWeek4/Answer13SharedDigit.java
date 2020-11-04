package HomeworkWeek4;

import java.util.Scanner;

public class Answer13SharedDigit {

    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println(" Please enter First No. :");
        int number1 = mySc.nextInt();
        System.out.println(" Please enter Second No. :");
        int number2 = mySc.nextInt();
        System.out.println( "\tGiven No. has Shared Digit :" + hasSharedDigit(number1,number2));

    }
    public static boolean hasSharedDigit (int number1,int number2){
        if ((number1>=10 && number1<=99 ) && (number2>=10 && number2<=99)) {
            return true;

        } else {
            return false;
        }

    }

}
