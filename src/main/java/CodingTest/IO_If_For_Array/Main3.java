package CodingTest.IO_If_For_Array;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        int first = B/100;
        int second = (B%100)/10;
        int third = (B % 10);

        System.out.println(third*A);
        System.out.println(second * A);
        System.out.println(first * A);
        System.out.println(A*B);

    }
}
