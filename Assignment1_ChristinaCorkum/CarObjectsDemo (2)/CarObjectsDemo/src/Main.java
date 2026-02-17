import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our first OOP Program!");
        //I will declare a new Scanner object:
        Scanner sc = new Scanner(System.in);
        //I will instantiate the Car class(I will create a new object of Car class):
        Car yousefsCar = new Car(); // We used the constructor without parameter.
        Car bradsCar = new Car("Toyota","Red",2022,23000);
        Car lilysCar = new Car("Kia","White",2015,1000);
        //I will interact with the above object:
        System.out.println(yousefsCar); //Printing the address of this object.
        System.out.println(yousefsCar.toString());
        System.out.println(bradsCar);
        System.out.println(lilysCar);
        System.out.println(yousefsCar.make);
        System.out.println(yousefsCar.color);
        System.out.println(yousefsCar.manufacturingYear);
        System.out.println(yousefsCar.priceBeforeTax);

        //I will modify the above attributes for yousefsCar object:
        yousefsCar.make = "Toyota";
        yousefsCar.color = "Blue";
        yousefsCar.manufacturingYear = 2000;
        yousefsCar.priceBeforeTax = 500;
        System.out.println("Cars Information: ===================");
        System.out.println("Yousef's Car Information");
//        System.out.println(yousefsCar.make);
//        System.out.println(yousefsCar.color);
//        System.out.println(yousefsCar.manufacturingYear);
//        System.out.println(yousefsCar.priceBeforeTax);
        yousefsCar.carsReport();

        System.out.println("Cars Information: ===================");
        System.out.println("Brad's Car Information");
//        System.out.println(bradsCar.make);
//        System.out.println(bradsCar.color);
//        System.out.println(bradsCar.manufacturingYear);
//        System.out.println(bradsCar.priceBeforeTax);
        bradsCar.carsReport();



        System.out.println("Cars Information: ===================");
        System.out.println("Lily's Car Information");
//        System.out.println(lilysCar.make);
//        System.out.println(lilysCar.color);
//        System.out.println(lilysCar.manufacturingYear);
//        System.out.println(lilysCar.priceBeforeTax);
        lilysCar.carsReport();

        System.out.println("Yousef's car price after tax is: ");
        System.out.println(yousefsCar.priceBeforeTax * 1.15);

        System.out.println("Brad's car price after tax is: ");
        System.out.println(bradsCar.calculatePrice());

        Car davidsCar = new Car("B.M.W","Pink");
        davidsCar.carsReport();
        Car geoffsCar = new Car();
        geoffsCar.carsReport();




    }
}