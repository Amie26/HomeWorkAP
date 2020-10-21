package total20programmes;

// This class shows 2 instance variable in the main method

public class Answer1 {
    String name = "Apeksha"; // this is instance variable
    String surName = "Patel"; // this is instance variable
   // main method
    public static void main(String[] args) {
        Answer1 obj = new Answer1(); // objected is created
        obj.setName(); //calling instance method using object
    }

    public void setName() {
        System.out.println(name); //instance variable called in method
        System.out.println(surName); //instance variable called in method
    }


}
