package CodingTest.SET_MAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Set07_SubString {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        HashSet<String> set = new HashSet<>();
        for (int a = 0; a < s.length(); a++) {

            for (int b = a+1; b < s.length()+1; b++) {
                set.add(s.substring(a, b));
            }
        }

        System.out.println(set.size());

    }
}