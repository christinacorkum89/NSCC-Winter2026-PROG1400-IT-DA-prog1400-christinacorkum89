import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //It is good idea to declare all of your local variables first.
        //then start dealing with them.

        //Car yousefsCar = new Car();
        System.out.println("Input Yousef's Car Info. : ----");
        System.out.println("=".repeat(30));
        System.out.println("Enter the make: ");
        String carsMake = sc.nextLine();
        System.out.println("Enter the model: ");
        String carsModel = sc.nextLine();
        System.out.println("Enter the color: ");
        String carsColor = sc.nextLine();
        System.out.println("Enter the year: ");
        int manufYear = sc.nextInt(); sc.nextLine();

        Car yousefsCar = new Car(carsMake,carsModel,carsColor,manufYear);

        yousefsCar.report();
        System.out.println(yousefsCar.toString());
        System.out.println(yousefsCar);


        System.out.println("Input Brad's Car Info. : ----");
        System.out.println("=".repeat(30));
        System.out.println("Enter the make: ");
        carsMake = sc.nextLine();
        System.out.println("Enter the model: ");
        carsModel = sc.nextLine();
        System.out.println("Enter the color: ");
        carsColor = sc.nextLine();
        System.out.println("Enter the year: ");
        manufYear = sc.nextInt();

        Car bradsCar = new Car(carsMake,carsModel,carsColor,manufYear);
        System.out.println(bradsCar.toString());


    }
}