package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycle1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int oldN = N ;
        int count = 0;
        while (true){
            count++;
            oldN = ((oldN % 10) * 10) + ((oldN%10)+(oldN / 10))%10 ;
            if ( oldN == N){break;}   }
        System.out.println(count);
    }
}

// 리펙토링의 중요성//

// Copy ( 최초값이랑 비교하기 위해선 최초값은 두고, Copy 데이터를 하나 만들어서 그거로 비교하면 됨 )

//        int a = oldN / 10;  // 10 의자리
//        int b = oldN % 10;  // 1 의자리

/*

        while (true) {
            count += 1;
            int newN = 0;
            if (oldN < 10) {
                newN = (oldN * 10 + oldN);
            } else {
                if ((a + b) < 10) {
                    newN = (b * 10) + (a + b);
                } else if ((a + b) >= 10) {
                    newN = (b * 10) + (a + b - 10);
                }
            }
*/

/*
            if ( N == newN){
                System.out.println(count); break;}
            else { oldN = newN;
                a = oldN / 10;
                b = oldN %  10;
            }
        }

*/




        // 10  1 + 0 = 1  => 1 /
        // 1   0 + 1 = 1  => 11/
        // 11  1 + 1 = 2  =? 12 /
        // 12  1 + 2 = 3 =>  23/
        // 23  2 + 3 = 5 =>  35/
        // 35  3 + 5 = 8 =?  58/
        // 58  5 + 8 = 13 =>  83/
        // 83  8 + 3 = 11 =>  31/
        // 31  3 + 1 =  4 =>  14/
        // 14  1 + 4 =  5 => 45/
        // 45  4 + 5 = 9 =? 59
        // 59  5 + 9 = 14 =? 94







