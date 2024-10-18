package Oct.ex_15102024;

import java.util.Scanner;
public class FindevenOddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the number =" + num);

        //Check the number is even or not +Comcept og modulus comes i.e %  for evrn mod is 0 and for odd mod is 1
        if (num % 2 == 0) {
            System.out.println("No is even =" + num);
        } else {
            System.out.println("No is odd ");

        }
        sc.close();
    }
}