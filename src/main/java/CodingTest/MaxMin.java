package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer tk = new StringTokenizer(br.readLine());

        // 배열안쓰고 풀기
        int Max = -1000001;
        int Min = 1000001;

        while (tk.hasMoreTokens()){
            int val = Integer.parseInt(tk.nextToken());                 // val 생성이 매번 반복문안에서 새로 생성되어야 함
            if (val>Max){ Max = val; }
            if (val<Min){ Min = val; }
        }

        System.out.println(Min + " " + Max);
    }
}


//배열로 풀기

        /*int[] array = new int[T];

        for (int i = 0; i<T; i++){
            array[i] = Integer.parseInt(tk.nextToken());
        }
        br.close();
        Arrays.sort(array);
        System.out.println(array[0]+" "+array[T-1]);*/
