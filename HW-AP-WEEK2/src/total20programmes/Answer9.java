package total20programmes;

import java.util.Scanner;

public class Answer9 {
   String upper;
   String lower;

    public static void main(String[] args) {
     Answer9 objAP1 = new Answer9();
     objAP1.upperToLower();
    }

    public void upperToLower (){
        Scanner mySc = new Scanner(System.in);
        System.out.println("Please enter Uppercase name : ");
        upper = mySc.nextLine();
        lower = upper.toLowerCase();
        System.out.println(lower);
    }
}
