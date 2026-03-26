import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentReader {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        String filename = "students.txt";
        Scanner scanner = new Scanner(System.in);

        readFile(filename);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student by ID");
            System.out.println("3. Search for a student by ID");
            System.out.println("4. Print all students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner, filename);
                    break;
                case 2:
                    removeStudent(scanner, filename);
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    printStudents();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }

    public static void readFile(String filename) {
        try {
            Scanner fileScanner = new Scanner(new File(filename));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(" ");

                String firstName = parts[0];
                String lastName = parts[1];
                int id = Integer.parseInt(parts[2]);
                String email = parts[3];

                Student student = new Student(firstName, lastName, id, email);
                students.add(student);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void printStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Line " + (i + 1) + ": " + students.get(i));
        }
    }

    public static void writeFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);

            for (Student student : students) {
                writer.println(student.toFileString());
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void addStudent(Scanner scanner, String filename) {
        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getStudentID() == id) {
                System.out.println("A student with this ID already exists.");
                return;
            }
        }

        System.out.print("Enter email: ");
        String email = scanner.next();

        Student newStudent = new Student(firstName, lastName, id, email);
        students.add(newStudent);

        writeFile(filename);

        System.out.println("Student added successfully.");
        printStudents();
    }

    public static void removeStudent(Scanner scanner, String filename) {
        System.out.print("Enter the student ID to remove: ");
        int id = scanner.nextInt();

        boolean removed = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == id) {
                students.remove(i);
                removed = true;
                break;
            }
        }

        if (removed) {
            writeFile(filename);
            System.out.println("Student removed successfully.");
            printStudents();
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public static void searchStudent(Scanner scanner) {
        System.out.print("Enter the student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getStudentID() == id) {
                System.out.println("Student found:");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student with ID " + id + " does not exist.");
    }
}