// ============================================
// ABSTRACTION IN JAVA — Complete Guide
// Paste this in IntelliJ as: Abstraction.java
// ============================================

// ============ ABSTRACT CLASS ============
// Abstract class ka object NAHI ban sakta!
// Incomplete class hai — child complete karegi!
abstract class Vehicle {

    // Normal attributes
    String name;
    int speed;

    // Normal Constructor
    public Vehicle(String name, int speed) {
        this.name  = name;
        this.speed = speed;
        System.out.println("✅ Vehicle Constructor Called!");
    }

    // Normal Method — body hai ✅
    public void display() {
        System.out.println("--------------------");
        System.out.println("Name  : " + name);
        System.out.println("Speed : " + speed);
        System.out.println("--------------------");
    }

    // Abstract Methods — body NAHI hai! ❌
    // Child class KO implement KARNA PADEGA!
    public abstract void start();
    public abstract void stop();
    public abstract void fuelType();
}

// ============ INTERFACE 1 ============
// 100% abstraction — saare methods abstract!
interface Flyable {
    // By default — public abstract!
    void fly();
    void land();
}

// ============ INTERFACE 2 ============
interface Electric {
    void charge();
    void batteryStatus();
}

// ============ CHILD CLASS 1 ============
// Abstract class extend ki + Interface implement ki!
class Car extends Vehicle {

    String brand;

    public Car(String name, int speed, String brand) {
        super(name, speed);
        this.brand = brand;
        System.out.println("✅ Car Constructor Called!");
    }

    // ✅ Abstract methods implement karne PADENGE!
    @Override
    public void start() {
        System.out.println(name + " Car start ho gayi! Vroom Vroom! 🚗");
    }

    @Override
    public void stop() {
        System.out.println(name + " Car ruk gayi! 🛑");
    }

    @Override
    public void fuelType() {
        System.out.println(name + " ka fuel : Petrol ⛽");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Brand : " + brand);
        System.out.println("--------------------");
    }
}

// ============ CHILD CLASS 2 ============
// Abstract class extend ki + Multiple Interfaces implement ki!
class FlyingCar extends Vehicle implements Flyable, Electric {

    String brand;

    public FlyingCar(String name, int speed, String brand) {
        super(name, speed);
        this.brand = brand;
        System.out.println("✅ FlyingCar Constructor Called!");
    }

    // ✅ Vehicle ke abstract methods
    @Override
    public void start() {
        System.out.println(name + " FlyingCar start ho gayi! 🚀");
    }

    @Override
    public void stop() {
        System.out.println(name + " FlyingCar ruk gayi! 🛑");
    }

    @Override
    public void fuelType() {
        System.out.println(name + " ka fuel : Electric ⚡");
    }

    // ✅ Flyable interface ke methods
    @Override
    public void fly() {
        System.out.println(name + " udd rahi hai! ✈️");
    }

    @Override
    public void land() {
        System.out.println(name + " land kar rahi hai! 🛬");
    }

    // ✅ Electric interface ke methods
    @Override
    public void charge() {
        System.out.println(name + " charge ho rahi hai! 🔋");
    }

    @Override
    public void batteryStatus() {
        System.out.println(name + " ki battery : 85% ✅");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Brand : " + brand);
        System.out.println("Type  : Flying + Electric!");
        System.out.println("--------------------");
    }
}

// ============ CHILD CLASS 3 ============
class Bike extends Vehicle {

    String type;

    public Bike(String name, int speed, String type) {
        super(name, speed);
        this.type = type;
        System.out.println("✅ Bike Constructor Called!");
    }

    @Override
    public void start() {
        System.out.println(name + " Bike start ho gayi! 🏍️");
    }

    @Override
    public void stop() {
        System.out.println(name + " Bike ruk gayi! 🛑");
    }

    @Override
    public void fuelType() {
        System.out.println(name + " ka fuel : Diesel 🛢️");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type  : " + type);
        System.out.println("--------------------");
    }
}

// ============ MAIN CLASS ============
public class Abstraction {

    public static void main(String[] args) {

        // -----------------------------------------------
        // CASE 1: Abstract class ka object NAHI ban sakta!
        // -----------------------------------------------
        System.out.println("==============================");
        System.out.println("CASE 1: Abstract Class");
        System.out.println("==============================");

        // Vehicle v = new Vehicle("Car", 100);
        // ❌ UNCOMMENT KARO → ERROR aayega!
        // "Vehicle is abstract; cannot be instantiated"
        System.out.println("Vehicle v = new Vehicle() → ❌ ERROR!");
        System.out.println("Abstract class ka object NAHI ban sakta!");

        // -----------------------------------------------
        // CASE 2: Child class ka object ban sakta hai!
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 2: Car Object");
        System.out.println("==============================");
        Car c1 = new Car("Toyota", 180, "Toyota Motors");
        c1.start();
        c1.stop();
        c1.fuelType();
        c1.display();

        // -----------------------------------------------
        // CASE 3: Multiple Interface implement karna
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 3: FlyingCar — Multiple Interfaces");
        System.out.println("==============================");
        FlyingCar fc1 = new FlyingCar("AeroCar", 300, "FutureTech");
        fc1.start();
        fc1.fly();          // Flyable interface
        fc1.land();         // Flyable interface
        fc1.charge();       // Electric interface
        fc1.batteryStatus();// Electric interface
        fc1.stop();
        fc1.display();

        // -----------------------------------------------
        // CASE 4: Parent reference = Child object
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 4: Parent Reference");
        System.out.println("==============================");
        Vehicle v1 = new Car("Honda", 150, "Honda Motors");
        Vehicle v2 = new Bike("Yamaha", 120, "Sports");

        // Runtime pe decide hoga kaunsa method chalega!
        v1.start();    // Car ka start()!
        v2.start();    // Bike ka start()!

        // -----------------------------------------------
        // CASE 5: Array of Vehicles — Power of Abstraction!
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 5: Array of Vehicles");
        System.out.println("==============================");

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Maruti", 140, "Maruti Suzuki");
        vehicles[1] = new Bike("Royal Enfield", 130, "Cruiser");
        vehicles[2] = new FlyingCar("SkyRide", 400, "SkyTech");

        System.out.println();
        for (Vehicle v : vehicles) {
            v.start();      // Runtime pe decide!
            v.fuelType();   // Runtime pe decide!
            System.out.println();
        }
    }
}