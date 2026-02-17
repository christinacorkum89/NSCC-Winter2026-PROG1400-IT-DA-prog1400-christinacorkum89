public class Car {
    // The class is a blueprint(template) of any new object.
    // --------- 1. Attributes/Fields/Properties
    public String make;
    public String color;
    public int manufacturingYear;
    public double priceBeforeTax;


    // ---------2. The Constructor(s) ---------------//
    //Using the constructor, we will assign value(s) to the above attributes.
    //We have 3 types of constructors:
    //A. The default constructor without parameters.
    // In this one, it will assign the default value for each of the above attributes
    //You as a programmer are not going to declare it.

    //B. The user-defined constructor without parameters:
    public Car()
    {
        //In this constructor, we will hardcode the value(S) of the above attribute(s):
        this.make = "Ford";
        this.color = "Black";
        this.manufacturingYear = 2025;
        this.priceBeforeTax = 50000;

    }

    //C. The user-defined constructor with parameters:

    public Car(String pMake,String pColor, int pManufacturingYear, double pPriceBeforeTax)
    {
        //I will assign the values of each of the above attributes using
        // the passed arguments(values) for the parameters of this constructor.
        this.make = pMake;
        this.color = pColor;
        this.manufacturingYear = pManufacturingYear;
        this.priceBeforeTax = pPriceBeforeTax;

    }

    public Car(String pMake,String pColor)
    {
        //I will assign the values of each of the above attributes using
        // the passed arguments(values) for the parameters of this constructor.
        this.make = pMake;
        this.color = pColor;


    }


    // ---------- 3. Method(s) -------------------------//
    public void carsReport()
    {
        //In Java, void means that there is no returned value from this method.
        // It will print directly to the console.
        System.out.println(this.make);
        System.out.println(this.color);
        System.out.println(this.manufacturingYear);
        System.out.println(this.priceBeforeTax);
    }

    public double calculatePrice(){
        return this.priceBeforeTax * 1.15;
    }

    public double calculatePriceVer2(){
        double priceAfterTax = this.priceBeforeTax * 1.15;
        return priceAfterTax;
    }
}
