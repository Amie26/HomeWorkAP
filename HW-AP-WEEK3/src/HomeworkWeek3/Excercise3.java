package HomeworkWeek3;

import java.util.Scanner;
// program to print the Marksheet
public class Excercise3 {
    String result, grade;

    public static void main(String[] args) {
        Excercise3 objAP1 = new Excercise3();
        objAP1.markSheet();


    }

    public void markSheet() {
        Scanner mySc = new Scanner(System.in);
        System.out.println(" Name ");
        String name = mySc.nextLine();
        System.out.println(" Roll No :");
        int rollNo = mySc.nextInt();
        System.out.println(" Maths");
        int Maths = mySc.nextInt();
        System.out.println(" Science ");
        int Science = mySc.nextInt();
        System.out.println(" English");
        int English = mySc.nextInt();
        int total;
        float percentage;
        if (Maths > 0 && Maths <= 100) {
            if (Science > 0 && Science <= 100) {
                if (English > 0 && English <= 100) {
                    total = (Maths + Science + English);
                    percentage = (float) ((100 * total) / 300);
                    if (percentage < 35) {
                        result = " Fail";
                        grade = " N/a ";
                    } else if (percentage >= 35) {
                        result = " Pass";
                        grade = " C ";
                        if (percentage >= 50) {
                            result = " Pass";
                            grade = " B ";
                            if (percentage >= 60) {
                                result = " Pass ";
                                grade = " A ";
                                if (percentage >= 80) {
                                    result = " Pass ";
                                    grade = " A+ ";
                                }
                            }
                        }
                    }
                    System.out.println("\n\t\tMark Sheet\n" +
                            "-----------------------------\n" +
                            "\tName\t\t:\t" + (name) + "\n" +
                            "\tRoll No\t\t:\t" + (rollNo) + "\n" +
                            "------------------------------\n" +
                            "\tSubjects\t\tMarks\n" +
                            "------------------------------\n" +
                            "\tMaths\t\t:\t" + (Maths) + "\n" +
                            "\tScience\t\t:\t" + (Science) + "\n" +
                            "\tEnglish\t\t:\t" + (English) + "\n" +
                            "------------------------------\n" +
                            "\tTotal\t\t:\t" + (total) + "\n" +
                            "-----------------------------\n" +
                            "\tPercentage\t:\t" + (percentage) + "\n" +
                            "\tResult\t\t:\t" + (result) + "\n" +
                            "\tGrade\t\t:\t" + (grade) + "\n" +
                            "------------------------------\n");
                }
            }

        } else
            System.out.println("Invalid Input, Marks should be 0 to 100 ");
    }
}
