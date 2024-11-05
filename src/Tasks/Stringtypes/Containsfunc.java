package Tasks.Stringtypes;
import java.lang.String;

public class Containsfunc {
    public static void main(String[] args) {
        String name = "Deepika Rathore";
        //Contains always gives output in form of Boolean expression
        boolean seq = name.contains("th0");
        boolean seq1 = name.contains("Ra");
        System.out.println(seq);
        System.out.println(seq1);
    }
}
