import java.util.*;

public class Barn {
    private List<Animal> animals;


    /* Add a method to Barn class to categorize the animals in your barn based on the sound they make.
    * Add Each different animal type to its own list. 
    * Sort each animal list by ID number from least to greatest. 
    * Print out the final contents of each list and all the animal properties, ID, sound, move, and behavior
    * in the main method to prove that the lists have been sorted.
    */

   
    


    // Constructor for Barn
    public Barn() {  animals = new ArrayList<>();
        Random random = new Random();

        // Add a random number of each animal type (0 to 10) to the barn
        int numberOfDogs = random.nextInt(11);  // Random number between 0 and 10
        int numberOfCats = random.nextInt(11);
        int numberOfHorses = random.nextInt(11);
        int numberOfCows = random.nextInt(11);

        for (int i = 0; i < numberOfDogs; i++) {
            animals.add(new Dog());
        }

        for (int i = 0; i < numberOfCats; i++) {
            animals.add(new Cat());
        }

        for (int i = 0; i < numberOfHorses; i++) {
            animals.add(new Horse());
        }

        for (int i = 0; i < numberOfCows; i++) {
            animals.add(new Cow());
        }

        Collections.shuffle(animals, random);

       
    }

    public void categorizeAnimals() {

        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Horse> horses = new ArrayList<>();
        List<Cow> cows = new ArrayList<>();

      
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogs.add((Dog) animal);
            } else if (animal instanceof Cat) {
                cats.add((Cat) animal);
            } else if (animal instanceof Horse) {
                horses.add((Horse) animal);
            } else if (animal instanceof Cow) {
                cows.add((Cow) animal);
            }
        }

        
        Comparator<Animal> byID = Comparator.comparingInt(Animal::getAnimalID);
        dogs.sort(byID);
        cats.sort(byID);
        horses.sort(byID);
        cows.sort(byID);

    
        printCategory("Dogs", dogs);
        printCategory("Cats", cats);
        printCategory("Horses", horses);
        printCategory("Cows", cows);
    }

    
    private void printCategory(String category, List<? extends Animal> animals) {
        System.out.println(category + ":");
        for (Animal animal : animals) {
            System.out.println("Animal ID: " + animal.getAnimalID() + ", Sound: " + animal.getSound());
            animal.move();
            animal.uniqueBehavior();
        }
        System.out.println(); 
    }


        public static void main(String[] args) {
            Barn barn = new Barn();
            barn.categorizeAnimals();
            
        }
    
    }
