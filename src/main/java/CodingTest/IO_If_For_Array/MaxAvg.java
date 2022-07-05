package CodingTest.IO_If_For_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxAvg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer tk = new StringTokenizer(br.readLine());

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (Integer.parseInt(tk.nextToken()));
        }
        Arrays.sort(array);
        int Max = array[N-1];

        double sum = 0;
        for (int j = 0; j < N; j++) {
            sum += array[j] / (double)Max * 100;
        }

        System.out.println(sum/N);

    }
}
