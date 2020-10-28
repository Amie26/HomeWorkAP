package HomeworkWeek3;

import java.util.Scanner;

public class Excercise8 {
    String city;

    public static void main(String[] args) {
        Excercise8 objAP1 = new Excercise8();
        objAP1.cityName();
        System.out.println(objAP1.city);
    }
    public void cityName() {
        Scanner mySc = new Scanner(System.in);
        System.out.println(" Please enter an alphabet : ");

        String char1 = mySc.next();
        char1 = char1.toLowerCase();

        if (char1.equals("a")) {
            city = "Alaska";
        } else if (char1.equals("b"))
            city = "Brisbane";

         else if (char1.equals("c"))
            city = "California";

        else if (char1.equals("d"))
            city = "Denver";

         else if (char1.equals("e"))
            city = "Edinburgh";
            else if (char1.equals("f"))
            city = "Frankfurt";
         else
            System.out.println(" Please enter an alphabet between a to f ");
    }

}



