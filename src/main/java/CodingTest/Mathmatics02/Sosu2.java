package CodingTest.Mathmatics02;

import java.util.Scanner;

public class Sosu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

            int sum = 0;
            int min = 10001;

        for (int b = M; b<=N; b++) {
            int count = 0;
            for (int j = 1; j <= b; j++) {
                    if ( b % j == 0) { count++;}  }

            if (count == 2) {
                sum += b;
                if (b < min) {
                    min = b; }
            }
        }

        if ( sum != 0 ){
            System.out.println(sum);
            System.out.println(min);
        } else {System.out.println(-1);}
    }
}