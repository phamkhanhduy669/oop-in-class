public class Fish extends Animal {
    @Override
    String getName() {
        return "Cá";
    }

    @Override
    boolean canSwim() {
        return true;
    }

    @Override
    boolean canWalk() {
        return false;
    }
}
