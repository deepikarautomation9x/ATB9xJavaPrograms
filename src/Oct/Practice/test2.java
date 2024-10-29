package Oct.Practice;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        for (int i=2; i<=num/i ; i++) {
            if ((num % i) == 0) {
                System.out.println("Print No is not prime =" + num);
            } else
                System.out.println(" Its prime");
        }

    }
}


