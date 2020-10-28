package HomeworkWeek3;

import java.util.Arrays;

public class Excercise16 {
    //Program to sort the numeric array and string array
    public static void main(String[] args) {

        int [] array1 = {

                25, 67, 89, 34,
                22, 12, 87, 78};

        String [] array2 = {

                "madras",
                "baroda",
                "delhi",
                "bhopal",
                "jaipur",
                "panjim"};

        System.out.println("Original numeric array :" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(array1));

        System.out.println("Original String array :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array :" + Arrays.toString(array2));

    }
}

