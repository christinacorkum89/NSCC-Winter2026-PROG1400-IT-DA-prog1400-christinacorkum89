public class Car {
    //Any new class, has three main parts:
    //1. Attribute(s)/propertie(s)/state(s)/field(s)
    public String carsMake;
    public String carsModel;
    public String carsColor;
    public int year;
    public double priceBeforeTax;
    public double priceAfterTax;

    //2. The Constructor(s):
    /*
    The constructor is the method that it uses the class name in its
    signature (declaration) line. IT will assign the values of the above
    attributes.
    We have 3 types of constructors:
     */

    /*
    ------------------------------------------------
    A. The hidden default constructor without parameters.
     This type of constructor will assign the default values for
      all the above attributes.
     */

    //B. The Constructor without parameters:
    public Car() {
        //I can assign at least one hardcoded value to one attribute, or assign all
        //the attributes' value:
        this.carsMake = "Honda";
        this.year = 2015;
    }

    //C. The constructor with parameters (Parametrized Constructor):
    public Car(String make,String model,String color,int manufacturingYear){
        //I will assign the received arguments to the attributes of this class:
        this.carsMake = make;
        this.carsModel = model;
        this.carsColor = color;
        this.year = manufacturingYear;
    }
    //Please remind me to use the built-in command to generate Constructor C.

    public Car(String carsMake, String carsModel, String carsColor, int year, double priceBeforeTax) {
        this.carsMake = carsMake;
        this.carsModel = carsModel;
        this.carsColor = carsColor;
        this.year = year;
        this.priceBeforeTax = priceBeforeTax;
        //The following is the list price of any car
        this.priceAfterTax = priceBeforeTax + 200 + priceBeforeTax*0.14;
    }

    //3. The Methods/ Behaviors:
    public void report1(){
        System.out.println(carsMake);
        System.out.println(this.carsModel);
        System.out.println(this.carsColor);
        System.out.println(this.year);
    }

    public String report2(){
        String report = String.format("Car's Make: %s\t-Car's Model: %s\t-Color: %s" +
                "-Manufacturing Year: %d",
                this.carsMake,
                this.carsModel,
                this.carsColor,
                this.year);
        return report;

    }

    public String toString(){
        String report = String.format("Car's Make: %s\t-Car's Model: %s\t-Color: %s" +
                        "-Manufacturing Year: %d" +
                        "\nPrice Before Tax: %.2f\t-Final Price: %.2f",
                this.carsMake,
                this.carsModel,
                this.carsColor,
                this.year,
                this.priceBeforeTax,this.priceAfterTax);
        return report;
    }






}
