package CodingTest;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if ( M <45 ) {
            H -= 1 ;
        if ( H < 0){ H += 24; }

            M = M + 60 - 45 ;
        }
        else {
            M -= 45;
        }

        System.out.println(H+" "+M);


    }
}