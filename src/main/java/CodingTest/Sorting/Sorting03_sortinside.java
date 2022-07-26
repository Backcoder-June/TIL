package CodingTest.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting03_sortinside {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int m = Integer.parseInt(n);

        int[] list = new int[n.length()];

        for (int i = 0; i < n.length(); i++) {

            list[i] = m%10;
            m = m/10;
        }

        Arrays.sort(list);

        for (int j = n.length()-1; j >=0; j--) {
            System.out.print(list[j]);
        }
        }

    }