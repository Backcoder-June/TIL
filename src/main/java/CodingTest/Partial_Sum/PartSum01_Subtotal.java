package CodingTest.Partial_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PartSum01_Subtotal {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        StringTokenizer tk1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk1.nextToken());
        int m = Integer.parseInt(tk1.nextToken());

        int[] arr = new int[n + 1];

        StringTokenizer tk2 = new StringTokenizer(br.readLine());
        for (int a = 1; a <= n; a++) {
            arr[a] = arr[a - 1] + Integer.parseInt(tk2.nextToken());
        }

        for (int b = 0; b < m; b++) {
            StringTokenizer tk3 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(tk3.nextToken());
            int j = Integer.parseInt(tk3.nextToken());

            // 5 4 3 2 1
            // 0 5 9 12 14 15
            // 3~5
            //

            sb.append((arr[j] - arr[i - 1])+"\n");
        }

        System.out.println(sb);
    }
}