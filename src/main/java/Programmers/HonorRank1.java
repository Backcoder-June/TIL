package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HonorRank1 {
    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];


            for(int i = 0; i < score.length; i++){
                List<Integer> scoreList = new ArrayList<>();
                for(int j = 0; j <= i; j++){
                    scoreList.add(score[j]);
                }

                Collections.sort(scoreList);

                if(i < k){
                    answer[i] = scoreList.get(0);
                }
                if(i >= k){
                    answer[i] = scoreList.get(i-k+1);
                }
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        Solution s1 = new Solution();

        int[] answer = s1.solution(3, score);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
