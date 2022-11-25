package Programmers;

import java.util.*;

public class tangerinePick {
    public static void main(String[] args) {

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int answer = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < tangerine.length; i++){
            if(map.get(tangerine[i])==null){
                map.put(tangerine[i], 0);
            }
            map.put(tangerine[i], map.get(tangerine[i]) + 1);
        }

        List<Integer> tanNumList = new ArrayList<>();
        for(Integer tanNum : map.values()){
            tanNumList.add(tanNum);
        }

        Collections.sort(tanNumList);
        Collections.reverse(tanNumList);

        int tanNumSum = 0;
        while(tanNumSum < k){
            tanNumSum += tanNumList.get(answer);
            answer++;
        }
        System.out.println(answer);
    }
}
