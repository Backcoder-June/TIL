package CodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String08_justread_nocharat {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        // String 으로 받아올게아니라, 읽어올때 char 으로 하나씩 읽어오게 그냥 system.in.read 하고 반복문 걸어서 그때그때 값을 주는면 굳이charAt을 안해도 되겠구나


        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if ((int) s.charAt(i) >= 65 + j * 3 && (int) s.charAt(i) <= 67 + j * 3) {
                    count += 3 + (j);
                }
            }
            // 만약에 쭉 3개씩 끊었으면 이 반복문 하나로 끝낼 수 있었는데.
            if ((int) s.charAt(i) >= 65 + 15 && (int) s.charAt(i) <= 67 + 15 + 1) {
                count += 3 + (5);
            }
            if ((int) s.charAt(i) >= 65 + 15 + 1 + 3 && (int) s.charAt(i) <= 67 + 15 + 1 + 3) {
                count += 3 + (6);
            }
            if ((int) s.charAt(i) >= 65 + 15 + 4 + 3 && (int) s.charAt(i) <= 67 + 15 + 4 + 4) {
                count += 3 + (7);
            }
            if (s.contains("OPERATOR")) {
                count += 11;
            }
        }
        System.out.println(count);
    }
}