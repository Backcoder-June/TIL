package CodingTest.Mathmatics02;

import java.util.Scanner;

public class Soinsu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

        if (n == 1) {return;}

            for (int i = 2; i <= Math.sqrt(n); i++) {

                while (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                }
            }

            if (n != 1){
            System.out.println(n);}
    }
}
                /*
                if (n % i == 0) {

                    System.out.println(i);
                    n = n / i;
                    i--;

                }*/


// 72 /2 //  2 36 //2 18 //  9 2//  n/i=36





