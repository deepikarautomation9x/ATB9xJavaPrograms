package Oct.ex_15102024;
import java.util.Scanner;
public class scanner {
        public static void main(String[]args)
        {
            Scanner scanner = new Scanner(System.in);

            // Taking user input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your salary: ");
            double salary = scanner.nextDouble();

            // Printing the user input
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);

            scanner.close();
        }
    }

