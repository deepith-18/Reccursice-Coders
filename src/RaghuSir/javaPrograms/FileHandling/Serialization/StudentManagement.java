package RaghuSir.javaPrograms.FileHandling.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    static String path = "C:\\RCB\\src\\RaghuSir\\javaPrograms\\FileHandling\\Serialization\\student_dts.txt";
    static Scanner sc = new Scanner(System.in);

    // Save students to file
    static void saveStudents(List<Student> students) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(students);
        oos.close();
    }

    // Load students from file
    static List<Student> loadStudents() throws Exception {

        File file = new File(path);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        List<Student> students = (List<Student>) ois.readObject();
        ois.close();

        return students;
    }

    // Search student by ID
    static Student searchStudent(List<Student> students) {

        System.out.print("Enter Student ID : ");
        String id = sc.next();

        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }

        return null;
    }

    public static void main(String[] args) throws Exception {

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Retrieve Students");
            System.out.println("3. Find Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            List<Student> students;
            Student std;

            switch (choice) {

                case 1:

                    std = Student.readStudent();

                    students = loadStudents();

                    students.add(std);

                    saveStudents(students);

                    System.out.println("Student added successfully.");

                    break;

                case 2:

                    students = loadStudents();

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }

                    break;

                case 3:

                    students = loadStudents();

                    std = searchStudent(students);

                    if (std == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Student Found:");
                        System.out.println(std);
                    }

                    break;

                case 4:

                    students = loadStudents();

                    std = searchStudent(students);

                    if (std == null) {
                        System.out.println("Student not found.");
                    } else {

                        students.remove(std);

                        saveStudents(students);

                        System.out.println("Student deleted successfully.");
                    }

                    break;

                case 5:

                    System.out.println("Thank You...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");

            }

        }

    }
}