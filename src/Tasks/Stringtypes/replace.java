package Tasks.Stringtypes;

public class replace {
    public static void main(String[] args) {
        /*String name = "Deepika Rathore";
        //String replac1 = name.replace(char oldChar, char newChar);
        String replac1 = name.replace( "p", "w");
        String replac2 = name.replace("Rath", "SWEE");
        System.out.println(replac1);
        System.out.println(replac2); */

        //To replaceAll integer value from string
        String s1 = "My name is deep342 rath893";
        String result1 = s1.replaceAll("\\d+", " ");
        System.out.println(result1);

    }
}
