// Write a Java Program To Access Non Static Variable of Parent Class into Driver Class

class p1 {
    int i = 25;
    {
        System.out.println("IIB From Super Class");
    }
}

class p2 extends p1 {

    {
        System.out.println("IIB From Sub Class`");
    }

}

public class driver {
    public static void main(String[] args) {
        p2 ref = new p2();
        System.out.println(ref.i);
    }
}

/*
 * OUTPUT
 * IIB From Super Class
 * IIB From Sub Class`
 * 25
 */