import java.util.Scanner;

import models.Account;
import utils.Atm;
import utils.ManagerStudent;

public class Main {
  public static void main(String[] args) {
    ManagerStudent student = new ManagerStudent();

    Account account = new Account();
    Atm atm = new Atm();

    Scanner scanner = new Scanner(System.in);
    int choiceNumber;

    do {
      menu();
      choiceNumber = scanner.nextInt();
      switch (choiceNumber) {

      case 1:
        student.manager();
        break;
      case 2:
        atm.manager();
        break;
      default:
        System.out.println("Invalid choice");
        break;
      }
    } while (choiceNumber != 3);
  }

  public static void menu() {
    System.out.println("----Menu----");
    System.out.println("1. Manager student");
    System.out.println("2. Manager atm");
    System.out.println("3. Exit");
    System.out.print("Enter your choice: ");
  }
}