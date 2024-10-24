package Tasks;

import java.util.Scanner;

import static Tasks.Functiontask23Oct.*;

public class Function23octwithoutreturn {
    public static void main(String[] args) {
        //Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
        //
        //3 → user input
        //4 - user input
        //
        //sum(3,4)
        //take user input 1
        System.out.println("Arithmetic Operaters");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value- ");
        int a = sc.nextInt();
        System.out.println("Enter the second value- ");
        int b = sc.nextInt();
         //functions add 2 numbers
        int sum = Sum(a,b);
        System.out.println("summation->"+ sum);
        int sub = Sub(a,b);
        System.out.println("substraction->"+ sub);
        int mul = Mul(a,b);
        System.out.println("multiplication->"+ mul);
        int div = Div(a,b);
        System.out.println("division->"+ div);
    }
    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    static void sub(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }
    static void mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }
    static void div(int a, int b) {
        int div = a / b;
        System.out.println(div);
    }

        }



