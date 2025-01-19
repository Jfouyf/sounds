public class Dog extends Animal {
    @Override
    public String getSound() {
        return "Bark";
    }

    @Override
    public void move() {
        System.out.println("The dog runs on four legs.");
    }

    @Override
    public void uniqueBehavior() {
        System.out.println("The dog fetches a ball.");
    }
}
