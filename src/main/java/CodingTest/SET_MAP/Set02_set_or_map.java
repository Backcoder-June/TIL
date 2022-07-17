package CodingTest.SET_MAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Set02_set_or_map {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer tk = new StringTokenizer(br.readLine());


        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(Integer.parseInt(tk.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer tk2 = new StringTokenizer(br.readLine());


        for (int j = 0; j < m; j++) {

            if (set1.contains(Integer.parseInt(tk2.nextToken()))) {
                System.out.print(1 + " ");
            }else {
                System.out.print(0 + " ");
            }
        }
    }
}