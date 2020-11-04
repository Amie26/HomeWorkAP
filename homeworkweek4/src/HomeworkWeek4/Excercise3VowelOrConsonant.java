package HomeworkWeek4;

import java.util.Scanner;
// Program to check the character is vowel or consonant
public class Excercise3VowelOrConsonant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a charecter : ");
        char ch = in.next().charAt(0); // Variable is assigned to Scanner
        ch = Character.toLowerCase(ch); // user input converts to lowercase

        if(ch >= 0 && ch<=9) { // checks if input is a number
            System.out.println("Invalid Input");
        } else if ( ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        }
        else {
            System.out.println(ch + " is a consonant ");

            }

            }

        }

