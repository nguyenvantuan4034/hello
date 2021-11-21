package utils;

import java.util.Scanner;

import models.Account;

public class Atm extends Account {

    public void withdraw(String accountNo, double amount) {
        Account account = findAccount(accountNo);
        if (account != null) {
            if (account.getType().equals("saving")) {
                if (account.getAmount() >= amount) {
                    account.setAmount(account.getAmount() - amount);
                    System.out.println("Withdraw success " + account.getAmount());
                } else {
                    System.out.println("Not enough money");
                }
            } else {
                if (account.getAmount() >= amount) {
                    account.setAmount(account.getAmount() - amount);
                    System.out.println("Withdraw success " + account.getAmount());
                } else {
                    System.out.println("Not enough money");
                }
            }
        } else {
            System.out.println("Account not found");
        }
    }

    // Deposit method accepts an account
    public void deposit(String accountNo, double amount) {
        Account account = findAccount(accountNo);
        if (account != null) {
            account.setAmount(account.getAmount() + amount);
            System.out.println("Deposit success " + account.getAmount());
        } else {
            System.out.println("Account not found");
        }
    }

    // ViewAmount method accepts an account object as a parameter then display
    public void viewAmount(String accountNo) {
        Account account = findAccount(accountNo);
        if (account != null) {
            System.out.println("Account{" + "accountNo='" + account.getAccountNo() + '\'' + ", ownerName='"
                    + account.getOwnerName() + '\'' + ", amount=" + account.getAmount() + ", AccountType='"
                    + account.getType() + '\'' + '}');
        } else {
            System.out.println("Account not found");
        }
    }

    // Transfer method accepts two account objects as a parameter then asks the user
    public void transfer(String accountNo1, String accountNo2, double amount) {
        Account account1 = findAccount(accountNo1);
        Account account2 = findAccount(accountNo2);
        if (account1 != null && account2 != null) {
            if (account1.getAmount() >= amount) {
                account1.setAmount(account1.getAmount() - amount);
                account2.setAmount(account2.getAmount() + amount);
                System.out.println("Transfer success " + account1.getAmount() + " to " + account2.getAmount());
            } else {
                System.out.println("Not enough money");
            }
        } else {
            System.out.println("Account not found");
        }
    }

    private Account findAccount(String accountNo) {
        for (Account account : Account.accountList) {
            if (account.getAccountNo().equalsIgnoreCase(accountNo)) {
                return account;
            }
        }
        return null;
    }

    public void manager() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        account.createAccount();
        account.showAllAccount();

        Atm atm = new Atm();

        int choiceNumber;

        do {
            menu();
            choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
            case 1:
                atm.withdraw("12345", 199);
                break;
            case 2:
                atm.deposit("54321", 299);
                break;
            case 3:
                atm.viewAmount("98765");
                break;
            case 4:
                atm.transfer("12345", "98765", 800);
                break;
            default:
                System.out.println("Invalid choice");
                break;
            }
        } while (choiceNumber != 5);
    }

    public static void menu() {
        System.out.println("----Menu----");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. View Amount");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

}
