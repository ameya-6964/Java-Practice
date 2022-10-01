// Create a class Consisting Of driverClass and emp with Id name and Salary achive Datahiding For Salary State 
class emp {
    int id;
    String name;
    private double salary;

    public double getSalary() { // Getter Method
        return salary;
    }

    public void setSalary(double salary) { // Setter Method
        this.salary = salary;
    }

    emp(int id, String name, double salary) { // Parameterised Constructor to Initiliase Global Variables
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

public class empDriver {
    public static void main(String[] args) {
        emp e1 = new emp(101, "Ameya", 1200.00);
        emp e2 = new emp(102, "Jayesh", 4000.00);
        e1.setSalary(45000.0);
        e2.setSalary(50000.00);
        System.out.println("id : " + e1.id);
        System.out.println("name : " + e1.name);
        System.out.println("salary : " + e1.getSalary());

        System.out.println("**************************");

        System.out.println("id : " + e2.id);
        System.out.println("name : " + e2.name);
        System.out.println("salary : " + e2.getSalary());
    }
}
