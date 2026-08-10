// ============================================
// INHERITANCE IN JAVA — Complete Guide
// Paste this in IntelliJ as: Inheritance.java
// ============================================

// ============ PARENT CLASS (Super Class) ============
// Sabse upar wali class — sab isse inherit karenge!
//Inheritance = Ek class doosri class ki properties aur methods le leti hai!
//Jaise bacha apne maa-baap se qualities inherit karta hai!


class Animal {

    // Attributes
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
        System.out.println("✅ Animal Constructor Called!");
    }

    // Methods
    public void eat() {
        System.out.println(name + " is Eating!");
    }

    public void sleep() {
        System.out.println(name + " is Sleeping!");
    }

    public void displayInfo() {
        System.out.println("--------------------");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("--------------------");
    }
}

// ============ CHILD CLASS 1 — Single Inheritance ============
// Dog → Animal se sab kuch inherit kiya!
// "extends" keyword use hota hai!
class Dog extends Animal {

    // Dog ki apni extra property
    String breed;

    // Dog ka Constructor
    // "super()" se parent ka constructor call karte hain!
    public Dog(String name, int age, String breed) {
        super(name, age);   // ← Animal ka constructor call hoga!
        this.breed = breed;
        System.out.println("✅ Dog Constructor Called!");
    }

    // Dog ka apna extra method
    public void bark() {
        System.out.println(name + " is Barking! Woof Woof! 🐕");
    }

    // Dog ka apna displayInfo (Parent wala override kiya!)
    @Override
    public void displayInfo() {
        super.displayInfo();  // ← pehle parent ka displayInfo chalao
        System.out.println("Breed: " + breed);
        System.out.println("--------------------");
    }
}

// ============ CHILD CLASS 2 — Single Inheritance ============
// Cat → Animal se sab kuch inherit kiya!
class Cat extends Animal {

    String color;

    public Cat(String name, int age, String color) {
        super(name, age);   // ← Animal ka constructor call hoga!
        this.color = color;
        System.out.println("✅ Cat Constructor Called!");
    }

    public void meow() {
        System.out.println(name + " is Meowing! Meow! 🐈");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
        System.out.println("--------------------");
    }
}

// ============ MULTILEVEL INHERITANCE ============
// GuideDog → Dog → Animal
// 3 levels ki chain!
class GuideDog extends Dog {

    String owner;

    public GuideDog(String name, int age, String breed, String owner) {
        super(name, age, breed);  // ← Dog ka constructor call hoga!
        this.owner = owner;
        System.out.println("✅ GuideDog Constructor Called!");
    }

    public void guide() {
        System.out.println(name + " is Guiding " + owner + "! 🦮");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // ← Dog ka displayInfo chalao
        System.out.println("Owner: " + owner);
        System.out.println("--------------------");
    }
}

// ============ MAIN CLASS ============
public class Inheritance {

    public static void main(String[] args) {

        // -----------------------------------------------
        // CASE 1: Single Inheritance — Dog
        // -----------------------------------------------
        System.out.println("==============================");
        System.out.println("CASE 1: Dog (extends Animal)");
        System.out.println("==============================");
        Dog d1 = new Dog("Bruno", 3, "Labrador");
        // Dog ke paas Animal ke methods bhi hain!
        d1.eat();          // ← Animal se mila!
        d1.sleep();        // ← Animal se mila!
        d1.bark();         // ← Dog ka apna!
        d1.displayInfo();  // ← Override kiya!

        // -----------------------------------------------
        // CASE 2: Single Inheritance — Cat
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 2: Cat (extends Animal)");
        System.out.println("==============================");
        Cat c1 = new Cat("Whiskers", 2, "White");
        c1.eat();          // ← Animal se mila!
        c1.sleep();        // ← Animal se mila!
        c1.meow();         // ← Cat ka apna!
        c1.displayInfo();  // ← Override kiya!

        // -----------------------------------------------
        // CASE 3: Multilevel Inheritance — GuideDog
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 3: GuideDog (extends Dog extends Animal)");
        System.out.println("==============================");
        GuideDog g1 = new GuideDog("Max", 4, "German Shepherd", "Ram");
        g1.eat();          // ← Animal se mila! (2 levels upar)
        g1.bark();         // ← Dog se mila! (1 level upar)
        g1.guide();        // ← GuideDog ka apna!
        g1.displayInfo();

        // -----------------------------------------------
        // CASE 4: super keyword
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 4: super keyword");
        System.out.println("==============================");
        // super = parent class ko refer karta hai
        // super(args) = parent constructor call
        // super.method() = parent method call
        System.out.println("super keyword 2 kaam karta hai:");
        System.out.println("1. super(name, age) → parent constructor call");
        System.out.println("2. super.displayInfo() → parent method call");

        // -----------------------------------------------
        // CASE 5: instanceof check
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 5: instanceof");
        System.out.println("==============================");
        System.out.println("g1 instanceof Dog?    " + (g1 instanceof Dog));
        System.out.println("g1 instanceof Animal? " + (g1 instanceof Animal));
    }
}