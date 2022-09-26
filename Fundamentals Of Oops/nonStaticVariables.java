// Create A Class Consisting Of Non Static Variables And Print them In Main Method
public class nonStaticVariables {

    int i = 25; // Non Static Variable
    int j = 55;

    public void Variable() {
        System.out.println("Directly in Non Static Method : " + j);
        System.out.println("Or By Using this Keyword : " + this.j);

    }

    public static void main(String[] args) {

        nonStaticVariables ref1 = new nonStaticVariables();
        System.out.println("Directly : " + ref1.i);
        ref1.Variable();
    }

}
