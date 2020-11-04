package HomeworkWeek4.carpetcostcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char choice;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println(" Please enter carpet cost :");
            double cost = scanner.nextDouble();
            System.out.println(" Please enter width : ");
            double width = scanner.nextDouble();
            System.out.println(" Please enter length :");
            double length = scanner.nextDouble();

            Carpet carpet = new Carpet(cost);
            Floor floor = new Floor(width, length);
            Calculator calculator = new Calculator(floor, carpet);
            System.out.println("Total :" + calculator.getTotalCost());
            System.out.println(" Do you want to continue ? Enter Y / N :");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        }
    }
