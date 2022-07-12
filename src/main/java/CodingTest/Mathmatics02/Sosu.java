package CodingTest.Mathmatics02;

import java.util.Scanner;

public class Sosu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int sosu = 0;
        for (int a = 0; a < T; a++) {

            int n = sc.nextInt();
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count++; }
            }
            if (count == 2) {
                sosu++;
            }
        }
            System.out.println(sosu);
    }
}