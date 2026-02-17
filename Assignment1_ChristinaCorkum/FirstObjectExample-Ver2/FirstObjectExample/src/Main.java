//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    //I will interact with the Car class and,
    // instantiate a new object called yousefsCar of the Car class:
    Car yousefsCar = new Car();
    //Let's interact with this new object by printing its attributes values:
    System.out.println(yousefsCar.carsMake);
    System.out.println(yousefsCar.carsModel);
    System.out.println(yousefsCar.carsColor);
    System.out.println(yousefsCar.year);

    //Declare a new object  of the Car class:
    Car bradsCar = new Car();
    System.out.println(bradsCar.carsMake);
    System.out.println(bradsCar.carsModel);
    System.out.println(bradsCar.carsColor);
    System.out.println(bradsCar.year);

    //I will change the attributes of the above two objects:
    yousefsCar.carsMake = "Kia";
    yousefsCar.carsModel = "Soul";
    yousefsCar.carsColor = "White";
    yousefsCar.year = 2020;

    System.out.println(yousefsCar.carsMake);
    System.out.println(yousefsCar.carsModel);
    System.out.println(yousefsCar.carsColor);
    System.out.println(yousefsCar.year);

    Car lilysCar = new Car("Honda","Pilot","Red",2025);

    System.out.println(lilysCar.carsMake);
    System.out.println(lilysCar.carsModel);
    System.out.println(lilysCar.carsColor);
    System.out.println(lilysCar.year);

    System.out.println(yousefsCar);
    System.out.println(yousefsCar.toString());
    System.out.println(bradsCar);
    System.out.println(lilysCar);

    System.out.println("Invoking the Car's method(s): ");
    yousefsCar.report1();
    bradsCar.report1();
    lilysCar.report1();
    System.out.println(yousefsCar.report2());
    yousefsCar.report2();
    System.out.println(bradsCar.report2());
    System.out.println(lilysCar.report2());

}
