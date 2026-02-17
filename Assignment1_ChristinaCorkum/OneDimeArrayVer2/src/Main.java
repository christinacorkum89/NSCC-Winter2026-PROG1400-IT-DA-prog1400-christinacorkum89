import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Another one-dim array:");
        //Declare an array of String:
        String[] stdNames = new String[3];
        double[] stdGrades = {99.5,77.6,88.5};
        Scanner sc = new Scanner(System.in);

        System.out.println("Obtain the names from the console:");
        for (int i = 0; i < stdNames.length; i++) {
            System.out.println("Enter the student's name #: " + (i +1));
            //stdNames.append("Yousef") in Python.
            //In Java:
            stdNames[i] = sc.nextLine();
        }
        System.out.println("Report of my the students and their grades:");
        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + " " + stdGrades[i]);
        }
        System.out.println("Print the students' names using foreach loop");
        for (String currentName : stdNames) {
            System.out.println(currentName);
        }
        System.out.println("Print the students' grades using foreach loop");
        for (double currentGrade : stdGrades) {
            System.out.println(currentGrade);
        }

        // ----------------------- In Class Activity # 2: ---------//
        //Grade Convertor ---------------//
        String[] letterGrades = {"A","B", "C","D","F"};
        int[] numericGrades = {4,3,2,1,0};



    }
}