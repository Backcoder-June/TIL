package Programmers;

import java.util.HashMap;

public class EnglishWordRelay {
    public static void main(String[] args) {

        int[] answer = {0,0};
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (i != 0) {

                if (map.containsKey(words[i]) || words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)) {
                    if((i+1)%n==0) {
                        answer[0] = n;
                        answer[1] = (i+1)/n;
                    }else {
                        answer[0] = (i+1)%n;
                        answer[1] = (i+1)/n+1;
                    }
                    System.out.println(answer[0] +"번, " + answer[1] +"번째턴");
                }
            }
            map.put(words[i], 1);
        }
        System.out.println(answer[0] +"번, " + answer[1] +"번째턴");
    }
}
