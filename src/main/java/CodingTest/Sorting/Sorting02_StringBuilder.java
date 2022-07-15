package CodingTest.Sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting02_StringBuilder {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> sorting = new ArrayList<>();

        for (int a = 0; a<n; a++) {
            sorting.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(sorting);

        for (Integer a:sorting
        ) {
            sb.append(a).append('\n');
        }
        System.out.println(sb);
    }
}