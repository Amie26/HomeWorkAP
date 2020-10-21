package total20programmes;

public class Answer3 {
    int x = 25; //instance variable
    static int y = 50; //static variable

    public static void main(String[] args) {
        division();
        Answer3 callMultiplication = new Answer3(); //
        callMultiplication.multiplication();
    }

    public void multiplication() {
        System.out.println("multiplication called from instance method: " + (x * y));
        //instance variable called in method
    }

    public static void division() {
        Answer3 mycalculation = new Answer3(); // static variable called in method
        System.out.println("variable: " + (y / mycalculation.x));
    }

}
