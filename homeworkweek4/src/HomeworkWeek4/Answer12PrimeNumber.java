package HomeworkWeek4;

import java.util.Scanner;

public class Answer12PrimeNumber {

    public static void main(String[] args) {
        int temp;
        boolean myPrime = true;
        Scanner mySc = new Scanner(System.in);
        System.out.println(" Enter a number : ");

        int num = mySc.nextInt();
        mySc.close();
        for (int i = 2; i <= num / 2; i++)
        {
            temp = num%i;
            if (temp==0) {
                myPrime = false;
                break;
            }

        }
        if (myPrime) {
            System.out.println(num + " is a Prime Number ");
        } else {
            System.out.println(num + " is not a Prime Number ");
        }


    }
}
