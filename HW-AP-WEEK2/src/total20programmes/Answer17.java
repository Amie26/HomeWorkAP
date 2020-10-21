package total20programmes;

import java.util.Scanner;

public class Answer17 {
    // This programme will convert decimal number to binary number
    public static void main(String[] args) {
        convert();
    }

    public static void convert() {
        String x;
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a decimal number :");
        a = in.nextInt();
        x = Integer.toBinaryString(a);
        System.out.println("Binary number is :" + x);
    }


}