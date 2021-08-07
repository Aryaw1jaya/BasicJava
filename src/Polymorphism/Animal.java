package Polymorphism;

    public class Animal {
      public void animalSound() {
        System.out.println("The animal makes a sound");
      }
    }

    class Pig extends Animal {
      public void animalSound() {
        System.out.println("The pig says: wee wee");
      }
    }

    class Dog extends Animal {
      public void animalSound() {
        System.out.println("The dog says: bow wow");
      }
    }

    class Main { //Main Class
      public static void main(String[] args) { //Main Method
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
      }
    }
