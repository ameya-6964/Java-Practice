// Example Of Single Level Inheritance

class p3 {
    int i;

    public void thinking() {
        System.out.println(" Thinking from Super Class");
    }
}

class p4 extends p3 {

}

public class singleLevel {
    public static void main(String[] args) {
        p3 ref = new p3();
        System.out.println(ref.i);
        ref.thinking();

    }
}

/*
 * Output
 * 0
 * Thinking from Super Class
 */