package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String07_Toknizer {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tk = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(tk.nextToken());
        int num2 = Integer.parseInt(tk.nextToken());

        int newNum1 = 100 * (num1 % 10) + 10 * ((num1 / 10) % 10) + (num1 / 100);
        int newNum2 = 100 * (num2 % 10) + 10 * ((num2 / 10) % 10) + (num2 / 100);

        if (newNum1 > newNum2) {
            System.out.println(newNum1);
        }else {
            System.out.println(newNum2);
        }
    }
}
