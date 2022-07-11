package CodingTest.Mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math04_math {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(tk.nextToken());
        int B = Integer.parseInt(tk.nextToken());
        int V = Integer.parseInt(tk.nextToken());

            System.out.println((int)(Math.ceil((V - B) /(double)(A - B))));
    }
}

//진짜 수학으로풀면 편하긴하네. 암산으로 너무 하려하지말자



/*
    int count = 0;
    int day = 0;
*/

/*while ( day  <  V) {
            day = day + (A-B);
            count++;
            if (day + A >= V){
                System.out.println((count+1));break;
            }
        }
*/











/*int count = (V - B) / (A - B);
        if ((V - B % (A - B) != 0)) {
            count++;

            System.out.println(count);
        }*/