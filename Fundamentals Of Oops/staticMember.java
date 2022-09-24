// Write a Program To Check whether You Can Access Static Variable After Creation Of Objects 

public class staticMember {
    static int i = 10; // Static Variable
    static boolean j = false;

    public static void main(String[] args) {
        object ref1 = new object(); // Creation Of Object
        System.out.println("Address Of ref1 : " + ref1); // Printing Reference Address
        System.out.println("Directly i : " + i); // Accessing Static Variables
        System.out.println("Directly j : " + j); // Accessing Static Variables
        System.out.println("Via Class Name i : " + staticMember.i); // Accessing Static Variables
        System.out.println("Via Class Name j: " + staticMember.j); // Accessing Static Variables
        System.out.println("Via Object i : " + ref1.i); // Accessing Static Variables
        System.out.println("Via Object j: " + ref1.j); // Accessing Static Variables

    }
}

/*
 * Output
 * Address Of ref1 : object@3fee733d
 * Directly i : 10
 * Directly j : false
 * Via Class Name i : 10
 * Via Class Name j: false
 * Via Object i : 10
 * Via Object j: false
 */
