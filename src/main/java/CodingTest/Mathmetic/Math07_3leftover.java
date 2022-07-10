package CodingTest.Mathmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math07_3leftover {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    if (N % 5 == 0) {
        System.out.println(N / 5);
    } else if ((N % 5) % 3 == 0) {
        System.out.println(N / 5 + (N % 5) / 3);
    } else if (N % 5 == 1) {
            System.out.println(N/5 + 2 -1 );
        } else if (N == 4){
            System.out.println(-1);
        } else if (N % 5 == 4) {
            System.out.println(N/5 + 3 -1 );
        } else if (N == 7){
            System.out.println(-1);
        } else if (N % 5 == 2) {
            System.out.println(N/5 + 4 -2 );
        } else if (N % 3 == 0) {
            System.out.println(N / 3);
        }else {
            System.out.println(-1);}
}

    }



//13 16 19 //17
//58  -3  //  16 -6 // 19 // -9 //
