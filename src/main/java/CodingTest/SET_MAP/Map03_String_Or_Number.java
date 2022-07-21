package CodingTest.SET_MAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Map03_String_Or_Number {

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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();


        for(int i = 1; i <= N; i++) {
            String S = br.readLine();
            map1.put(i, S);
            map2.put(S, i);
        }


        for(int i = 0; i < M; i++) {
            String S = br.readLine();
            if(49 <= S.charAt(0) && S.charAt(0) <= 57) {
                System.out.println(map1.get(Integer.parseInt(S)));
            }else {System.out.println(map2.get(S));
            }
        }

    }

}




/*

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
}*/
