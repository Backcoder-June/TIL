package CodingTest.Partial_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PartSum01_brutal {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        StringTokenizer tk1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk1.nextToken());
        int m = Integer.parseInt(tk1.nextToken());

        int[] array = new int[n];


        StringTokenizer tk2 = new StringTokenizer(br.readLine());
        for (int c = 0; c<n; c++) {
            array[c] = Integer.parseInt(tk2.nextToken());
        }


        for (int d = 0; d<m; d++) {
            StringTokenizer tk3 = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(tk3.nextToken());
            int j = Integer.parseInt(tk3.nextToken());

            int sum = 0;
            for (int a = i - 1; a < j; a++) {

                sum += array[a];
            }
            sb.append(sum+"\n");


        }

        System.out.println(sb);

    }
}