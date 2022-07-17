package CodingTest.SET_MAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class set02_mapver {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer tk = new StringTokenizer(br.readLine());


        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(Integer.parseInt(tk.nextToken()), 1);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer tk2 = new StringTokenizer(br.readLine());


        for (int j = 0; j < m; j++) {

            if ( map1.get(Integer.parseInt(tk2.nextToken())) != null) {
                System.out.print(1 + " ");
            }else {
                System.out.print(0 + " ");
            }
        }

    }
}
