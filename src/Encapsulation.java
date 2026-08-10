// ============================================
// ENCAPSULATION IN JAVA — Complete Guide
// Paste this in IntelliJ as: Encapsulation.java
// ============================================

//
//ATM Machine = Encapsulation ka best example!
//
// ❌ Tum seedha bank ka database access nahi kar sakte
//✅ Sirf ATM ke buttons (methods) se kaam kar sakte ho
//
//Buttons = getBalance(), withdraw(), deposit()
//Database = private data (tumhe seedha access nahi!)

public class Encapsulation {

    // ============ PRIVATE ATTRIBUTES ============
    // "private" matlab bahar se direct access BAND!
    private int id;
    private int age;
    private String name;
    private int nos; // number of subjects

    // ============ CONSTRUCTOR ============
    public Encapsulation(int id, int age, String name, int nos) {
        setId(id);
        setAge(age);
        setName(name);
        setNos(nos);
    }

    // ============ GETTERS ============
    public int getId()      { return id; }
    public int getAge()     { return age; }
    public String getName() { return name; }
    public int getNos()     { return nos; }

    // ============ SETTERS (WITH VALIDATION) ============
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("❌ Invalid ID: " + id + " (ID > 0 hona chahiye)");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("❌ Invalid Age: " + age + " (0-150 ke beech hona chahiye)");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("❌ Name empty ya null nahi ho sakta!");
        }
    }

    public void setNos(int nos) {
        if (nos >= 0) {
            this.nos = nos;
        } else {
            System.out.println("❌ Invalid NOS: " + nos + " (0 ya usse zyada hona chahiye)");
        }
    }

    // ============ DISPLAY METHOD ============
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

        // -----------------------------------------------
        // CASE 1: Valid values se object banana
        // -----------------------------------------------
        System.out.println("==============================");
        System.out.println("CASE 1: Valid Object");
        System.out.println("==============================");
        Encapsulation e1 = new Encapsulation(1, 20, "Ram", 5);
        e1.displayInfo();

        // -----------------------------------------------
        // CASE 2: Invalid values — setters rokenge!
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 2: Invalid Values");
        System.out.println("==============================");
        Encapsulation e2 = new Encapsulation(-1, -5, "", -3);
        e2.displayInfo();

        // -----------------------------------------------
        // CASE 3: Getter use karna
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 3: Getters");
        System.out.println("==============================");
        System.out.println("e1 ka Name : " + e1.getName());
        System.out.println("e1 ki Age  : " + e1.getAge());
        System.out.println("e1 ka ID   : " + e1.getId());

        // -----------------------------------------------
        // CASE 4: Setter se value update karna
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 4: Setters");
        System.out.println("==============================");
        e1.setName("Ram Kumar");  // ✅ valid
        e1.setAge(500);           // ❌ invalid — nahi badhega!
        e1.setAge(21);            // ✅ valid
        e1.displayInfo();

        // -----------------------------------------------
        // CASE 5: Direct access — UNCOMMENT karo RED ERROR!
        // -----------------------------------------------
        System.out.println("\n==============================");
        System.out.println("CASE 5: Direct Access = ERROR!");
        System.out.println("==============================");
        // e1.age = -5;   // ❌ UNCOMMENT → Compile Error!
        // e1.name = "";  // ❌ UNCOMMENT → Compile Error!
        // e1.id = -999;  // ❌ UNCOMMENT → Compile Error!
        System.out.println("Commented lines uncomment karo");
        System.out.println("aur dekho RED ERROR = Encapsulation working!");
    }
}