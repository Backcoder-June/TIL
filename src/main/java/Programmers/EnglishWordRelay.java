package Programmers;

import java.util.HashMap;

public class EnglishWordRelay {
    public static void main(String[] args) {

        int[] answer = {};
        int n = 5;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        HashMap<Integer, String> map = new HashMap<>();

        int check = 0;
        for (int i = 0; i < words.length; i++) {
            map.put(i, words[i]);

            if (map.containsValue(words[i])) {
                check = i;
            }
        }
        System.out.println(check);
        if (check == 0) {
            answer = new int[]{0, 0};
        }else {
            if ((check + 1) % n == 0) {
                answer = new int[]{(check + 1) / n, (check + 1) / n};
            } else {
                answer = new int[]{(check + 1) / n + 1, (check + 1) % n};
            }
        }

        System.out.println(answer[0] + ": " + answer[1]);




    }
}
