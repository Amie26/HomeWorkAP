package HomeworkWeek3;

import java.util.Scanner;
// This is a program to check if input is number, alphabet or special charecter
public class Excercise12 {
    public static void main(String[] args) {
        char input;

        Scanner mySc = new Scanner(System.in);
        System.out.println(" Please enter any key :");
        input = mySc.next().charAt(0);
        charCheck(input);
    }
    public static void charCheck(char input_char){
        //Alphabet
        if ((input_char>=65 && input_char<=90) || (input_char>=97 && input_char<=122))
            System.out.println("This is an Alphabet");
        //number

        else if (input_char>=48 && input_char <=57)
            System.out.println("This is a number");
        else
            System.out.println("This is a Special character");
    }
    }

