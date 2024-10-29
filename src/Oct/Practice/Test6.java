package Oct.Practice;

import java.util.Scanner;
public class Test6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first value");
            int akash_1= sc.nextInt();

            System.out.println("enter second value");
            int akash_3=sc.nextInt();

            int sum = sum_of_two_Numbers(akash_1,akash_3);
            System.out.println(sum);

            //String
            sc.nextLine();

            System.out.println("enter your firstname");
            String firstname = sc.nextLine();

            System.out.println("enter your lastname");
            String lastname = sc.nextLine();
            String userfullname = fullname(firstname,lastname);
            System.out.println(userfullname);

            sc.close();

        }
        static int sum_of_two_Numbers(int n1 , int n2){
            return n1+n2;
        }
        static String fullname(String firstname,String lastname){
            return firstname+" "+lastname;
        }
    }

