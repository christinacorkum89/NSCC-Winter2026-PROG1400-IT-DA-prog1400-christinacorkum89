public class Animal {
    /*
     Step 1: Define an Animal class with four properties:
     Species – ex. Lion, cow or sloth
     Max Weight – The maximum average weight of an adult of the species
     Habitat – ex. Jungle, ocean or mountains
     Is Endangered – Flag to indicate whether the animal species is endangered
     */
    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;

    /*
    Step 2: Add a default constructor, with any default values
    that you feel may be required
     */
    public Animal() {
        this.setSpecies("Dog");
        this.setMaxWeight(30);
        this.setHabitat("Home");
        this.setEndangered(false);
    }

    /*
    Step 3: Add a parameterized constructor,
    to allow setting of all properties on object creation.
     */
    public Animal(String species, double maxWeight, String habitat, boolean isEndangered) {
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

    /*
    Step 4: Determine scope/access of properties
    Step 5: Create appropriate getter/setter methods, as required
     */
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    /*
    Step 6: Create three methods – ie.
    Actions that Animal instances can do, or that involve Animal objects
     */

    // 1. Animals can be fed - ex. Feed a tiger a steak.
    public String feedAnimal() {
        String message = String.format("Feed a %s a steak. Maybe Funny!!", this.species);
        return message;
    }

    // 2. Animals can make a sound – ex. A cow can moo.
    public String makeSound() {
        String sound = "Un-Specified Sound";
        if (this.species.equals("Cat"))
            sound = "Meoww Meoww";
        else if (this.species.equals("Dog"))
            sound = "Wooff Wooff";
        else if (this.species.equals("Lion"))
            sound = "Rarrr Rarrr";
        else if (this.species.equals("Cow"))
            sound = "Moo Moo";

        String message = String.format("A %s can %s.", this.species, sound);
        return message;
    }

    // 3. In our program, an animal can report its state. (toString())
    public String toString() {
        String status = "not in endangered";
        if (this.isEndangered)
            status = "an endangered";

        String report = String.format("I am a %.2flb %s that lives in the %s. " +
                "I am %s species", this.maxWeight, this.species, this.habitat, status);

        return report;
    }
}



