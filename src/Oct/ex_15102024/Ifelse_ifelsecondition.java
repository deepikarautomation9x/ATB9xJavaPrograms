package Oct.ex_15102024;

public class Ifelse_ifelsecondition {
    //Rather than checking two conditions we have multiple conditions we use if-elseif- else
    public static void main(String[] args) {
        //Compare two numbers
        int num1 = 50;
        int num2 = 30;
        //Cond. 1 - num1 > num2 , num1< num2 , Num1 = num2
        if (num1 > num2) {
            System.out.println("Num1 is greater than num2 ");
        } else if (num1 < num2) {
            System.out.println("Num1 is less than num2 ");
        } else {
            System.out.println("Num1 is equal to num2 ");
        }
    }
}
