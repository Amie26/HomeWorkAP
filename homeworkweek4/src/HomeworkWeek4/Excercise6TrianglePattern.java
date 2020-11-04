package HomeworkWeek4;

import java.util.Scanner;

// Java program to display triangle pattern with number

public class Excercise6TrianglePattern {


    public static void main(String[] args)

    {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}