//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    /*
    Step 7: In Main() class,
    create three Animal objects,
    setting their properties via the constructors.

     */

    Animal myDog = new Animal();
    Animal myCat = new Animal("Cat", 15, "Home", false);
    Animal wildCat = new Animal("Cat", 35, "Mountains", true);
    Animal lion = new Animal("Lion", 600, "Jungle", true);

    /*
    Step 8: Add the three (4) Animals to the Zoo (object array).

     */
    Animal[] zoo = new Animal[4];
    zoo[0] = myDog;
    zoo[1] = myCat;
    zoo[2] = wildCat;
    //zoo[3] = lion; We can't add this fourth object to the zoo array of object.

    //Optional: I will declare an ArrayList of Animal objects:
    ArrayList<Animal> zooArrayList = new ArrayList<>();
    zooArrayList.add(myDog);
    zooArrayList.add(myCat);
    zooArrayList.add(wildCat);
    zooArrayList.add(lion);

    /*
    Step 9: Let's interact with our objects, to test their functionality.
    Create a loop to take each Animal out of the Zoo and call its methods.

     */
    System.out.println("From zoo Array of objects(Animals)");
    for (int i = 0; i < zoo.length; i++) {
        System.out.println("Object number: " + (i + 1));
        System.out.println(zoo[i].feedAnimal());
        System.out.println(zoo[i].makeSound());
        System.out.println(zoo[i].toString());
        System.out.println(zoo[i]);
    }
    System.out.println("From zooArrayList of objects(Animals)");
    for (int i = 0; i < zooArrayList.size(); i++) {
        System.out.println("Object number: " + (i + 1));
        System.out.println(zooArrayList.get(i).feedAnimal());
        System.out.println(zooArrayList.get(i).makeSound());
        System.out.println(zooArrayList.get(i).toString());
        System.out.println(zooArrayList.get(i));
    }
}
