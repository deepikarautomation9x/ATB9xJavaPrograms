package Oct.ex10102024Constants_Literals;

public class Javaoperatores {
    public static void main (String[] args){
        //Arithmetical operator=
        System.out.println("********* Java Arithematical operators********");
        int a = 1;
        int b =2 ;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
        System.out.println("********* Java Relational Operators********");
        //Relational Operator >operators are used to check the relationship between two operands.
        System.out.println("a > b = " + (a>b));
        System.out.println("a < b = " + (a<b));
        System.out.println("a >= b = " + (a>= b));
        System.out.println("a <= b = " + (a<= b));
        System.out.println("a == b = " + (a==b));
        System.out.println("a != b = " + (a!=b));
        System.out.println("********* Java Logical Operators********");
        //Logical Operators >Logical operators are used to check whether an expression is true or false.
        // They are used in decision making.
        boolean name1 = true;
        boolean name2 = false;
        System.out.println("AND operator value = " + (name1 && name2));
        System.out.println("OR operator value = " + (name1 || name2));
        System.out.println("NOT operator value = " + ( !name1 && !name2));
        System.out.println("******* (Java Unary Operators ) *************");
        //Unary operators are used with only one operand.
        // For example, ++ is a unary operator that increases the value of a variable by 1. That is, ++5 will return 6.
        System.out.println("Increment and Decrement Operators");
        // declare variable
        int c=12 , d=12;
        int result1,result2;
        // original value
        System.out.println("original value of c :" +c);
        // increment operator
        result1= ++c;
        System.out.println("After increment: " +result1);
        System.out.println("Value of d: "  +d);
        // decrement operator
        result2= --d;
        System.out.println("After decrement: " + result2);

        System.out.println("******* (Java Ternary Operator ) *************");
        //variable = Expression ? expression1 : expression2
        //f the Expression is true, expression1 is assigned to the variable.
        //If the Expression is false, expression2 is assigned to the variable.
        int februaryDays = 29;
        String result4;
        //ternary operator
        //result4 =(februaryDays == 28)? "Not a leap year"  :"Leap year";
        // System.out.println(result4);
        result4 =(februaryDays == 29)? "Not a leap year"  :"Leap year";
        System.out.println(result4);


    }
}
