public class Pig extends Animal {
    @Override
    String getName() {
        return "Lợn";
    }

    @Override
    boolean canSwim() {
        return false;
    }

    @Override
    boolean canWalk() {
        return true;
    }
}
