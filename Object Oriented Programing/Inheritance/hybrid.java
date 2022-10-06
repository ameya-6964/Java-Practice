//hybrid Inheritance

class GrandFather // Super class
{
    public void printGrandFather() {
        System.out.println("GrandFather's class");
    }
}

class Father extends GrandFather // Subclass Of Grandfather But Super Class Of Son And Daughter
{
    public void printFather() {
        System.out.println("Father class has inherited GrandFather class");
    }
}

class Son extends Father // Sub Class Of Father Class
{
    public Son() {
        System.out.println("Inside the Son Class");
    }

    public void printSon() {
        System.out.println("Son class has inherited Father class");
    }
}

class Daughter extends Father // Subclass Of Father Class
{
    public Daughter() {
        System.out.println("Inside the Daughter Class");
    }

    public void printDaughter() {
        System.out.println("Son class has inherited Father class");
    }
}

public class hybrid // Driver Class
{
    public static void main(String[] args) {
        Son obj = new Son();
        obj.printSon(); // Accessing Son class method
        obj.printFather(); // Accessing Father class method
        obj.printGrandFather(); // Accessing GrandFather class method

        Daughter obj2 = new Daughter();
        obj2.printDaughter(); // Accessing Daughter class method
        obj2.printFather(); // Accessing Father class method
        obj2.printGrandFather(); // Accessing GrandFather class method

    }
}

/*
 * Output
 * nside the Son Class
 * Son class has inherited Father class
 * Father class has inherited GrandFather class
 * GrandFather's class
 * Inside the Daughter Class
 * Son class has inherited Father class
 * Father class has inherited GrandFather class
 * GrandFather's class
 */