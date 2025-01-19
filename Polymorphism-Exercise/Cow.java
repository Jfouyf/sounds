public class Cow extends Animal {
    @Override
    public String getSound() {
        return "Moo";
    }

    @Override
    public void move() {
        System.out.println("The cow walks slowly.");
    }

    @Override
    public void uniqueBehavior() {
        System.out.println("The cow chews cud.");
    }
}
