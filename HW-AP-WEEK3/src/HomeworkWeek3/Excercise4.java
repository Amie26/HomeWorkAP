package HomeworkWeek3;
//program for Leapyear

import java.util.Scanner;

public class Excercise4 {
    static int year, day, month;


    public static void main(String[] args) {
        isLeapYear(year);
getDaysInMonth(month,year );
        System.out.println("Days is given months are : " + day);
    }

    public static int isLeapYear(int year) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Please enter a year : ");
        year = Sc.nextInt();
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year ");

            } else {
                System.out.println(year + " is not a Leap Year ");
            }

        } else {
            System.out.println(" This is not a valid year ");

        }
        return year;
    }
    public static void getDaysInMonth(int month, int year){
        Scanner mySc = new Scanner(System.in);
        System.out.println("Please enter a year : ");
        year = mySc.nextInt();
        System.out.println("Please enter a month : ");
        month = mySc.nextInt();


            if (month<1 || month >12) {
                System.out.println("It is an invalid month ");
            } else if (year<1 || year >9999){
                    System.out.println("It is an invalid year ");

                } else {
                   switch (month){
                       case 1:
                       case 3:
                       case 5:
                       case 7:
                       case 8:
                       case 10:
                       case 12:
                           day = 31;
                           break;
                       case 4:
                       case 6:
                       case 9:
                       case 11:
                           day = 30;
                           break;
                   }
                }
            }
    }

