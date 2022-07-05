package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_04_Tokenizer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int a = 0; a<T; a++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(tk.nextToken());
            String S = tk.nextToken();

            for (int i = 0; i < S.length(); i++) {

                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
