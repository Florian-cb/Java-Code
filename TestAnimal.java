/************************************************  * Florian Celibashi  * COP 2800 86397  * Week12FlorianCelibashi ************************************************/

public abstract class Animal {
   private String name;

   public String getName() {
       return this.name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public abstract void speak();
}

class Dog extends Animal {
   public Dog(String name) {
      this.setName(name);
   }

   @Override
   public void speak() {
      System.out.println("My spoiled dog " + this.getName() + " says woof.");
   }
}

class Cat extends Animal {
   public Cat(String name) {
      this.setName(name);
   }

   @Override
   public void speak() {
      System.out.println("My spoiled cat " + this.getName() + " says meow.");
   }
}

class Donkey extends Animal {
   public Donkey(String name) {
      this.setName(name);
   }

   @Override
   public void speak() {
      System.out.println("My spoiled donkey " + this.getName() + " says bree.");
   }
}

class Rooster extends Animal {
   public Rooster(String name) {
      this.setName(name);
   }

   @Override
   public void speak() {
      System.out.println("My spoiled rooster " + this.getName() + " says cockadoodledoo.");
   }
}

public class TestAnimal {
   public static void main(String[] args) {
       Dog myDog = new Dog("Fifi");
       myDog.speak();
   }
}
