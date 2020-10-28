package HomeworkWeek3;

import java.util.Scanner;

public class Excercise6 {

    public static void main(String[] args) {
        Excercise6 objAP1 = new Excercise6();
        objAP1.getOddEvenNo();
    }
    public void getOddEvenNo (){
        Scanner mySc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int inputNo = mySc.nextInt();

        if (inputNo%2==0){
            System.out.println(" This is even number ");

        } else {
            System.out.println(" This is odd number ");
        }
    }
}
