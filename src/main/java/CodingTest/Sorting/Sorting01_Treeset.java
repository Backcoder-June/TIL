package CodingTest.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Sorting01_Treeset {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        TreeSet<Integer> sorting = new TreeSet();

        for (int a = 0; a<n; a++) {
            sorting.add(Integer.parseInt(br.readLine()));
        }
        for (Integer a:sorting
             ) {
            System.out.println(a); }
    }
}