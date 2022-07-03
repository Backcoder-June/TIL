package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Avgprintf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int[] test = new int[C];

        for (int i = 0; i < C; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(tk.nextToken());
            int[] grade = new int[N+1];
            int sum = 0;
            grade[0] = N;
            int count =0;

            for (int j =1; j<N+1; j++) {
                grade[j] = Integer.parseInt(tk.nextToken());
                sum += grade[j]; }

            double avg = (double) sum / N;

            for (int p = 1; p<N+1; p++){
            if(grade[p] > avg)
                count++; }

            System.out.printf("%.3f%%\n",(count/(double)N)*100);
        }
    }
}
