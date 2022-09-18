package Programmers;

public class Avg {
    public static void main(String[] args) {
        int[] arr = {5,5};
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(answer/arr.length);
    }
}
