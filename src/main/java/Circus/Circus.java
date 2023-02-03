package Circus;

import Circus.animals.Animal;
import Circus.animals.Duck;
import Circus.animals.Parrot;
import Circus.stuff.Cannon;
import Circus.stuff.Equipment;
import Circus.stuff.Ladder;

public class Circus {
    private static Animal[] animals = {
            new Duck(),
            new Parrot()
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset asset : assets) {
            if (asset.getValue() <= 5) {
                // guard clause
                System.out.println("Ignoring low value item: " + asset.getValue());
                continue;
            }
            // happy path
            total += asset.getValue();
            System.out.println("Adding item value: " + asset.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of animals " + calculateValue(animals));
        System.out.println("Total value of animals " + calculateValue(equipments));
    }
}
