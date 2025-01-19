import java.util.Random;
public abstract class Animal {
    public int animalID;

    public Animal() {
        // Generate a random ID between 120 and 500
        Random random = new Random();
        this.animalID = random.nextInt(381) + 120;  // Random number between 120 and 500 (inclusive)
    }

    public abstract String getSound();

    public int getAnimalID() {
        return animalID;  // Getter method to access the animal's ID
    }

    public void makeSound() {
        System.out.println(getSound());
    }

    

    public abstract void move();

    public void uniqueBehavior() {
        System.out.println("This animal has no special behavior.");
    }


}
