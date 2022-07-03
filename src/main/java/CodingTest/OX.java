package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String[] str = new String[T];

        for (int i = 0; i < T; i++) {

            str[i] = br.readLine();

            String[] xes = str[i].split("X");

            int count = 0;
            for (int j=0; j< xes.length; j++){

                count += ((xes[j].length())*((xes[j].length())+1))/2;
            }
            System.out.println(count);
            }
        }
        }


