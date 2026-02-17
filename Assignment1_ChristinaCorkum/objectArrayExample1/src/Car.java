public class Car {
    //We have to write the following 3 parts in  each class:

    //1. Attribute/Properties/Fields
    public String make;
    public String model;
    public String color;
    public int manufactureYear;

    //2. The Constructor(s): We have 3 types of constructors:
    //A: The default built in constructor:
    /*
    It is going to assign the default values for each of the above attributes
    It means you are not assumed to assign any value, but default values will be saved.

     */
    //B. A constructor without parameters:
    public Car()
    {
        //You can hard code the values of all of the attributes or part of them:
        this.make = "Toyota";
        this.color = "Blue";
//        this.manufactureYear = 2015;
//        this.make = "Honda";

    }


    //C The Constructor with parameters:
    //I will write the code by myself:
//    public Car(String carsMake,String carsModel,String carsColor,int carsYear)
//    {
//        this.make = carsMake;
//        this.model = carsModel;
//        this.color = carsColor;
//        this.manufactureYear = carsYear;
//    }

    //I will use the built in command:


    public Car(String make, String model, String color, int manufactureYear)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
    }

    public Car(String color, int manufactureYear)
    {

        this.color = color;
        this.manufactureYear = manufactureYear;
    }

    //3. Actions/Methods/Behaviours
    //I will define a method that prints something, like:
    public void turnLeft()
    {
        //void means: I am not going to return any value to
        // the calling statement;
        //I will just print directly to the console:
        System.out.println("Turn Left");
    }
    public void turnRight()
    {
        //void means: I am not going to return any value to
        // the calling statement;
        //I will just print directly to the console:
        System.out.println("Turn Right");
    }

    public void report()
    {
        System.out.println(make +"--"+ model +"--"+ color+ "--"+ manufactureYear);
    }

    //Add a new method to let the object report itself:
    public String toString() {
        //We override the existing implementation of the built-in toString() method
        //in the main Object class
        String report ="Car's make: " + "\t" + this.make + " .Car's Model: " +
                this.model + " .Year: " + this.manufactureYear;
        return report;
    }
//
}
