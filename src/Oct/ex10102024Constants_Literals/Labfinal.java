package Oct.ex10102024Constants_Literals;

public class Labfinal {
    public static void main(String[] args) {
        /*Constant- reassign of value not possible ,one time assignment is required.
        Local value not assigned by JVM ,only static and instance varial assign default value */
       final float A = 3.14F; //Variable_name should be in capital letter in constant.
        //A=3;// Value can be changes  so use final keyword is required.
        System.out.println("This is constant value " + A);
        /*final int a =10 ;   (valid)
        final String STR = "ABC" ; (valid)
        final double d = 3.3333; (valid) */
    }
}
