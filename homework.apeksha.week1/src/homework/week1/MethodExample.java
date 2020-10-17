package homework.week1;

public class MethodExample {
    public static void main(String[] args) {
        MethodExample obj = new MethodExample();
      //  obj.addition();
      //  obj.addition1(10, 20);
      //  obj.printMyName("Apeksha");
       // obj.printMyName();
        System.out.println(obj.addition3(1,2,3));
    }

    // No return type No parameter method
    public void addition() {
        System.out.println("This is addition method");
    }

    //No return type with parameters
    public void addition1(int a, int b) {
        System.out.println(a + b);
    }

    public void printMyName(String name, int empID) {
        System.out.println(name + empID);
        System.out.println(empID);
        //with return type No parameters


    }

    public boolean isChild() {
        return true;
    }
    //with return type with parameters

    public int addition3(int a, int b, int c) {
        return a + b + c;

    }
}
