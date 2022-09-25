// Write a Java Program To Find Sum of 0-20 Even Numbers
public class sumOfEvenNumbers {
    public static void main(String[] args) {
        int a = 20; // Range
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
// Output = 110;