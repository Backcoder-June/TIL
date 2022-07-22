package CodingTest.SET_MAP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Set06_RetainAll {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            A.add(Integer.parseInt(tk.nextToken()));
        }

        tk = new StringTokenizer(br.readLine());
        for (int j = 0; j < b; j++) {
            B.add(Integer.parseInt(tk.nextToken()));
        }

        int x = A.size();
        int y = B.size();

        A.retainAll(B);
        int z = A.size();



        System.out.println(x+y-2*z);

    }
}