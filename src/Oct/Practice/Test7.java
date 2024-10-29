package Oct.Practice;
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
                System.out.println("Enter gender:");
                Scanner sc = new Scanner(System.in);
                String gender = sc.next().toLowerCase();

                if (gender.equals("male")) {
                    System.out.println("Good morning sir");
                } else if (gender.equals("female")) {
                    System.out.println("Good morning ma'am");
                } else {
                    System.out.println("Good morning");
                }

                sc.close();
            }
        }