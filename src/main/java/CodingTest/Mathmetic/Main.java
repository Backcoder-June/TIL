package CodingTest.Mathmetic;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        BigDecimal money = new BigDecimal(A);
        BigDecimal money2 = new BigDecimal(B);

        System.out.println(money.add(money2));
    }
}