package total20programmes;

public class Answer15 {
    int a = 4;
    int b = 6;
    int temp2;

    // This is programme will swap to variables using various methods.
    public static void main(String [] args) {

        int x = 1;
        int y = 5;
        int temp;
        System.out.println(" X and Y value before swapping : " + x + y);

        temp = x;
        x = y;
        y = temp;
        System.out.println(" X and Y vaLue after swapping : " + x + y);

        Answer15 obj = new Answer15();
        obj.ins(4, 6);


    }

    public void ins(int a, int b) {
        System.out.println("A and B value before swapping: " + (a) + (b));

        temp2 = a;
        a = b;
        b = temp2;
        System.out.println("A and B value after swapping: " + (a) + (b));
    }

}
