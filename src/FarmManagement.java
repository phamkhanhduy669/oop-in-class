import java.util.ArrayList;
import java.util.List;

public class FarmManagement {
    public void printAnimal(List<Animal> farm) {
        System.out.println("- Có thể bơi:");
        for (Animal animal : farm) {
            if (animal.canSwim()) {
                System.out.println(animal.getName());
            }
        }

        System.out.println("- Có thể đi bộ:");
        for (Animal animal : farm) {
            if (animal.canWalk()) {
                System.out.println(animal.getName());
            }
        }
    }
    public static void main(String[] args) {
        List<Animal> farm = new ArrayList<>();
        farm.add(new Pig());
        farm.add(new Duck());
        farm.add(new Fish());

        FarmManagement farmManagement = new FarmManagement();
        farmManagement.printAnimal(farm);

    }
}
