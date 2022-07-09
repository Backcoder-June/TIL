package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String09_replace_length {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String s = br.readLine();


        String[] divide = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < divide.length; i++) {

            if (s.contains(divide[i])) {
                s = s.replace(divide[i], "^");
            }
        }
        System.out.println(s.length());

    }
}