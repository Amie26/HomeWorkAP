package HomeworkWeek3;

public class Excercise20 {
    //program to check if an array contains the specific value

    public static boolean contains (int [] array1, int item){
        for (int no : array1){
            if (item == no) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int [] my_array1 = {
                345, 567, 789,234, 734, 421};

        System.out.println(contains(my_array1, 789));
        System.out.println(contains(my_array1, 123));
    }




}
