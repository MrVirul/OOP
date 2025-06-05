package Kuppi_Abstract;

public class Dog extends Animal{
    @Override
    public String eat() {
        return "Dog is eating";
    }

    @Override
    public String makeSound() {
        return "Dog is barking";
    }
}
