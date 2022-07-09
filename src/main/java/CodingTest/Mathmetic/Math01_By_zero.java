package CodingTest.Mathmetic;

import java.util.Scanner;

public class Math01_By_zero {
    public static void main(String[] args) throws ArithmeticException {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long amount;
        if (C!=B) {
             amount = A / (C - B);

        if (amount<0){
            System.out.println(-1);
        }else {
        System.out.println(amount+1); }
    } else {
            System.out.println(-1);
        }
    }
}