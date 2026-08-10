// ============================================
// POLYMORPHISM IN JAVA — Complete Guide
// Paste this in IntelliJ as: Polymorphism.java
// ============================================
//polymorphism kya hai?
//
//Poly = Many, Morphism = Forms
//
//Ek cheez — kai tarike se kaam kare!
//
//
//Real Life Example 🎭
//Ek insaan — kai roles!
//
//Ram → Ghar mein = BAAP
//Ram → Office mein = MANAGER
//Ram → Cricket mein = PLAYER
//
//Same insaan — alag alag behaviour!
//Polymorphism
//├── 1. Compile Time (Static)
//│         └── Method Overloading
//│
//        └── 2. Runtime (Dynamic)
//          └── Method Overriding
//Type 1 — Method Overloading 📦
//
//Same method name — alag parameters!
//
//Compile time pe decide hota hai — kaunsa method chalega!
//
//java// Same naam — alag parameters!
//void add(int a, int b)             // 2 integers
//void add(int a, int b, int c)      // 3 integers
//void add(double a, double b)       // 2 doubles
//void add(String a, String b)       // 2 strings
//Type 2 — Method Overriding 🔄
//
//Parent ka method — Child apne hisaab se badal de!
//
//Runtime pe decide hota hai — kaunsa method chalega!
//
//javaclass Animal {
//void sound() {
//    System.out.println("Animal makes sound");
//}
//}
//
//class Dog extends Animal {
//    @Override
//    void sound() {                          // Same naam, same parameters
//        System.out.println("Dog barks!");   // Alag behaviour!
//    }
//}

// ============ PARENT CLASS ============
class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
        System.out.println("✅ Shape Constructor Called!");
    }

    // Ye method child classes override karengi!
    public void area() {
        System.out.println("Shape ki area calculate ho rahi hai!");
    }

    public void display() {
        System.out.println("Color : " + color);
    }
}

// ============ CHILD CLASS 1 ============
class Circle extends Shape {

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        System.out.println("✅ Circle Constructor Called!");
    }

    // ✅ METHOD OVERRIDING — Parent ka area() apne hisaab se badla!
    @Override
    public void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Circle ki Area : " + a);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Radius : " + radius);
        System.out.println("--------------------");
    }
}

// ============ CHILD CLASS 2 ============
class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width  = width;
        System.out.println("✅ Rectangle Constructor Called!");
    }

    // ✅ METHOD OVERRIDING — Parent ka area() apne hisaab se badla!
    @Override
    public void area() {
        double a = length * width;
        System.out.println("Rectangle ki Area : " + a);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("--------------------");
    }
}

// ============ CHILD CLASS 3 ============
class Triangle extends Shape {

    double base;
    double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base   = base;
        this.height = height;
        System.out.println("✅ Triangle Constructor Called!");
    }

    // ✅ METHOD OVERRIDING — Parent ka area() apne hisaab se badla!
    @Override
    public void area() {
        double a = 0.5 * base * height;
        System.out.println("Triangle ki Area : " + a);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Base   : " + base);
        System.out.println("Height : " + height);
        System.out.println("--------------------");
    }
}

// ============ MAIN CLASS ============
public class Polymorphism {

    // ============ METHOD OVERLOADING ============
    // Same naam "add" — alag alag parameters!
    // Compile time pe decide hota hai kaunsa chalega!

    static int add(int a, int b) {
        System.out.println("2 integers add ho rahe hain!");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("3 integers add ho rahe hain!");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.println("2 doubles add ho rahe hain!");
        return a + b;
    }

    static String add(String a, String b) {
        System.out.println("2 Strings add ho rahe hain!");
        return a + b;
    }

    // ============ MAIN METHOD ============
    public static void main(String[] args) {

        // -----------------------------------------------
        // CASE 1: Method Overloading (Compile Time)
        // -----------------------------------------------
        System.out.println("==============================");
        System.out.println("CASE 1: Method Overloading");
        System.out.println("==============================");

        // Same naam "add" — Java parameters dekh ke decide karta hai!
        System.out.println(add(5, 10));           // int + int
        System.out.println(add(5, 10, 15));       // int + int + int
        System.out.println(add(5.5, 10.5));       // double + double
        System.out.println(add("Ram", "Shyam"));  // String + String

        // -----------------------------------------------
        // CASE 2: Method Overriding (Runtime)
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 2: Method Overriding");
        System.out.println("==============================");

        Circle c1    = new Circle("Red", 5.0);
        Rectangle r1 = new Rectangle("Blue", 4.0, 6.0);
        Triangle t1  = new Triangle("Green", 3.0, 8.0);

        // Same method naam "area()" — alag alag result!
        System.out.println();
        c1.area();   // Circle ka area()
        r1.area();   // Rectangle ka area()
        t1.area();   // Triangle ka area()

        // -----------------------------------------------
        // CASE 3: Runtime Polymorphism
        // Parent reference — Child object!
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 3: Runtime Polymorphism");
        System.out.println("Parent Reference = Child Object!");
        System.out.println("==============================");

        // Shape reference mein Circle object!
        Shape s1 = new Circle("Yellow", 7.0);
        Shape s2 = new Rectangle("Pink", 5.0, 3.0);
        Shape s3 = new Triangle("Purple", 6.0, 4.0);

        // Runtime pe decide hoga — kaunsa area() chalega!
        System.out.println();
        s1.area();   // ← Circle ka area() chalega! (Shape ka nahi!)
        s2.area();   // ← Rectangle ka area() chalega!
        s3.area();   // ← Triangle ka area() chalega!

        // -----------------------------------------------
        // CASE 4: Array of Shapes — Power of Polymorphism!
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 4: Array of Shapes");
        System.out.println("==============================");

        // Ek array mein sab shapes!
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5.0);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Triangle("Green", 3.0, 8.0);

        // Ek loop mein sab ka area!
        System.out.println();
        for (Shape shape : shapes) {
            shape.area();   // ← Runtime pe decide hoga!
        }

        // -----------------------------------------------
        // CASE 5: Display Info
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 5: Display Info");
        System.out.println("==============================");
        System.out.println();
        c1.display();
        r1.display();
        t1.display();
    }
}