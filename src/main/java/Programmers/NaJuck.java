package Programmers;

public class NaJuck {
    public static void main(String[] args) {

        int answer = 0 ;

        int[] a = {-1, 0, 1};
        int[] b = {1, 0, -1};

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);
    }
}
