public class Horse extends Animal {
    @Override
    public String getSound() {
        return "Neigh";
    }

    @Override
    public void move() {
        System.out.println("The horse gallops.");
    }

    @Override
    public void uniqueBehavior() {
        System.out.println("The horse jumps over a hurdle.");
    }
}
