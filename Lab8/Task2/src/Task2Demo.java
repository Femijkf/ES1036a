public class Task2Demo {
    public static void main(String[] args) {
        // creating 3 objects of type animal with instances of Cat, Dog andDuck
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();

        System.out.println("Cat says:\n" + cat.say());
        System.out.println("\nDog says: \n" + dog.say());
        System.out.println("\nDuck says:\n" + duck.say());
    }
}
