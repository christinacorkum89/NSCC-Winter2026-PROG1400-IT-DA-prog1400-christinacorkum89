import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declare a aScanner object:
        Scanner sc = new Scanner(System.in);
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("One Dim Array Example!");
        //Declare array of integer using the hardcoding concept:
        //Index values:     0 , 1 ,2,3
        int[] intNumbers = {10,20,30,40};
        //To print the size of the array
        System.out.println(intNumbers.length);
        //To print the second element in the array:
        System.out.println(intNumbers[1]);

        double[] stdGrades = new double[3];
        System.out.println("The double array");
        System.out.println("The size: ---------");
        System.out.println(stdGrades.length);
        System.out.println("The double array's elements: ------");
        for (int i = 0; i < stdGrades.length; i++) {
            System.out.println(stdGrades[i]);
        }
        //Not preferable assignments for the array's elements:
        stdGrades[0] = 88.9;
        stdGrades[1] = 99.5;
        stdGrades[2] = 77.8;
        //stdGrades[3] = 56.7;
        System.out.println("The new array's elements : ------");
        for (int i = 0; i < stdGrades.length; i++) {
            System.out.println(stdGrades[i]);
        }
        //The preferred  assignments for the array's elements:
        for (int i = 0; i < stdGrades.length; i++) {
            System.out.println("Enter array's element # : " + (i + 1));
            stdGrades[i] = sc.nextDouble();
        }
        System.out.println("The new array's elements : ------");
        for (int i = 0; i < stdGrades.length; i++) {
            System.out.println(stdGrades[i]);
        }


    }
}