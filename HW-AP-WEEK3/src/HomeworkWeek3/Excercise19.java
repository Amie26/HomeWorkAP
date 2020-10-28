package HomeworkWeek3;

public class Excercise19 {
    //Java program to calculate the average value of array

    public static void main(String[] args) {
        double[] array1 = {18.16, 57.39, 23.30, 71.86, 92, 14.04, 62};
        double total = 0;

        for(int i=0; i<array1.length; i++){
            total = total + array1[i];
        }

        double average =  total / array1.length;

        System.out.format("The average is :%.2f", + average);

    }
}
