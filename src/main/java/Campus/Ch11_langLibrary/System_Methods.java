package Campus.Ch11_langLibrary;

public class System_Methods {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getenv());

        for (int i =1; i<=1000; i++ ){
            System.out.print(i);
        }

        System.out.println();
        System.out.println("Time : " +  (System.currentTimeMillis() - start));
    }
}
