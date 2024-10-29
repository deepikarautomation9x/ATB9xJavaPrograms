package Tasks;
import java.util.Scanner;
public class    Functiontask23Oct {
        public static void main(String[] args) {
            System.out.println("Arithmetic Operaters");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first value- ");
            int a = sc.nextInt();
            System.out.println("Enter the second value- ");
            int b = sc.nextInt();
            int sum = Sum(a,b);
            System.out.println("summation->"+ sum);
            int sub = Sub(a,b);
            System.out.println("summation->"+ sub);
            int mul = Mul(a,b);
            System.out.println("summation->"+ mul);
            int div = Div(a,b);
            System.out.println("summation->"+ div);
        }
        // functions is always defined outside the loop
        static int Sum(int a, int b){
            int sum = a+b;
            return sum;
        }
        static int Sub(int a, int b) {
            int sub = a - b;
            return sub;
        }
        static int Mul(int a, int b){
            int mul = a*b;
            return mul;
        }
        static int Div(int a, int b){
            int div = a/b;
            return div ;


        }
    }

