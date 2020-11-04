package HomeworkWeek4;
// Display the right angle triangle usign nested loop

public class RightAngleTriangle {

    public static void main(String[] args) {
        int i, j, num, n = 5;

        for (i=0; i <=n; i++){ // outer loop for row

            num = 1;

            for (j=0; j<i; j++){
                System.out.print("@"); // print @ at the same line
            }
            System.out.println(); // bring cursor to the next row
        }


    }
}
