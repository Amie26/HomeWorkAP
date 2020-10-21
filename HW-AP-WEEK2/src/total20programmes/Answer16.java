package total20programmes;

public class Answer16 {

    public static void main(String[] args) {
        String x = "10";
        String y = "11";
        int total;

        int a = Integer.parseInt(x, 2);
        int b = Integer.parseInt(y, 2);
        total = a + b;
        System.out.println("Total of Binary number: " + Integer.toBinaryString(total));
    }
}