package HomeworkWeek3;

import java.util.Scanner;

public class Excercise13 {
    //Program to assign Weekdays using number 1 to 7
    public static void main(String[] args) {
Excercise13 objAP1 = new Excercise13();
objAP1.weekDays();

    }
    public void weekDays (){
        Scanner mySc = new Scanner(System.in);
        System.out.println("please enter a number");
        int a = mySc.nextInt();
        switch (a){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            default:
                System.out.println("Week contains 1 to 7 days");
                break;

        }
    }
}
