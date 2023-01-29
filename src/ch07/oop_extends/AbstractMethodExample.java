package ch07.oop_extends;

public class AbstractMethodExample {
    public static void main(String[] args) {
        AbstractDog dog = new AbstractDog();
        dog.sound();

        AbstractCat cat = new AbstractCat();
        cat.sound();

        // 매개변수의 다형성
        animalSound(new AbstractDog());
        animalSound(new AbstractCat());
    }

    public static void animalSound(AbstractAnimal animal) {
        animal.sound();
    }
}
