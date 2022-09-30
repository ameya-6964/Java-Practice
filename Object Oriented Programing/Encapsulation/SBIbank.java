// Create Class And Show Practical example Of Encapsulation

class ATM {
    double balance = 970000.00; // Variables Are Represnted as States
    double Accountbalance = 100000; // Variables Are Represented as States

    public void withdraw() {
        System.out.println("You Can Withdraw"); // Methods Are Reprensented as Behaviour
    }
}

public class SBIbank {
    public static void main(String[] args) {
        ATM user1 = new ATM();
        if (user1.Accountbalance == 0) {
            System.out.println("Insufficiant Funds");
        }

        else {

            System.out.println("ATM has Currently " + user1.balance + " and You have " + user1.Accountbalance);
            user1.withdraw();
        }
    }
}
