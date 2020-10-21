package total20programmes;

public class Answer4 {
    int age1 = 45;
    String name1 = "Mr Smith";
    static int age2 = 50;
    static String name2 = "Mr John";

    public static void main(String[] args) {
        Answer4 callInstance1Method = new Answer4();
        callInstance1Method.instance1();
        static1();
    }

    public void instance1 (){
        System.out.println("Manager " + name1 + " is " + age1 + " and Secretary " + name2 + " is " + age2);
    }
    public static void static1 (){
        Answer4 callStaticVariable = new Answer4();
        System.out.println("Director " + name2 + " is " + age2 + " and Junior Director " + callStaticVariable.name1 + " is " + callStaticVariable.age1);
    }

}
