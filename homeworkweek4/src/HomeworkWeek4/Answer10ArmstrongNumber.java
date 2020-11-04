package HomeworkWeek4;
// Program to check if the inputted number is Armstrong number

import java.util.Scanner;

public class Answer10ArmstrongNumber {

    public static void main(String[] args) {

        int num1, number, temp, total = 0;
        System.out.println("Ënter 3 Digit Number : ");
        Scanner mySc = new Scanner(System.in);
        num1 = mySc.nextInt();
        mySc.close();
        number = num1;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num1)
            System.out.println(num1 + " is an Armstrong number");
        else
            System.out.println(num1 + " is not an Armstrong number");
    }
}


