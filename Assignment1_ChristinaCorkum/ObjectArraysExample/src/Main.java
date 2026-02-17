//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    Car[] myGarage = new Car[3];
    //Local variables:

    String make,model,color;
    double priceBefTax;
    int year;
    System.out.println("Gathering data for all 3 Objects attributes");
    for (int i = 0; i < myGarage.length; i++) {
        System.out.println(String.format("Car's Object number %d ======",(i+1)) );
        System.out.print("Enter car's make: ");
        make = sc.nextLine();

        System.out.print("Enter car's model: ");
        model = sc.nextLine();

        System.out.print("Enter car's color: ");
        color = sc.nextLine();

        System.out.print("Enter car's manufacturing year: ");
        year = sc.nextInt();

        System.out.print("Enter car's price before tax: ");
        priceBefTax = sc.nextDouble();
        sc.nextLine();//To resolve the Scanner's issue

        myGarage[i] = new Car(make,model,color,year,priceBefTax);
    }

    for (int i = 0; i < myGarage.length; i++) {
        myGarage[i].report1();
        System.out.println(myGarage[i].report2());
        System.out.println("Reporting the object using toString() method:");
        System.out.println(myGarage[i].toString());
        System.out.println("Reporting the object using the object's name only:");
        System.out.println(myGarage[i]);

    }

    //For each loop in our next class


}
