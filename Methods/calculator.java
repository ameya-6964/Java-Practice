// Create a Calculator with Java Methods which Returns Thr Result and Store it in Variable
public class calculator {
    public static int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public static int add(int a, int b, int c) {
        int res = a + b + c;
        return res;
    }

    public static int add(int a, int b, int c, int d) {
        int res = a + b + c + d;
        return res;
    }

    public static int add(int a, int b, int c, int d, int e) {
        int res = a + b + c + d + e;
        return res;
    }

    public static int add(int a, int b, int c, int d, int e, int f) {
        int res = a + b + c + d + e + f;
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Main Method Begins");
        int a = add(10, 20);
        System.out.println("Sum Of Two Numbers is : " + a);
        int b = add(10, 20, 30);
        System.out.println("Sum Of Three Numbers is : " + b);
        int c = add(10, 20, 30, 40);
        System.out.println("Sum Of Four Numbers is : " + c);
        int d = add(10, 20, 30, 40, 50);
        System.out.println("Sum Of Five Numbers is : " + d);
        int e = add(10, 20, 30, 40, 50, 60);
        System.out.println("Sum Of  Numbers is : " + e);
        System.out.println("Main Method ends");

    }

}
// output
// Main Method Begins
// Sum Of Two Numbers is : 30
// Sum Of Three Numbers is : 60
// Sum Of Four Numbers is : 100
// Sum Of Five Numbers is : 150
// Sum Of Numbers is : 210
// Main Method ends
