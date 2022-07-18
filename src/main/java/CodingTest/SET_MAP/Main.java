package CodingTest.SET_MAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static boolean isStirngNumber(String s){
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, br.readLine());
        }


        BufferedReader br2;
        for (int j = 0; j < m; j++) {

           br2 = new BufferedReader(new InputStreamReader(System.in));


            for (Integer k : map.keySet()
            ) {
                if ( isStirngNumber(br2.readLine())){
                System.out.println(map.get(Integer.parseInt(br2.readLine())));
                }
                else if((br2.readLine()).equals(map.get(k))) {
                    System.out.println(k + 1);
                }
            }


        }





    }
}