// Base class Fruit
class Fruit {
    String name;
    String taste;
    String size;

    public void eat() {
        System.out.println("Name: " + name + ", Taste: " + taste + ", Size: " + size);
    }
}

// Derived class Apple
class Apple extends Fruit {
    public Apple() {
        this.name = "Apple";
        this.taste = "Sweet";
        this.size = "Medium";
    }

    @Override
    public void eat() {
        System.out.println("Eating an Apple. It is " + taste + " and " + size + "-sized.");
    }
}

// Derived class Orange
class Orange extends Fruit {
    public Orange() {
        this.name = "Orange";
        this.taste = "Citrusy";
        this.size = "Small";
    }

    @Override
    public void eat() {
        System.out.println("Eating an Orange. It is " + taste + " and " + size + "-sized.");
    }
}

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        apple.eat();
        orange.eat();
    }
}
