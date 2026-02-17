//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("One Dimensional Array Example: ");
    Scanner sc = new Scanner(System.in);
//I will declare a double array:
    double[] stdGrades = new double[4];
    System.out.println("The size of the array is: " + stdGrades.length);
//I will assign a value for the first element:
    stdGrades[0] = 77.8;
    System.out.println("The size of the array is: " + stdGrades.length);
//I will assign a value for the second element:
    stdGrades[1] = 99;
    System.out.println("The size of the array is: " + stdGrades.length);
//I will assign a value for the third element from the console:
    System.out.print("Enter the third grade: ");
    stdGrades[2] = sc.nextDouble();
//I will assign a value for the fourth element:
    stdGrades[3] = 88.5;
    System.out.println("The size of the array is: " + stdGrades.length);
    System.out.println("Printing the array elements: ====================");
    System.out.println(stdGrades);
    for (int i = 0; i < stdGrades.length; i++) {
        System.out.println(stdGrades[i]);

    }

    //  stdGrades[4] = 100; Not accepted as it is out of bounds







}
