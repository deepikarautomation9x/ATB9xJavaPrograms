package Tasks.Stringtypes;

public class split {
    public static void main(String[] args) {
        String FullName = "Deepika-Rathore-SPLITNAME";
        String [] var =FullName.split("-");
        System.out.println(var[0]);
        System.out.println(var[1]);
        System.out.println(var[2]);
    }
}
