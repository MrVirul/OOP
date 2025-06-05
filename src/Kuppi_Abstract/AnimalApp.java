package Kuppi_Abstract;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal dog1 = new Dog();

        System.out.println();
        System.out.println(cat1.eat());
        System.out.println(cat1.makeSound());

        System.out.println();
        System.out.println(dog1.eat());
        System.out.println(dog1.makeSound());
    }
}
