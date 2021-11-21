package utils;

import java.util.Scanner;

import models.Student;

public class ManagerStudent {
    public void manager() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        int choiceNumber;

        do {
            menu();
            choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
            case 1:
                student.createStudent();
                break;
            case 2:
                student.showAllStudent();
                break;
            case 3:
                student.showAverageScore();
                break;
            case 4:
                student.searchCourse();
                break;
            case 5:
                student.searchId();
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
            }
        } while (choiceNumber != 6);
    }

    public static void menu() {
        System.out.println("----Menu----");
        System.out.println("1. Create student");
        System.out.println("2. Show all student");
        System.out.println("3. Show average score");
        System.out.println("4. Search course");
        System.out.println("5. Search id");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
}
