package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String03_for_a_z {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        for (int i = 97; i<123; i++) {
            System.out.print(S.indexOf((char)i) + " ");
        }
    }
}
