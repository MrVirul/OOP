package Kuppi_Abstract;

public class Cat extends Animal{
    @Override
    public String eat() {
        return "Cat is eating";
    }

    @Override
    public String makeSound() {
        return "Cat is laughing";
    }
}
