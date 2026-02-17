import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Scanner Object
        Scanner sc = new Scanner(System.in);
        //I will declare an array of Car objects:
        Car[] ourCars = new Car[3];
        //Declare the 4 local variables:
        String carsMake,carsModel,carsColor;
        int carsYear;

        System.out.println("Gathering data for 3 car's objects");
        System.out.println("Using For i Loop:");
        for (int i = 0; i < ourCars.length; i++) {
            System.out.println("Input car's information number: " + (i+1) + " : ");
            System.out.println();
            System.out.println("=".repeat(30));

            System.out.println("Enter the make: ");
            carsMake = sc.nextLine();
            System.out.println("Enter the model: ");
            carsModel = sc.nextLine();
            System.out.println("Enter the color: ");
            carsColor = sc.nextLine();
            System.out.println("Enter the year: ");
            carsYear = sc.nextInt(); sc.nextLine();
            //I will instantiate the new Car's object using the 4 local variables:
            Car carsObject = new Car(carsMake,carsModel,carsColor,carsYear);
            //I will assign the previous object to the i-th element in the ourCars array
            ourCars[i] = carsObject;

            //ourCars[i] = new Car(carsMake,carsModel,carsColor,carsYear);

        }

        System.out.println("Interacting with our array of object:============");
        System.out.println(ourCars.length);
        for (int i = 0; i < ourCars.length; i++) {
            System.out.println(ourCars[i].toString());
            ourCars[i].report();
        }

    }
}