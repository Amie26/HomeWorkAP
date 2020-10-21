package total20programmes;

import java.util.Scanner;

public class Answer18 {
    //This programme to calculate the digits of an integer

    public static void main(String[] args) {
        Answer18 obj1 = new Answer18();
        obj1.sum();
    }

    public void sum() {
        System.out.println("Input an integer : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int total = 0;

        while (a > 0) {
            int reminder = a % 10;
            total = total + reminder;
            a = a / 10;
        }
            System.out.println("The sum of the digits is " + total);
        }
    }


