// Write a Method To Print Numbers 1-10 Without Using Loops 
public class printWithoutLoops {
    public static void recursiveMethod(int a) // Called Method
    {
        if (a <= 10) // Defining Condition
        {
            System.out.println("Number is : " + a);
            recursiveMethod(a + 1);
        }
    }

    public static void main(String[] args) // Calling Method
    {
        recursiveMethod(0); // MCS
    }
}
/*
 * Output
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 */
