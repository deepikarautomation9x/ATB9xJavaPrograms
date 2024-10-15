package Oct.ex_14102024;

public class Ternaryoperator {
    public static void main(String[] args) {
        // Ternary/Conditional operator - Evaluate the condition and return output based evalution of 2 values.
       /* Program 1 -
        int a = -5;
          String result = a >0 ? "Positive_number ": "Negative_number";
          // String result = condition ? expression 1 : expression 2;
        System.out.println(result); //output -*/
        //Program 2 - find the Largest number out of 3 numbers.
        int x= 20 ,y=50 ,z=90;
        //int max1 = x>y ? x : y ; //Simple ternary method
        //int max2 = max1 >z ? max1 : z;
        //System.out.println(max2);
   int result = x>y ? x :y>z ? y :z; //Nested Ternary
        System.out.println(result);   //Output = 90
    }
}
