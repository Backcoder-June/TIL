package Programmers;

import java.util.HashMap;

public class Int_words {

    public static void main(String[] args) {


        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("zero",0);
        map1.put("one",1);
        map1.put("two",2);
        map1.put("three",3);
        map1.put("four",4);
        map1.put("five",5);
        map1.put("six",6);
        map1.put("seven",7);
        map1.put("eight",8);
        map1.put("nine",9);

        String s = "one4seveneight";


        for (String k : map1.keySet()
             ) {
            if (s.contains(k)) {
                s= s.replace(k, String.valueOf(map1.get(k)));
            }
        }

        int answer = Integer.parseInt(s);
        System.out.println(answer);
//
    }
}

// 이거 replceAll 도 사용할 수 있다.
// 배열 순서 맞춰서 0~9까지 순서맞춰 replaceAll 한방에
