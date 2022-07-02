package CodingTest;

import java.io.*;
import java.util.StringTokenizer;

public class TokenImportant {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tk.nextToken());
        int X = Integer.parseInt(tk.nextToken());

        StringTokenizer tk2 = new StringTokenizer(br.readLine());

        int[] A = new int[N];

        for (int b = 0; b < N; b++) {
//            StringTokenizer tk2 = new StringTokenizer(br.readLine());

            A[b] = Integer.parseInt(tk2.nextToken());
        }

        for (int b = 0; b < N; b++) {
            if (A[b] < X) {
                bw.write(A[b] + " "); }
        }

        bw.flush();
        bw.close();
        br.close();



    }
}
