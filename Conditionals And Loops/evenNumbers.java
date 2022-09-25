//Write a Java Program To Find Even Numbers Between 0-20

public class evenNumbers {
    public static void main(String[] args) {
        int a = 20; // Range
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number are: " + i);
            }
        }
    }
}
/*
 * OUTPUT
 * Even Number are: 0
 * Even Number are: 2
 * Even Number are: 4
 * Even Number are: 6
 * Even Number are: 8
 * Even Number are: 10
 * Even Number are: 12
 * Even Number are: 14
 * Even Number are: 16
 * Even Number are: 18
 * Even Number are: 20
 */