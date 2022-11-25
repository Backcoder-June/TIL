package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCakeCutting {
    public static int solution(int[] topping) {
        int length = topping.length;

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        set.add(topping[0]);
        for (int i = 1; i < length; i++) {
            int number = topping[i];
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int answer = 0;
        for (int i = 1; i < length; i++) {
            int number = topping[i];

            set.add(number);

            int numberSize = map.get(number);
            if (numberSize == 1) {
                map.remove(number);
            } else {
                map.put(number, numberSize - 1);
            }

            if (set.size() == map.size()) {
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        RollCakeCutting.solution(topping);
        }
    }
