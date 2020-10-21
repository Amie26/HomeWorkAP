package total20programmes;

import java.util.Scanner;

public class Answer8 {
    static Scanner mySc = new Scanner(System.in);

    public static void main(String[] args) {
        Answer8 findArea = new Answer8();
        findArea.triangle1();
    }
    public void triangle1(){
        System.out.println("Please input the values :");
        int b = mySc.nextInt();
        int h = mySc.nextInt();
        int area =((b/2)*h);
        System.out.println("the area of the triangle is :" + area);
    }
}
