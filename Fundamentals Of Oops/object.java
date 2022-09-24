// Write a Program To Access Non Static Variable Inside Main Method  

public class object {

    int i = 10; // Non Static Variable
    boolean j = false;

    public static void main(String[] args) {
        object ref1 = new object(); // Creation Of Object
        object ref2 = new object();
        System.out.println("Address Of ref1 : " + ref1); // Printing Reference Address
        System.out.println("Address Of ref2 : " + ref2);
        System.out.println("Value Of i  : " + ref1.i); // Accessing Non Static Variables
        System.out.println("Value Of j : " + ref2.j);
    }
}

/*
 * Output
 * Address Of ref1 : object@2c7b84de
 * Address Of ref2 : object@3fee733d
 * Value Of i : 10
 * Value Of j : false
 */
