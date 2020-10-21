package total20programmes;

import java.util.Scanner; // Scanner class is imported

public class Answer7 {
    static Scanner mySc = new Scanner(System.in); //scanner is initialised

    public static void main(String[] args) {
        Answer7 objAP1 = new Answer7();
        objAP1.temperature1();
    }
    public void temperature1(){
        System.out.println("Please input the fahrenheit :");
        int f = mySc.nextInt();
        double temp = ((f-32)*5/9);
        System.out.println("The degree celsius is =" + temp);
    }
}
