package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String02_0_48 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        String A = br.readLine();
        for (int i = 0; i < N; i++) {
            sum += A.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
