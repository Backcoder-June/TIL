package CodingTest.SET_MAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Set_conatainAll_removeAll {
    public static void main(String[] args) throws IOException {




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());




        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            String s = br.readLine();

            set.add(s);}


        HashSet<String> set2 = new HashSet<>();

        for (int j = 0; j < m; j++) {

            String s2 = br.readLine();

            set2.add(s2);
            }



//        set.retainAll(set2);

        set2.removeAll(set);

        System.out.println(set2.size());






    }
}




