package homework.week1;

public class Challenge {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Challenge obj = new Challenge();
        obj.addition();
        addition1();
    }
    public void addition (){

        System.out.println(a);
        System.out.println(b);

    }
    public static void addition1 (){
        Challenge obj = new Challenge();
        System.out.println(obj.a);
        System.out.println(b);

    }
}
