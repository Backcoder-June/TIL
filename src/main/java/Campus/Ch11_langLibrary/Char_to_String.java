package Campus.Ch11_langLibrary;

public class Char_to_String {
    public static void main(String[] args) {

        char[] c = new char[100];
        int index = 0;
        try {
            while (true) {
                int result = System.in.read();
                if (result=='\n'){break;}
                c[index++] = (char) result;
            }

            String sc = new String(c);            // char 배열을 String 으로 한방에 담기

            System.out.println(sc.toUpperCase());
        }catch (Exception e){e.printStackTrace();}




    }
}
