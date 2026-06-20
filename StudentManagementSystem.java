import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                sc.nextLine();
                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                list.add(new Student(id, name, age, course));
                System.out.println("Student Added!");

            } else if (choice == 2) {
                if (list.isEmpty()) {
                    System.out.println("No students found!");
                } else {
                    for (Student s : list) {
                        System.out.println("-----------------");
                        System.out.println("ID: " + s.id);
                        System.out.println("Name: " + s.name);
                        System.out.println("Age: " + s.age);
                        System.out.println("Course: " + s.course);
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}