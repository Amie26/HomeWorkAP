package HomeworkWeek3;

import java.util.Scanner;

public class Excercise5 {

    public static void main(String[] args) {
Excercise5 sa = new Excercise5();
sa.salarySlip();
    }
    public void salarySlip(){
        Scanner mySc = new Scanner(System.in);
        System.out.println("Employee ID : ");
        int empID = mySc.nextInt();
        System.out.println("Employee Name : ");
        String empName = mySc.next();
        System.out.println("Basic Salary : ");
        int basicSal = mySc.nextInt();

        float hra = ((basicSal*10)/100);
        float ta = ((basicSal*8)/100);
        float da = ((basicSal*9)/100);
        float pf = ((basicSal*20)/100);
float grossSal = ((basicSal + hra + ta + da) - pf);




    System.out.println("\n\t\tSalary Slip\n" +
            "-----------------------------------------\n" +
            "\tEmployee ID     :\t\t:\t" + (empID) + "\n" +
            "\tEmployee Name   :\t\t:\t" + (empName) + "\n" +
            "------------------------------------------\n" +
            "\tBasic Salary    :\t\t" +(basicSal)+"\n" +
            "\tHRA 10%         :\t\t:\t" + (hra) + "\n" +
            "\tTA 8%           :\t\t:\t" + (ta) + "\n" +
            "\tDA 9%           :\t\t:\t" + (da) + "\n" +
            "\tPF -20%         :\t\t:\t" + (pf) + "\n" +
            "-----------------------------------------\n" +
            "\tGross Salary    :\t\t:\t" + (grossSal) + "\n" +
            "-----------------------------------------\n" +
            "-----------------------------------------\n" );
    }
}
