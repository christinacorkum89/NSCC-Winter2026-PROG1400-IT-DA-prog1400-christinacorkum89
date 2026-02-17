//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    Car[] myGarage = new Car[3];
    //Local variables:
    String make,model,color;
    int year;
    double priceBefTax;

    System.out.println("Gathering from the Console:");
    for (int i = 0; i < myGarage.length; i++) {
        System.out.println("Object number " + (i+1));

        System.out.print("Enter Car's make: ");
        make = sc.nextLine();

        System.out.print("Enter Car's model: ");
        model = sc.nextLine();

        System.out.print("Enter Car's color: ");
        color = sc.nextLine();

        System.out.print("Enter Car's manufacturing year");
        year = sc.nextInt();

        System.out.print("Enter Car's price before tax: ");
        priceBefTax = sc.nextDouble();
        sc.nextLine(); //To resolve the scanner's issue.

        myGarage[i] = new Car(make,model,color,year,priceBefTax);
    }

    for (int i = 0; i < myGarage.length; i++) {
        System.out.println(myGarage[i].toString());

    }

    System.out.println("Printing the report using foreach loop:");
    for (Car myCar : myGarage) {
        System.out.println(myCar.carsMake);
        System.out.println(myCar.toString());
        System.out.println("=".repeat(50));

    }
}
