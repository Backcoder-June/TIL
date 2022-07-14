package CodingTest.Recursion;

import java.util.Scanner;

public class Recursion01_Facto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();


/*  재귀로 풀기
        public static int facto(int n){
            if(n<=1){return 1;}
            return n*facto(n-1); }
*/

        if (N == 0) {
                System.out.println(1); return;
            }
            int facto = 1;
            for (int a = N; a >= 1; a--) {
                facto = facto * a;
            }
            System.out.println(facto);
        }
    }