package HomeworkWeek4;

import java.util.Scanner;
// This program sums the 10 console numbers entered by user
public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        int i=0, b = 10,sum = 0; //variables created
        int[]a = new int[b]; // Array initialisation
        Scanner in = new Scanner(System.in);

        while (i<b) {
            System.out.println("Please enter the number : " + (i + 1) + " : ");
            if (in.hasNextInt()) {
                a[i] = in.nextInt(); // Storing values in Array using Scanner
                sum += a[i]; // adding values from Array
                i++; // increments

            } else {
                System.out.println(" Invalid number "); // if false, prints error message

            break; // ends while loop
        }
        }
        in.close(); // Scanner closed
        System.out.println("Sum of the given number : " + sum);

    }
}
