// What is Constructor ? Create a Class Consisting Of Constructor

public class constructor {
    int age; // Non Static variables
    String name; // Non Static variables
    double salary; // Non Static variables

    constructor() // Name Of Constructor Is Same As Name Of Class , It is Used To Store/load all
                  // Non Static Members Inside Object
    {
        System.out.println("NO Formal Argument Constructor");
    }

    constructor(int age) {
        this.age = age; // this is referance Variable It is Used To Assign Value Of Local VAriable To
                        // Global Variable
        System.out.println("One Formal Argument Constructor");
    }

    constructor(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Two Formal Argument Constructor");
    }

    constructor(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        System.out.println("Three Formal Argument Constructor");
    }

    public static void main(String[] args) {
        constructor Ameya = new constructor();
        System.out.println(Ameya.age);
        System.out.println(Ameya.name);
        System.out.println(Ameya.salary);
        System.out.println("=====================");
        constructor Jayesh = new constructor(20);
        System.out.println(Jayesh.age);
        System.out.println(Jayesh.name);
        System.out.println(Jayesh.salary);
        System.out.println("=====================");
        constructor Deepak = new constructor(25, "Deepak");
        System.out.println(Deepak.age);
        System.out.println(Deepak.name);
        System.out.println(Deepak.salary);
        System.out.println("=====================");
        constructor Suraj = new constructor(20, "Suraj", 45000);
        System.out.println(Suraj.age);
        System.out.println(Suraj.name);
        System.out.println(Suraj.salary);
        System.out.println("=====================");
    }
}

/*
 * OUTPUT
 * NO Formal Argument Constructor
 * 0
 * null
 * 0.0
 * =====================
 * One Formal Argument Constructor
 * 20
 * null
 * 0.0
 * =====================
 * Two Formal Argument Constructor
 * 25
 * Deepak
 * 0.0
 * =====================
 * Three Formal Argument Constructor
 * 20
 * Suraj
 * 45000.0
 * =====================
 */
