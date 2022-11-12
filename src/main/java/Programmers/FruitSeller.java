package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitSeller {
    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            List<Integer> scoreList = new ArrayList<>();
            for(int i = 0; i < score.length; i++){
                scoreList.add(score[i]);
            }

            Collections.sort(scoreList);
            Collections.reverse(scoreList);
            // reverse 해서 정렬해두면, box 개수만큼 돌릴 때, 낮은 score 부분을 버릴 수 있다.

            int box = score.length / m;
            int indexBym = m;
            for(int j = 0; j < box; j++){
                answer += scoreList.get(indexBym-1);
                indexBym += m;
            }
            return answer * m;

        }
    }
}
