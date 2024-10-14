package Oct.ex_14102024;

public class Lab0050 {
            public static void main(String[] args) {
                // Arithmetic operators
                int a = 45;
                int b = 15;
                // Addition
                System.out.println(a + b);
                // Subtraction
                System.out.println(a - b);
                // Multiplication
                System.out.println(a * b);
                // Division
                System.out.println(a / b);
                //Modulus
                System.out.println(a % b);
                // Unary operators
                {
                    int c = 10;
                    System.out.println(-c);
                }
                {
                    int c = 10;
                    System.out.println(c++);
                    System.out.println(++c);
                }
                {
                    int d = 10;
                    System.out.println(d--);
                    System.out.println(--d);
                }
                // Logical Not
                boolean flag = true;
                System.out.println(!flag);
                // Assignment operators
                int f = 10;
                System.out.println("f+=5:" + (f += 5));
                System.out.println("f-=5:" + (f -= 5));
                System.out.println("f*=5:" + (f *= 5));
                System.out.println("f/=5:" + (f /= 5));
                System.out.println("f%=5:" + (f %= 5));
                // Relational Operators
                int g =5, h=10, i=15;
                System.out.println("g==h "+(g==h));
                System.out.println("g!=i "+(g!=i));
                System.out.println("g<h "+(g<h));
                System.out.println("g<=h "+(g<=h));
                System.out.println("g>h "+(g>h));
                System.out.println("g>=h "+(g>=h));
                System.out.println("g==i "+(g==i));
                // Logical operators
                boolean x= true;
                boolean y= false;
                System.out.println("x&&y "+(x&&y));
                System.out.println("x||y "+(x||y));
                System.out.println("!y "+(!y));
                // Ternary Operators
                int j=10;
                int k=20;
                int result= (j>k)? j:k;
                System.out.println("The max number is "+j+" and "+k+ " is:" +result);
                // Bitwise operators
                int u=5, v=3;
                System.out .println(u&v); //Bitwise AND
                // Output: 1 (Binary: 0101 & 0011 = 0001)
                System.out.println(u|v);  //Bitwise OR
                //(Binary: 0101 | 0011 = 0111)
                System.out.println(u^v);  //Bitwise XOR
                //(Binary: 0101 ^ 0011 = 0110)
                System.out.println(~u);   //Bitwise NOT
            /*     a = 5 = 0101 (In Binary)
            Bitwise Complement Operation of 5 in java (8 bits)
            ~ 00000101
            ________
            11111010  = 246 (In decimal)
            The bitwise complement of 5 is 246 and The 2’s complement of 246
            is -6. Hence, the output is -6 instead of 246.
            bitwise complement of N = ~N (represented in 2's complement form)
            2'complement of ~N = -(~(~N)+1)  =  -(N+1).    */

                //Shift Operators
                int l=5;
                System.out.println(l<<1);  //Output: 10 (5 * 2^1)
                int m=8;
                System.out.println(m>>1);  //Output: 4 (8 / 2^1)
                //Instanceof Operator
                String str="Hello";
                System.out.println(str instanceof String);
           /*The instance of the operator is used for type checking.
           It can be used to test if an object is an instance of a class,
           a subclass, or an interface. General format-
           object instance of class/subclass/interface */
                //Type casting operator
                double d=9.2;
                int n=(int)d;
                System.out.println(n);
            }
        }
