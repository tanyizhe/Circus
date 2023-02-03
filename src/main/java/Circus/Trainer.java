package Circus;

import Circus.animals.Animal;
import Circus.animals.Bird;
import Circus.animals.Duck;
import Circus.animals.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck duck = new Duck();
        getToSpeak(duck);

        Bird bird = (Bird) duck;  // upcasting
        getToSpeak(bird);

        Animal animal = (Animal) bird; // upcasting
        getToSpeak(animal);

        Duck d2 = (Duck) animal; // downcasting
        getToSpeak(d2);

        train(new Duck());
        train(new Parrot());
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("Not a duck! Not a duck!");
        }
    }
}
