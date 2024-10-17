package Oct.ex_15102024;

import java.util.Scanner;

public class Scannerprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Take a user input - Name, Age and Salary and print them in the end.
        System.out.print("Enter your name : ");
        String name = scanner.nextLine() ;

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary : ");
        double salary = scanner.nextDouble();

        // Now print these values-
        System.out.println ("Name =" + name);
        System.out.println ("Age =" + age);
        System.out.println ("Salary =" + salary);
        scanner.close();

    }

}
