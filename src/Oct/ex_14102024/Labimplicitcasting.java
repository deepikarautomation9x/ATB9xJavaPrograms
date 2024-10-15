package Oct.ex_14102024;

public class Labimplicitcasting {
    public static void main(String[] args) {
        //Narrowing casting > To manually convert large data types to small data types
        //double -> float -> long -> int -> char -> short -> byte
        double bankbalance = 500000.98d;
        int currentbalance = 300000;
        int afterwithdrawAmt = (int)bankbalance - currentbalance ;
        System.out.println("Remaining amount =" + afterwithdrawAmt); //Manual casting Explicit casting double to int
    }
}
