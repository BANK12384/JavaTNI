import java.util.Scanner;

public class Ex202 {
    static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);


        System.out.print("Enter student id: ");
        String id = sacnner.next();
        sacnner.nextLine();
        System.out.print("Enter student-name: ");
        String name = sacnner.nextLine();

        System.out.println("\nStudent-id: " + id);
        System.out.println("Student-name: " + name);
    }
}
