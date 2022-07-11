package CodingTest.Mathmatics;

import java.util.Scanner;

public class Math03_For_if_nn1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();



        for (int a = 1; true; a++) {
            if ((a * (a + 1)/2) >= X) {

                int B = (a * (a + 1) / 2) - X ;

                if (a % 2 == 1) {
                    System.out.println( (1+B)+"/"+(a-B) );break;
                } else if (a % 2 == 0) {
                    System.out.println((a-B)+"/"+(1+B));break;
                }
            }
        }
    }
}

// 2/3 8 // 4 10 / 2
// 3/2  9 // 4 10 / 1
//12345 //
