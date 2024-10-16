package Oct.ex_15102024;

public class Argumentconsole {
    public static void main(String[] args) {
       // int age = Integer.parseInt(args[0]);
        //System.out.println(age>25 ? "Allowed for Goa" :"Not allowed");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int max = x > y ? x : y ;
        System.out.println(max);

    }
}

