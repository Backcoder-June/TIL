package Programmers;

import java.util.Stack;

public class delieveryBox2 {
        public static int solution(int[] order, int answer) {
            Stack<Integer> orderList = new Stack<>();

            int defaultOrder = 1;
            int index = 0;

            while (true) {
                // sub컨테이너와 일치 시
                if (!orderList.isEmpty() && order[index] == orderList.peek()) {
                    answer++;
                    index++;
                    orderList.pop();
                    continue;
                }

                // 기본 index 순서 만큼만 while 문 적용
                if (defaultOrder > order.length) {
                    break;
                }

                // 기본 순서와 일치 시
                if (order[index] == defaultOrder) {
                    answer++;

                    index++;
                    defaultOrder++;

                // 불일치 시, push
                } else {
                    orderList.push(defaultOrder);
                    defaultOrder++;
                }
            }
            return answer;
        }

    public static void main(String[] args) {
            int answer = 0;
            int[] order = {5, 4, 3, 2, 1};

        int ans = solution(order, answer);

        System.out.println(ans);

    }
}
