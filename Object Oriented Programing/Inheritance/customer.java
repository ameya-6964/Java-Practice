class bank {
    String accHolderName;
    int accHolderNumber;
    double accBalance;
}

class savingAccount extends bank {

    savingAccount(String accHolderName, int accHolderNumber, double accBalance) {
        this.accHolderName = accHolderName;
        this.accHolderNumber = accHolderNumber;
        this.accBalance = accBalance;
    }
}

public class customer {
    public static void main(String[] args) {
        savingAccount user1 = new savingAccount("Ameya", 101, 2500.00);
        savingAccount user2 = new savingAccount("Jayesh", 102, 3500.00);
        System.out.println("Account Holder Name : " + user1.accHolderName);
        System.out.println("Account Number : " + user1.accHolderNumber);
        System.out.println("Account Balance : " + user1.accBalance);
        System.out.println("***********************");
        System.out.println("Account Holder Name : " + user2.accHolderName);
        System.out.println("Account Number : " + user2.accHolderNumber);
        System.out.println("Account Balance : " + user2.accBalance);

    }

}
