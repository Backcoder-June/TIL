package CodingTest.Mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math06_Double_Array {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());



        for (int a = 0; a<T; a++) {

        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());



        int[][] s = new int[15][15];

        for (int i = 0; i<15; i++) {

            s[i][1] = 1;
            s[0][i] = i;
        }

            for (int i = 1; i < 15; i++) {

                for (int j = 2; j < 15; j++) {

                    s[i][j] = s[i][j - 1] + s[i - 1][j];
                }
            }

            System.out.println(s[k][n]);
        }
    }
}



        //10
/*

        int[] s = new int[n];
        for (int a = 0; a <n; a++){
            s[a] = a+1; }

        // k 번째 n 번째수는 => k번째 n-1 번째수 + k-1번째 n번째수

        // s[n] = s[n-1] +
        int target =0;

//        target =

        int newtarget = 0;
            for (int a = 1; a < n; a++) {
                s[0] = 1;
                target = target + s[a];
                newtarget = target;
                s[a] = newtarget;
            }
        System.out.println(s[n-1]);



        // k =1 / n => for(int i =0; i<n; i++){
        //                      s = s[i];}
        //
        // k =2 / n => for(int i =0; i<n; i++){
        //                      t = s[i];}



*/




