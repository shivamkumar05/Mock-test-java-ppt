// Animal superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Dog subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Cat subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

// Cow subclass
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow mooes");
    }
}

// Main class to test the Animal subclasses
public class Q1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: The animal makes a sound

        Animal dog = new Dog();
        dog.makeSound(); // Output: The dog barks

        Animal cat = new Cat();
        cat.makeSound(); // Output: The cat meows

        Animal cow = new Cow();
        cow.makeSound(); // Output: The cow mooes
    }
}
