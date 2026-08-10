// ================================================
// COMPLETE OOP IN JAVA — Classes, Objects, Constructors
// ================================================

    public class Student {

        // ============ ATTRIBUTES ============
        public int id;
        public int age;
        public String name;
        public int nos; // number of subjects

        // ============ DEFAULT CONSTRUCTOR ============
        //Object ko banane wala
        // Jab koi value pass na karo
        public Student() {
            System.out.println("Default Constructor Called!");
            this.id   = 0;
            this.age  = 0;
            this.name = "Unknown";
            this.nos  = 0;
        }

        // ============ PARAMETERISED CONSTRUCTOR ============
        // Jab values pass karo
        public Student(int id, int age, String name, int nos) {
            System.out.println("Parameterised Constructor Called!");
            this.id   = id;
            this.age  = age;
            this.name = name;
            this.nos  = nos;
        }

        // ============ METHODS / BEHAVIOURS ============
        public void study() {
            System.out.println(name + " is Studying!");
        }

        public void sleep() {
            System.out.println(name + " is Sleeping!");
        }

        public void displayInfo() {
            System.out.println("--------------------");
            System.out.println("ID   : " + id);
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
            System.out.println("NOS  : " + nos);
            System.out.println("--------------------");
        }

        // ============ MAIN METHOD ============
        public static void main(String[] args) {

            // ---- Default Constructor se object banana ----
            System.out.println("\n== Default Constructor ==");
            Student s1 = new Student();
            s1.displayInfo();

            // ---- Parameterised Constructor se object banana ----
            System.out.println("\n== Parameterised Constructor ==");
            Student s2 = new Student(1, 20, "Ram", 5);
            s2.displayInfo();

            Student s3 = new Student(2, 21, "Shyam", 6);
            s3.displayInfo();

            // ---- Methods call karna ----
            System.out.println("\n== Methods ==");
            s2.study();
            s2.sleep();
            s3.study();

            // ---- Attributes directly access karna ----
            System.out.println("\n== Direct Access ==");
            System.out.println("s2 ka naam: " + s2.name);
            System.out.println("s3 ki age : " + s3.age);

            // ---- Attribute change karna ----
            System.out.println("\n== Attribute Change ==");
            s2.name = "Ram Kumar";  // naam badal diya!
            System.out.println("Naya naam: " + s2.name);
        }
    }

