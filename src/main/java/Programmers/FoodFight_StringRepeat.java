package Programmers;

public class FoodFight_StringRepeat {
    class Solution {
        public String solution(int[] food) {
            for(int i = 1; i < food.length; i++){
                if(food[i]%2 != 0){
                    food[i] -= 1;
                }
            }
            String result = "";
            for(int j = 1; j < food.length; j++){
                result += String.valueOf(j).repeat(food[j]/2);
            }
            result += "0";
            for(int a = food.length-1; a > 0; a--){
                result += String.valueOf(a).repeat(food[a]/2);
            }
            return result;
        }
    }
}
