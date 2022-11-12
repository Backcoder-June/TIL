package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivideCard_Yaksu {
    class Solution {

        public List<Integer> getYaksuList(int[] arrayX){
            int minsqrt = (int)Math.sqrt(arrayX[0]);
            List<Integer> yaksuList = new ArrayList<>();
            for(int i = 1; i <= minsqrt; i++){
                if(arrayX[0]%i == 0){
                    yaksuList.add(i);
                    yaksuList.add(arrayX[0]/i);
                }
            }
            if(arrayX[0] == 1){
                yaksuList.add(1);
            }
            Collections.sort(yaksuList);
            return yaksuList;
        }

        public List<Integer> getCommonYaksuList(List<Integer> yaksuList, int[] arrayX){
            List<Integer> commonYaksuList = new ArrayList<>();
            for(int a = 0; a < yaksuList.size(); a++){
                int count = 0;
                for(int j = 1; j < arrayX.length; j++){
                    if(arrayX[j]%yaksuList.get(a)==0){
                        count++;
                    }
                }
                if(count == arrayX.length - 1){
                    commonYaksuList.add(yaksuList.get(a));
                }
            }
            return commonYaksuList;
        }

        public List<Integer> getFinalYaksuList(List<Integer> commonYaksuList, int[] arrayX){
            List<Integer> finalList = new ArrayList<>();
            for(int b = 0; b < commonYaksuList.size(); b++){
                int count = 0;
                for(int c = 0; c < arrayX.length; c++){
                    if(arrayX[c]%commonYaksuList.get(b) != 0){
                        count++;
                    }
                }
                if(count==arrayX.length){
                    finalList.add(commonYaksuList.get(b));
                }

                Collections.sort(finalList);
                Collections.reverse(finalList);
            }
            return finalList;
        }

        public List<Integer> sortingFinalsList(List<Integer> finalList,
                                               List<Integer> finalList2){
            List<Integer> sortingFinals = new ArrayList<>();

            if(finalList.size()==0){
                finalList.add(0);
            }
            if(finalList2.size()==0){
                finalList2.add(0);
            }

            sortingFinals.add(finalList.get(0));
            sortingFinals.add(finalList2.get(0));

            Collections.sort(sortingFinals);
            Collections.reverse(sortingFinals);

            return sortingFinals;
        }


        public int solution(int[] arrayA, int[] arrayB) {
            int answer = 0;

            List<Integer> yaksuList = getYaksuList(arrayA);
            List<Integer> commonYaksuList = getCommonYaksuList(yaksuList, arrayA);
            List<Integer> finalList = getFinalYaksuList(commonYaksuList, arrayB);

            List<Integer> yaksuList2 = getYaksuList(arrayB);
            List<Integer> commonYaksuList2 = getCommonYaksuList(yaksuList2, arrayB);
            List<Integer> finalList2 = getFinalYaksuList(commonYaksuList2, arrayA);

            List<Integer> sortedAnswer = sortingFinalsList(finalList, finalList2);

            return sortedAnswer.get(0);
        }
    }


}
