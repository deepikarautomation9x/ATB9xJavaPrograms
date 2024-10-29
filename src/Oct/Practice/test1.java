package Oct.Practice;

public class test1 {
    public static void main(String[] args) {
        //write a program to count down to 10 and print "tick" for 10 lines
        /*int i=10;
        while (i> 0){
            System.out.println ("tick =" + i);
            i--; //decrement operator
        }
    }
}*/
// in while to define body is not mandatory eg to find the between no 100 and 200
        int i = 100;
        int j = 200;
        while (++i < --j) ; //no body in this loop
        System.out.println("mid value is " + i);
    }
}