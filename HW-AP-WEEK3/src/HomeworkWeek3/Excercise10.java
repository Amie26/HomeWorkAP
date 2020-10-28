package HomeworkWeek3;

import java.util.Scanner;

public class Excercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            double a1, a2, out;
            char symbol;
        System.out.println("Enter first value : ");
        a1 = in.nextDouble();
        System.out.println("Enter second value :");
        a2 = in.nextDouble();

        System.out.print("Select any operator (+, -, *, /) : ");
                symbol = in.next().charAt(0);
                out = calcultor(a1,a2,symbol);
                System.out.println(a1 + " " +symbol + a2 + " = " + out);
        }
        public static double calcultor (double a1, double a2, char symbol){
        double output = 0;

        if (symbol == '+')
            output = a1 + a2 ;

        else if (symbol == '-')
            output = a1-a2;

        else if (symbol == '*')
            output = a1 * a2;
        else if (symbol == '/')
            output = a1/a2;
        else
            System.out.println("Invalid Operator");
            return output;


    }
}
