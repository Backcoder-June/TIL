package CodingTest.SET_MAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class map04_getorDefault_fail {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap();

        StringTokenizer tk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            map.put(i, Integer.parseInt(tk.nextToken())); }


        int m = Integer.parseInt(br.readLine());

         tk = new StringTokenizer(br.readLine());

        int[] card = new int[m];
        for (int j = 0; j < m; j++) {
            card[j] =Integer.parseInt(tk.nextToken()); }



        for (int a = 0; a < m; a++) {

            int count = 0;
            for (int b = 0; b < n; b++) {

                if (map.get(b) == card[a]) {
                    count++;
                }
            }
            sb.append(count+" ");
        }
        System.out.println(sb);
    }
}