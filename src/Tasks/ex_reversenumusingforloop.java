package Tasks;

import java.util.Scanner;

public class ex_reversenumusingforloop {
        //Reverse the number using for loop. (In - 12345, Out - 54321)
        //Scanner sc =new Scanner(System.in);
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number : ");
            int num = sc.nextInt();

            int reverse = 0;
            for(;num != 0 ; num = num/10)
            {

                int remainder = num % 10;
                reverse = reverse * 10 +remainder;

            }

            System.out.println("Reverse of the given number is : "+reverse);
        }

    }
