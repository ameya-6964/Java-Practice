// Write a Programme To Execute Statement Before Main Method

public class staticblock {

    static {
        System.out.println("Welcome To Instagram");
    }

    public static void main(String[] args) {

        System.out.println("Enter Username");
        System.out.println("Enter Password");

    }

    static {
        System.out.println("From Meta");
    }
}

/*
 * OUTPUT
 * Welcome To Instagram
 * From Meta
 * Enter Username
 * Enter Password
 */
