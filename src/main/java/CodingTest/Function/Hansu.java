package CodingTest.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i= 1; i<=N; i++) {
            if(i<100){
                count++;
            }else if (i<1000) {
                int a = i/100;
                int b = (i/10)%10;
                int c = i%10;
                if ((a-b) == (b-c)){
                    count++;}
            }else { }
        }
        System.out.println(count);
    }
}
