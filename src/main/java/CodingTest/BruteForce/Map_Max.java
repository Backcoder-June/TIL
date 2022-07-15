package CodingTest.BruteForce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        Map<Integer, Integer> map = new HashMap<>();


        for (int a = 0; a < n; a++) {

            map.put(sc.nextInt(), sc.nextInt());
        }

        int wmax = 0;
        int hmax = 0;

        for (Integer weight: map.keySet()
             ) {

            if (weight > wmax) {

                wmax = weight;

                hmax = map.get(wmax);

            }
        }

        System.out.println(wmax + " " + hmax);



    }
}
