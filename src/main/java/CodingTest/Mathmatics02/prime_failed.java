package CodingTest.Mathmatics02;
import java.io.*;
import java.util.*;
public class prime_failed {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tk = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(tk.nextToken());
        int N = Integer.parseInt(tk.nextToken());



        for (int a = M; a <= N; a++) {
            int count = 0;
            for (int i = 1; i <= a; i++) {

                if (a % i == 0) {
                    count++;}
            }

            if (count == 2) {
                System.out.println(a);
            }
        }
    }
}



 // 소수 나왔을 때 쓰는 기술이니 완벽하게 이해 안가더라도
  // 눈에 익혀두고 흐름을 이해해두자
        /*

        boolean arr[] = new boolean[N+1];
        arr[0] = true;
        arr[1] = true;

        int i;

        int sqrt = (int) Math.sqrt(N);
        for(i=2; i<=sqrt; i++) {

            for(int j=2; j<=N/i; j++) {
                if(arr[i*j] == true) {
                    continue;
                }
                else  {
                    arr[i*j] = true;
                }
            }
        }

        for(i=M; i<=N; i++) {
            if(arr[i] == false) {
                System.out.println(i);
            }
*/





