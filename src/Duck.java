public class Duck extends Animal {
    @Override
    String getName() {
        return "Vịt";
    }

    @Override
    boolean canSwim() {
        return true;
    }

    @Override
    boolean canWalk() {
        return true;
    }
}
