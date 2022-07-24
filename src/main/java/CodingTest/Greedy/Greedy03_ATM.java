package CodingTest.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Greedy03_ATM {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer tk = new StringTokenizer(br.readLine());


        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(tk.nextToken()));
        }

        Collections.sort(list);


        int sum = 0;
        int supersum = 0;
        for (int j = 0; j < n; j++) {
            sum += list.get(j);
            supersum = supersum + sum;
        }
        System.out.println(supersum);
    }
}