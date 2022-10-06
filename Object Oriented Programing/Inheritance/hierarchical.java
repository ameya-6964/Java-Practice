// Hierarchical Inheritance 

class dhirubhaiAmbani {
    int money = 850000;

    public void thinking() {
        System.out.println("Dhirubhai Thinking");
    }

}

class mukeshAmbani extends dhirubhaiAmbani {

}

class anilAmbani extends dhirubhaiAmbani {

}

public class hierarchical {
    public static void main(String[] args) {
        mukeshAmbani ref1 = new mukeshAmbani();
        System.out.println("Mukesh " + ref1.money);
        ref1.thinking();

        anilAmbani ref2 = new anilAmbani();
        System.out.println("Anil " + ref2.money);
        ref2.thinking();

    }
}

/*
 * Output
 * Mukesh 850000
 * Dhirubhai Thinking
 * Anil 850000
 * Dhirubhai Thinking
 */
