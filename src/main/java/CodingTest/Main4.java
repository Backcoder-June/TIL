package CodingTest;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        B += C;

        if ( B >= 60 ){
            A = A + B/60 ;
            B = B%60;

        if (A > 23){
            A -= 24;}
        }

        System.out.println(A + " " + B);


    }
}
