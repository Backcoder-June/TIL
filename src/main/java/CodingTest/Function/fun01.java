package CodingTest.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fun01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        class Test{
            long sum(int[] a){
                a = new int[n];
                long sum = 0;
                for (int i = 0; i<a.length; i++){
                    sum += a[i];
                }
                return sum;
            }
        }



    }
}
