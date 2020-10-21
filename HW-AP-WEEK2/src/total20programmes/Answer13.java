package total20programmes;

import java.util.Scanner;

public class Answer13 {
    int x, y, z;

    public static void main(String[] args) {
        Answer13 objAP = new Answer13();
        objAP.averageOf();
    }

    public void averageOf() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter 1st no.");
        x = myScan.nextInt();
        System.out.println("Please enter 2nd no.");
        y = myScan.nextInt();
        System.out.println("Please enter 3rd no.");
        z = myScan.nextInt();
        System.out.println("Average of 3 nos. are" + ((x + y + z) / 3));

    }
}