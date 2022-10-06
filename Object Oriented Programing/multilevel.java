// Example Of Multilevel Inheritance

class first {
    String name1 = "I am First class";
}

class second extends first {
    String name2 = "I am Second class";
}

class third extends second {
    String name3 = "I am Third  class";
}

class fourth extends third {
    String name4 = "I am Fourth class";
}

public class multilevel {
    public static void main(String[] args) {
        second ref1 = new second();
        System.out.println("I am From Second class " + ref1.name1);
        System.out.println("I am From Second class " + ref1.name2);

        third ref2 = new third();
        System.out.println("I am From Third class " + ref2.name1);
        System.out.println("I am From Third class " + ref2.name2);
        System.out.println("I am From Third class " + ref2.name3);

        fourth ref3 = new fourth();
        System.out.println("I am From Fourth class " + ref3.name1);
        System.out.println("I am From Fourth class " + ref3.name2);
        System.out.println("I am From Fourth class " + ref3.name3);
        System.out.println("I am From Fourth class " + ref3.name4);

    }
}

/*
 * Output
 * I am From Second class I am First class
 * I am From Second class I am Second class
 * I am From Third class I am First class
 * I am From Third class I am Second class
 * I am From Third class I am Third class
 * I am From Fourth class I am First class
 * I am From Fourth class I am Second class
 * I am From Fourth class I am Third class
 * I am From Fourth class I am Fourth class
 */
