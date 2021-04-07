package learn.java;

/**
 * Bank OOP
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Bank Account OOP");
        BankAccount robin = new BankAccount(100001, 1000.50, "robin", "robin@gmail.com", "0167");
        System.out.println(robin.toString());
        robin.displayBalance();
        robin.depositMoney(55.55);
        robin.withdrawMoney(2000);
        robin.withdrawMoney(1000);
        robin.withdrawMoney(56.0500000);
        robin.withdrawMoney(100);
        robin.displayBalance();
    }
}
