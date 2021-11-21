package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private float mediumScore;
    public static ArrayList<Student> studentList;

    public Student() {
    }

    public Student(String id, String name, int age, String course, String address, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + ", address="
                + address + ", mediumScore=" + mediumScore + '}';
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumScore() {
        return this.mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    // create a set of students
    public void createStudent() {
        studentList = new ArrayList<Student>();
        studentList.add(new Student("1", "Nguyen Van A", 20, "Java", "Da Nang", 8.0f));
        studentList.add(new Student("2", "Nguyen Van B", 21, "C++", "Da Nang", 7.0f));
        studentList.add(new Student("3", "Nguyen Van C", 22, "Java", "Da Nang", 9.0f));
        studentList.add(new Student("4", "Nguyen Van D", 23, "C++", "Da Nang", 9.0f));
        studentList.add(new Student("5", "Nguyen Van E", 24, "Java", "Da Nang", 9.0f));
    }

    public void createStudentScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        studentList = new ArrayList<Student>();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student " + (i + 1) + " information: ");
            System.out.print("Enter id: ");
            String id = scanner.next();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter course: ");
            String course = scanner.next();
            System.out.print("Enter address: ");
            String address = scanner.next();
            System.out.print("Enter medium score: ");
            float mediumScore = scanner.nextFloat();
            Student student = new Student(id, name, age, course, address, mediumScore);
            studentList.add(student);
        }
    }

    // Show all list student
    public void showAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // Displays the average score of the gradual list of students in the class
    public void showAverageScore() {
        float sum = 0;
        for (Student student : studentList) {
            sum += student.getMediumScore();
        }
        System.out.println("Average score: " + sum / studentList.size());
    }

    // Search course of all student in the class
    public void searchCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course: ");
        String course = scanner.next();
        for (Student student : studentList) {
            if (student.getCourse().equalsIgnoreCase(course)) {
                System.out.println(student);
            }
        }
    }

    // Search and show id of a student
    public void searchId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        String id = scanner.next();
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.println(student);
            }
        }
    }

}
