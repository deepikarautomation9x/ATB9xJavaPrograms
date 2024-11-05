package Tasks.Stringtypes;

public class dotequals {
    public static void main(String[] args) {
         String name1 = "Deepika Rathore";
         String name2 = "deepika rathore";
         boolean b = name1.equals(name2);
         System.out.println(b);
         boolean c = name1.equalsIgnoreCase(name2);
         System.out.println(c);

    }
}
