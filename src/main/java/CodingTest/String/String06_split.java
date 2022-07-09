package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String06_split {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] words = s.split(" ");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                count++; }
        }
        System.out.println(words.length-count);
    }
}
