// Create a Class Consisting Of Global Variables As Well As Local Variables
class localVariables {
    static int a; // we can Declare Global Variables Without Initilisation (default Values = 0) //
                  // Global Variable
    static boolean b; // we can Declare Global Variables Without Initilisation (default Values =
                      // False) // Global Variable

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); // 10 High Priority Given To Local Variable // Local Variable
        System.out.println(localVariables.a);
        System.out.println(b); // False
    }
}
/*
 * Output
 * 10
 * 0
 * false
 */