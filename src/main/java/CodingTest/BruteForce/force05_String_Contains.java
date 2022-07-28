package CodingTest.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class force05_String_Contains {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int match = 0;
        int a = 666;
        while (true) {
            if (String.valueOf(a).contains("666")) {
                count++;

                match = a;}

            a++;

            if (count == n) {
                System.out.println(match);
                break;
            }
        }
    }
}
