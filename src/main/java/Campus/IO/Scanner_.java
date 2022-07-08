package Campus.IO;

import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);

        String c = scanner.next();
        String d = scanner.next();

        System.out.println(c + d);

        scanner.nextLine();

        String e = scanner.nextLine();

        System.out.println(e);

    }
}
