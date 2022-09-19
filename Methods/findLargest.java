// Create a Method Which Returns Largest Value among two,three and Four Numbers. Store That Method Inside Variable 
public class findLargest {

    public static int largest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int largest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int largest(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > c && b > d) {
            return b;
        } else if (c > d) {
            return c;
        } else {
            return d;
        }
    }

    public static void main(String[] args) {

        int a = largest(10, 20);
        System.out.println("Largest Number is : " + a);

        int b = largest(130, 155, 40);
        System.out.println("Largest Number is : " + b);

        int c = largest(100, 500, 200, 100);
        System.out.println("Largest Number is : " + c);

    }
}
/*
 * Output
 * Largest Number is : 20
 * Largest Number is : 155
 * Largest Number is : 500
 */