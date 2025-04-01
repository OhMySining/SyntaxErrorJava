import java.util.ArrayList;
import java.util.Scanner;

public class ITE5Finals {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> StudentID = new ArrayList<Integer>();
    public static ArrayList<String> Students = new ArrayList<String>();
    public static ArrayList<Integer> StudentAge = new ArrayList<Integer>();
    public static ArrayList<String> StudentCourse = new ArrayList<String>();
    public static int StudentQuantity = 0;

    public static final String Red = "\u001B[31m";
    public static final String Blue = "\u001B[34m";
    public static final String Reset = "\u001B[0m";
    public static final String BG_WHITE = "\033[47m";
    public static void main(String[] args) {
        System.out.println("\033[47m");
        System.out.println(Blue + "=== Student Management System ===" + Reset);
        String decision;
        do { 
            System.out.print("\n1. Add Student \n2. View All Student \n3. Search Student by ID \n4. Delete Student by ID \n5. Exit \n\nEnter your choice here: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                addStudent();
                break;
                case 2:
                viewStudents();
                break;
                case 3:
                searchStudentById();
                break;
                case 4:
                deleteStudentById();
                break;
            }
            System.out.print("\n\nGo back to main menu (or 5 to exit)? ");
            decision = sc.next();
        } while (decision.equalsIgnoreCase("yes") || decision.equalsIgnoreCase("y"));
    }
    public static void addStudent(){
        StudentQuantity += 1;
        System.out.print("\nEnter Student ID: ");
        StudentID.add(sc.nextInt());
        System.out.print("Enter Student Full Name: ");
        Students.add(sc.next());
        System.out.print("Enter Student Age: ");
        StudentAge.add(sc.nextInt());
        System.out.print("Enter Student Course: ");
        StudentCourse.add(sc.next());
        System.out.print("\nStudent Successfully Added!");   
    }
    public static void viewStudents(){
        System.out.println("\nHere are the list of students: \n");
        System.out.println("\033[47m");
        System.out.println(Blue + "Student ID\t\tStudent Name\t\t\t\tStudent Age\t\tStudent Course" + Reset);
        for(int studentlistQuantity = 0; studentlistQuantity < StudentQuantity; studentlistQuantity++){
            System.out.println(StudentID.get(studentlistQuantity) + "\t\t\t" + Students.get(studentlistQuantity) + "\t\t\t\t\t" + StudentAge.get(studentlistQuantity) + "\t\t\t" + StudentCourse.get(studentlistQuantity));
        }
    }
    public static void searchStudentById(){
        System.out.print("\nEnter the Student ID you want to search: ");
        int IDsearch = sc.nextInt();
        for(int idQuantity = 0; idQuantity < StudentQuantity; idQuantity++){
            if (IDsearch == StudentID.get(idQuantity)){
                System.out.print("\n\nThe student with " + IDsearch + " ID is: \n");
                System.out.print("Student ID: " + StudentID.get(idQuantity) + "\nStudent Name: " + Students.get(idQuantity) + "\nStudent Age: " + StudentAge.get(idQuantity) + "\nStudent Course: " + StudentCourse.get(idQuantity));
            }
        }
    } 
    public static void deleteStudentById(){
        System.out.print("\nEnter the Student ID you want to delete: ");
        int IDdelete = sc.nextInt();
        for(int idQuantity = 0; idQuantity < StudentQuantity; idQuantity++){
            if (IDdelete == StudentID.get(idQuantity)){
                System.out.println("\n\nThe Student with the information: \n");
                System.out.println("\033[47m");
                System.out.println(Blue + "Student ID\t\tStudent Name\t\t\t\tStudent Age\t\tStudent Course" + Reset);
                System.out.print(StudentID.get(idQuantity) + "\t\t\t" + Students.get(idQuantity) + "\t\t\t\t\t" + StudentAge.get(idQuantity) + "\t\t\t" + StudentCourse.get(idQuantity));
                System.out.println(Red + "\n\nIs successfuly deleted." + Reset);
                StudentID.remove(idQuantity);
                Students.remove(idQuantity);
                StudentAge.remove(idQuantity);
                StudentCourse.remove(idQuantity);
                StudentQuantity -=1;
            }
        }
    }  
}