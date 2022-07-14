package CodingTest.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sangsungza {
    public static void main(String[] args) throws IOException {

        // 몇자리 수가 들어와도, 자기값에 각자리수 더한 수 구할 수 있게.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int m = Integer.parseInt(n);

        int div = (int)(Math.pow(10, (n.length() - 1)));

        int sum = m + m/div;
        for (int a = 0; a < (n.length())-1; a++) {

            sum += ( (m % (div / (int) (Math.pow(10, a)))) / ((int) (Math.pow(10, (n.length()-2 - a)))) );

        }

        System.out.println(sum);
    }
}

//89877
//5
//n / div
// (n%div)/1000
// (n%(div/10)/100
// (n%(div/100)/10
// (n%(div/1000)/1
