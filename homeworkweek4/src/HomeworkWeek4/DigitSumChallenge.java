package HomeworkWeek4;

import java.util.Scanner;
// This program adds up the digits given
public class DigitSumChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input an integer : ");
        int number = input.nextInt();
        System.out.println("The sum of digit is :" + sumDigits(number));

    }
    public static int sumDigits (int number){
        int add = 0;
        while (number !=0) {
            add += number % 10;
            number /= 10;

        }
        return add;
    }
}
