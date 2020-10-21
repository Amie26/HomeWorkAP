package total20programmes;

import java.util.Scanner; // imported the scanner class

public class Answer6 {
      static Scanner mySc = new Scanner(System.in); // scanner is initialised to mySc object

    public static void main(String[] args) {
       Answer6 objAP = new Answer6(); // object is created to call athe method
       objAP.area1();
    }
    public void area1(){
        System.out.println("please input radius value :- ");
        int a= mySc.nextInt();
        double area = (Math.PI)*(a*a); // formula to calculate the area
        System.out.println("The area of circle is:-" + area);
    }
}
