package HomeworkWeek3;

import java.util.Scanner;

public class Excercise7 {
    static int commission;
    public static void main(String[] args) {
        Excercise7 objAP1 = new Excercise7();
        objAP1.salaryCommission();

    }
    public void salaryCommission (){

        Scanner mySc = new Scanner(System.in);
        System.out.println(" Sales ID ");
        int salesID = mySc.nextInt();
        System.out.println("Seller's Name : ");
        String sellerName = mySc.next();
        System.out.println("Sales Amount");
        int salesAmount = mySc.nextInt();
        System.out.println("Basic Salary");
        int basicSal = mySc.nextInt();


        if (salesAmount>=50000){
            commission = ((50000*35)/100);
        } else if (salesAmount>=30000){
            commission = ((30000*20)/100);
        } else if (salesAmount>=20000){
            commission = ((20000*10)/100);
        } else if (salesAmount>=10000){
            commission = ((20000*5)/100);
        }else if (salesAmount<10000){
            commission = ((10000*2)/100);
        }
        int total = basicSal+commission;
        System.out.println("Total Salary With Commission: "+total);
    }

}
