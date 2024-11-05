package Tasks.Stringtypes;

public class replace {
    public static void main(String[] args) {
        String name = "Deepika Rathore";
        //String replac1 = name.replace(char oldChar, char newChar);
        String replac1 = name.replace( "p", "w");
        String replac2 = name.replace("Rath", "SWEE");
        System.out.println(replac1);
        System.out.println(replac2);
    }
}
