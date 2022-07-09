package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class String10_contains {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int a =0; a<N; a++) {
        String s = br.readLine();
            Set set = new HashSet();
            Set set2 = new HashSet();

        set.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!(set.contains(s.charAt(i)))) {
                set.add(s.charAt(i));
            } else if (s.charAt(i - 1) != s.charAt(i)) {
                set.clear();
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            set2.add(s.charAt(i));
        }

        if (set.size() == set2.size()) {
            count++;
        }
    }
        System.out.println(count);
    }
}