package HomeworkWeek4;

import java.util.Scanner;

public class MinAndMAxInputChallenge {

    // This program takes user's input and checks the minimum and maximum value

    public static void main(String[] args) {
        int myInput;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        Scanner mySc = new Scanner(System.in);
        System.out.println(" How many numbers would you want to enter : ");
        myInput = mySc.nextInt();
        int[] a = new int[myInput]; // array is declared

        for (int i = 0; i < myInput; i++) { // for loop is taking user's input
            System.out.println(" Please enter " + (i + 1) + " : ");
            a[i] = mySc.nextInt(); //storing in array


        }

        while (myInput != 0) { // endless while loop checking
            min = a[0];
            max = a[0];
            for (int i = 0; i < myInput; i++) {  // for loop checking numbers
                if (min > a[i]) {
                    min = a[i];


                }

                if (max < a[i]) {
                    max = a[i];
                }

            }
            break;
        }
        System.out.println();
        System.out.println("Minimum No is : " + min);
        System.out.println("Maximum No is : " + max);

    }
}

