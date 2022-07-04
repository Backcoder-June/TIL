package Campus.Ch11_langLibrary;

public class Pattern {
    public static void main(String[] args) {

        String phones[] = {"010-1234-5678", "011-1234-5678", "010-^^^2-5667" };

        for (int i = 0; i<phones.length; i++) {
            System.out.println(phones[i].matches("010-[0-9]{3,4}-[0-9]{4}"));
        }





    }
}
