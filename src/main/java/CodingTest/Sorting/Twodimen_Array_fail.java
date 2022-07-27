package CodingTest.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Twodimen_Array_fail {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());


        //이거 x,y 연결이 아니라 따로따로다

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());

            x.add(Integer.parseInt(tk.nextToken()));
            y.add(Integer.parseInt(tk.nextToken()));
        }

        Collections.sort(x);
        Collections.sort(y);

         for (int j = 0; j < n; j++) {

            sb.append(x.get(j)).append(" ").append(y.get(j)).append("\n");
        }
        System.out.println(sb);
        }
    }