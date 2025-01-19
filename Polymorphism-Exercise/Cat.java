public class Cat extends Animal {
    @Override
    public String getSound() {
        return "Meow";
    }

    @Override
    public void move() {
        System.out.println("The cat gracefully strides.");
    }

    @Override
    public void uniqueBehavior() {
        System.out.println("The cat climbs a tree.");
    }
}
