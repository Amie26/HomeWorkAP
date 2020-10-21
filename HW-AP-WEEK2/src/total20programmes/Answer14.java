package total20programmes;

public class Answer14 {
    float width = 5.6f;
    float height = 8.5f;
    double perimeter;
    double area;

    public static void main(String[] args) {
Answer14 objA = new Answer14();

        System.out.println("Area is ");
        objA.formula1();
        System.out.println("Perimeter is" );
        objA.formula2();
    }


    public void formula1() {
        System.out.println(area = width * height);
    }

    public void formula2() {
        System.out.println(perimeter = (2 * (width + height)));

    }

}