package learn.java;

import java.math.BigDecimal;

public class BankAccount {
    int accountNumber;
    BigDecimal balance;
    String customerName;
    String email;
    String phoneNumber;

    public BankAccount() {
        this(0, 0.0, "Default Name", "Default Mail", "Default Number");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.valueOf(balance);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void displayBalance() {
        System.out.println("Current balance is: " + this.balance +"TK");
    }

    public void depositMoney(double money) {
        this.balance = this.balance.add(BigDecimal.valueOf(money));
        System.out.println("After deposit " + money + "TK, balance " + String.format("%.2f", this.balance) + "TK");
    }

    public void withdrawMoney(double money) {
        if (this.balance.subtract(BigDecimal.valueOf(money)).doubleValue() >= 0) {
            this.balance = this.balance.subtract(BigDecimal.valueOf(money));
            System.out.println("After withdrawn " + money + "TK, balance " + String.format("%.2f", this.balance) + "TK");
        } else {
            System.out.println("You don't have " + money + "TK in your bank! Withdrawn Rejected");
        }
    }
}
