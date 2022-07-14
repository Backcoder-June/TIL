package CodingTest.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class force01_blackjack {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());

        int[] card = new int[n];

        StringTokenizer tk2 = new StringTokenizer(br.readLine());

        for (int a = 0; a < n; a++) {
            card[a] = Integer.parseInt(tk2.nextToken());
        }

        int max = 9;
        for (int i = 0; i < card.length; i++) {

            for (int j = i + 1; j < card.length; j++) {

                for (int x = j + 1; x < card.length; x++) {

                    int sum = card[i] + card[j] + card[x];

                    if (sum>m){ continue; }
                    else {
                        if (sum > max) {
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}