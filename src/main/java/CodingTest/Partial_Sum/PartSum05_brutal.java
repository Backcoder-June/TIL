package CodingTest.Partial_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PartSum05_brutal {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer tk1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk1.nextToken());
        int m = Integer.parseInt(tk1.nextToken());

        HashMap<String, Integer> map = new HashMap();
        for (int i = 1; i <= n; i++) {
            StringTokenizer tk2 = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {

                map.put( i+""+j , Integer.parseInt(tk2.nextToken()));
            }
        }

        for (int a = 0; a < m; a++) {
            StringTokenizer tk3 = new StringTokenizer(br.readLine());

            int sum = 0 ;
            String x = Integer.parseInt(tk3.nextToken())+""+Integer.parseInt(tk3.nextToken());
            String y = Integer.parseInt(tk3.nextToken())+""+Integer.parseInt(tk3.nextToken());

            for (String k : map.keySet()
                 ) {
                if ((k.charAt(0)) >= (x.charAt(0))
                        && k.charAt(1) >= x.charAt(1)
                        && k.charAt(0) <= y.charAt(0)
                        && k.charAt(1) <= y.charAt(1)) {

                    sum += map.get(k);
                }
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
