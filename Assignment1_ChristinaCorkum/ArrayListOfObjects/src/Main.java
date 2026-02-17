import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //I will declare an array of objects:
    Car[] myGarage = new Car[1];
    System.out.println("The size of the array of Cars: is: " +
            myGarage.length);
    //I will declare an ArrayList of Car objects:
    ArrayList<Car> myGarage2 = new ArrayList<>();
    System.out.println("The size of the ArrayList of Cars: is: " +
            myGarage2.size());
    Car yousefsCar = new Car();
    //I will add the yousefsCar object to the two above arrays:
    myGarage[0] = yousefsCar;
    System.out.println("The size of the array of Cars: is: " +
            myGarage.length);
    myGarage2.add(yousefsCar) ;
    System.out.println("The size of the ArrayList of Cars: is: " +
            myGarage2.size());
    //I will add  other Car's objects to the ArrayList:
    myGarage2.add(new Car("Honda","Civic",
            "Red",2023));
    System.out.println("The size of the ArrayList of Cars: is: " +
            myGarage2.size());
    myGarage2.add(new Car("Kia","Soul","Blue",
            2022,25000));
    System.out.println("The size of the ArrayList of Cars: is: " +
            myGarage2.size());

    System.out.println("Interacting with the ArrayList of objects,using For-i Loop:");
    System.out.println("=".repeat(50));
    for (int i = 0; i < myGarage2.size(); i++) {
        System.out.println(String.format("Object number %d",(i+1)));
        myGarage2.get(i).report1();
        System.out.println(myGarage2.get(i).report2());
        System.out.println(myGarage2.get(i).toString());

    }


    System.out.println("Interacting with the ArrayList of objects,using For-each Loop:");
    System.out.println("=".repeat(50));
    int j = 1;
    for (Car myCurrentCar : myGarage2) {
        System.out.println(String.format("Object number %d",(j)));
        j++;
        myCurrentCar.report1();
        System.out.println(myCurrentCar.report2());
        System.out.println(myCurrentCar.toString());
        System.out.println(myCurrentCar);
        System.out.println(myCurrentCar.carsMake);
    }

    System.out.println("Interacting with the Array of objects,using For-each Loop:");
    System.out.println("=".repeat(50));
    for (Car myCurrentCar : myGarage) {
        System.out.println(String.format("Object number %d",(j)));
        j++;
        myCurrentCar.report1();
        System.out.println(myCurrentCar.report2());
        System.out.println(myCurrentCar.toString());
        System.out.println(myCurrentCar);
        System.out.println(myCurrentCar.carsMake);
    }

    System.out.println("Interacting with the Array of objects,using For-i Loop:");
    System.out.println("=".repeat(50));
    for (int i = 0; i < myGarage.length; i++) {
        System.out.println(String.format("Object number %d",(i+1)));
        myGarage[i].report1();
        System.out.println(myGarage[i].report2());
        System.out.println(myGarage[i].toString());

    }




}
