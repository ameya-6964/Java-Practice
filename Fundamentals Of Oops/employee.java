/* Achive employee Chaining */

// What is Constructor ? Create a Class Consisting Of employee and Achive Constructor Chaining

public class employee {
    int age; // Non Static variables
    String name; // Non Static variables
    double salary; // Non Static variables

    employee() // Name Of Constructor Is Same As Name Of Class , It is Used To Store/load all
               // Non Static Members Inside Object
    {
        System.out.println("NO Formal Argument employee");
    }

    employee(int age) {
        this(); // Chaining Statement
        this.age = age; // this is referance Variable It is Used To Assign Value Of Local VAriable To
                        // Global Variable
        System.out.println("One Formal Argument employee");
    }

    employee(int age, String name) {
        this(age);
        this.name = name;
        System.out.println("Two Formal Argument employee");
    }

    employee(int age, String name, double salary) {
        this(age, name);
        this.salary = salary;
        System.out.println("Three Formal Argument employee");
    }

    public static void main(String[] args) {
        employee Ameya = new employee();
        System.out.println(Ameya.age);
        System.out.println(Ameya.name);
        System.out.println(Ameya.salary);
        System.out.println("=====================");
        employee Jayesh = new employee(20);
        System.out.println(Jayesh.age);
        System.out.println(Jayesh.name);
        System.out.println(Jayesh.salary);
        System.out.println("=====================");
        employee Deepak = new employee(25, "Deepak");
        System.out.println(Deepak.age);
        System.out.println(Deepak.name);
        System.out.println(Deepak.salary);
        System.out.println("=====================");
        employee Suraj = new employee(20, "Suraj", 45000);
        System.out.println(Suraj.age);
        System.out.println(Suraj.name);
        System.out.println(Suraj.salary);
        System.out.println("=====================");
    }
}

/*
 * OUTPUT
 * NO Formal Argument employee
 * 0
 * null
 * 0.0
 * =====================
 * NO Formal Argument employee
 * One Formal Argument employee
 * 20
 * null
 * 0.0
 * =====================
 * NO Formal Argument employee
 * One Formal Argument employee
 * Two Formal Argument employee
 * 25
 * Deepak
 * 0.0
 * =====================
 * NO Formal Argument employee
 * One Formal Argument employee
 * Two Formal Argument employee
 * Three Formal Argument employee
 * 20
 * Suraj
 * 45000.0
 * =====================
 */
