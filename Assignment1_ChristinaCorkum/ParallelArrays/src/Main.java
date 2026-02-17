//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Parallel Arrays:
    String[] stdNames = {"Yousef","Brad","Lily","David"};
    double[] stdGrades = {59.9999999999,99,95.5,100};
    System.out.println("Students' Report: ==============");
    System.out.println("=".repeat(50));
    for (int i = 0; i < stdNames.length; i++) {
        System.out.println("Std. Name: " +
                stdNames[i] + "\t"
                + "Std. Grades: "
                + stdGrades[i]);
        
    }

    System.out.println("The students who failed the course");
    System.out.println("=".repeat(50));
    for (int i = 0; i < stdNames.length; i++) {
        if (stdGrades[i] < 60) {
            System.out.println("Std. Name: " +
                stdNames[i] + "\t"
                + "Std. Grade: "
                + stdGrades[i]);
        }
    }
}
