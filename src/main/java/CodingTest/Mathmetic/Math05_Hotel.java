package CodingTest.Mathmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math05_Hotel {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i<T; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(tk.nextToken());
            int W = Integer.parseInt(tk.nextToken());
            int N = Integer.parseInt(tk.nextToken());

            int room = 0;

                if (H == 1){
                    room = 100 + N;
                }
                else if (N > H) {
                    if (N % H == 0) {
                        room = (H) * 100 + (N / H);
                    } else {
                        room = (N % H) * 100 + ((N / H) + 1);
                    }
                } else if (N <= H) {
                    room = N * 100 + 1;
                }
            System.out.println(room);
        }

    }
}