package total20programmes;

import java.util.Scanner;

public class Answer10 {
    public static void main(String[] args) {
        int n, c;
        System.out.println("Enter a number to print a multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n);

        for ( c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + "=" + (n*c));
    }
}
