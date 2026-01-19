// In-class Exercise 2: Grade Calculator
// Christina Corkum
// January 19, 2026

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of valid letter grades
        char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};

        // Corresponding numeric grades
        int[] numericGrades = {4, 3, 2, 1, 0};

        // Welcome and get input
        System.out.println("Grade Calculator");
        System.out.print("Enter your letter grade (A, B, C, D, or F): ");
        char grade = scanner.next().charAt(0);

        // Convert to uppercase in case user types lowercase
        grade = Character.toUpperCase(grade);

        // Find matching numeric grade
        int numericValue = -1;  // Default if not found (though no validation needed)

        for (int i = 0; i < letterGrades.length; i++) {
            if (letterGrades[i] == grade) {
                numericValue = numericGrades[i];
                break;
            }
        }

        // Output result
        if (numericValue != -1) {
            System.out.println("The numeric value for grade " + grade + " is " + numericValue + ".");
            System.out.println("Great job — that's a solid " + numericValue + "!");
        } else {
            // This won't happen with valid input, but just in case
            System.out.println("Hmm, I didn't recognize that grade.");
        }

        scanner.close();
    }
}