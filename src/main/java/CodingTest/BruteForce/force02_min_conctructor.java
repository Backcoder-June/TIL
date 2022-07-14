package CodingTest.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class force02_min_conctructor {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int m = Integer.parseInt(n);

        int div = (int)(Math.pow(10, (n.length() - 1)));



        int count = 0;
            for (int a = 1; a <= m; a++) {
                int sum2 = a + a / div;
                for (int b = 0; b < (n.length()) - 1; b++) {

                    sum2 += ((a % (div / (int) (Math.pow(10, b)))) / ((int) (Math.pow(10, (n.length() - 2 - b)))));
                }


                if (m == sum2) {
                    count++;
                    System.out.println(a);break;
                }
            }
        if (count == 0) {
            System.out.println(0);
        }
        }
    }


//89877
//5
//n / div
// (n%div)/1000
// (n%(div/10)/100
// (n%(div/100)/10
// (n%(div/1000)/1
/*

        int sum = m + m/div;
        for (int a = 0; a < (n.length())-1; a++) {

            sum += ( (m % (div / (int) (Math.pow(10, a)))) / ((int) (Math.pow(10, (n.length()-2 -a)))) );

        }
*/
