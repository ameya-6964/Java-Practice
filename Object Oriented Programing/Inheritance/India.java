// Achive Inheritance 
class Dhirubhai {
    String Company = "Reliance Industry"; // States

    public void thinkingStyle() {
        System.out.println("Dhirubhai's Unique Thinking Style"); // Behaviours
    }

}

class Mukesh extends Dhirubhai { // Inheritance

}

// Driver Class
public class India {

    public static void main(String[] args) {
        Mukesh ref = new Mukesh();
        System.out.println("Company " + ref.Company);
        ref.thinkingStyle();
    }
}
