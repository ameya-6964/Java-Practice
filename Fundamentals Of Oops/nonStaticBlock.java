// Create a Class Consisting Of Non Static Block and Execute It in Static Context

public class nonStaticBlock {
    {
        System.out.println("Hello Non Static Block Created for : " + this);
    }

    public static void main(String[] args) {
        nonStaticBlock ref1 = new nonStaticBlock(); // Invoked the Constructor for ref1
        nonStaticBlock ref2 = new nonStaticBlock(); // Invoked the Constructor for ref2
        nonStaticBlock ref3 = new nonStaticBlock(); // Invoked the Constructor for ref3
        nonStaticBlock ref4 = new nonStaticBlock(); // Invoked the Constructor for ref4
    }
}

/*
 * OUTPUT
 * Hello Non Static Block Created for : nonStaticBlock@2c7b84de
 * Hello Non Static Block Created for : nonStaticBlock@3fee733d
 * Hello Non Static Block Created for : nonStaticBlock@5acf9800
 * Hello Non Static Block Created for : nonStaticBlock@4617c264
 */