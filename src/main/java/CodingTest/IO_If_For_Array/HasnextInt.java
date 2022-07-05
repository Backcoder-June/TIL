package CodingTest.IO_If_For_Array;

import java.util.Scanner;

public class HasnextInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextInt()){

            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);

        }





    }
}
