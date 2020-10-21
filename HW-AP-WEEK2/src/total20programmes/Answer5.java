package total20programmes;

public class Answer5 {
    int a, b;

    public static void main(String[] args) {
        Answer5 calladd1 = new Answer5();
        calladd1.add1(20, 40);
        System.out.println("Subtraction = " + subtract1(50 , 40));
        calladd1.multi1();
        System.out.println("division1 = " + division1());
    }

    // This method is with parameter, no return type
    public void add1(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // subtaction method : with parameter and with return type
    public static int subtract1(int a, int b) {
        return a - b;
    }
    // no parameter, no return type

    public void multi1 (){
        a=10;
        b=20;
        System.out.println("Multiplication = " + (a*b));

    }
    // no parameter, with return type
    public static int division1(){
       int a=30;
      int b=10;
        return (a/b);

    }

}
