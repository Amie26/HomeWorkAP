package HomeworkWeek4;

import java.util.Scanner;

public class Answer11EvenDigitSum {


    public static int getEvenDigitSum(int number) {

        int lastDigit = 0; // Variables declared
        int evenDigitSum = 0;

        if (number <0){
            return -1;

        }

        while (number != 0) { // loop to repeat the process
            lastDigit = number % 10; // to find last digit

            if (lastDigit % 2 == 0) {// if condition to check last digit

                evenDigitSum += lastDigit;    // add it to sum
        }

        number = number / 10;  // remove last digit of number

    }
        return evenDigitSum;   // return sum value
    }

    public static void main(String[] args) {

        // declare variables
        int number = 0;
        int sumOfEvenDigits = 0;

        // create Scanner class object
        // for reading the values
        Scanner scan = new Scanner(System.in);

        // read inputs
        System.out.print("Enter an integer number:: ");
        number = scan.nextInt();

        // find sum of digits of number
        sumOfEvenDigits = getEvenDigitSum(number);

        // display result
        System.out.println("The sum of even digits of" +
                " the number " + number + " = " + sumOfEvenDigits);

        scan.close();  // close Scanner class object
    }

}



