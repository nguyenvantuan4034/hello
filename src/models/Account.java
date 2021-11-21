package models;

import java.util.ArrayList;

public class Account {
    private String accountNo;
    private String ownerName;
    private double amount;
    private String accountType;
    public static ArrayList<Account> accountList;

    public Account() {
    }

    public Account(String accountNo, String ownerName, double amount, String accountType) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.amount = amount;
        this.accountType = accountType;
    }

    public String toString() {
        return "Account{" + "accountNo='" + accountNo + '\'' + ", ownerName='" + ownerName + '\'' + ", amount=" + amount
                + ", AccountType='" + accountType + '\'' + '}';
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return this.accountType;
    }

    public void setType(String AccountType) {
        this.accountType = AccountType;
    }

    // Deposit method accept an double value like a parametter and decrease
    public void deposit(double amount) {
        this.amount = this.amount + amount;
    }

    // Withdraw method accept an double value like a parametter and inrement
    public void withdraw(double amount) {
        this.amount = this.amount - amount;
    }
    
    // create a set of account
    public void createAccount() {
        accountList = new ArrayList<Account>();
        accountList.add(new Account("12345", "John", 1000, "Savings"));
        accountList.add(new Account("54321", "Mary", 2000, "Current"));
        accountList.add(new Account("98765", "Mike", 3000, "Savings"));
    }

    // Show all list account
    public void showAllAccount() {
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
