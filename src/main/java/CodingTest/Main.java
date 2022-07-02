package CodingTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a = N / 10;  // 10 의자리
        int b = N % 10;  // 1 의자리


        int count = 0;


        while (true) {
            int newN = 0;
            if (N < 10) {
                newN = (N * 10 + N);
            } else {
                if ((a + b) < 10) {
                    newN = (b * 10) + (a + b);
                } else if ((a + b) >= 10) {
                    newN = (b * 10) + (a + b - 10);
                }
            }
            System.out.println(newN);
            count += 1;

            if (N == newN){ break;}
            else { N = newN;
                a = N / 10;
                b = N %  10;
            }
        }

        System.out.println(count);



    }
}


        // 10  1 + 0 = 1  => 1 /
        // 1   0 + 1 = 1  => 11/
        // 11  1 + 1 = 2  =? 12 /
        // 12  1 + 2 = 3 =>  23/
        // 23  2 + 3 = 5 =>  35/
        // 35  3 + 5 = 8 =?  58/
        // 58  5 + 8 = 13 =>  83/
        // 83  8 + 3 = 11 =>  31/
        // 31  3 + 1 =  4 =>  14/
        // 14  1 + 4 =  5 => 45/
        // 45  4 + 5 = 9 =? 59
        // 59  5 + 9 = 14 =? 94







