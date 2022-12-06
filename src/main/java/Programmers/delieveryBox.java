package Programmers;

import java.util.*;

public class delieveryBox {

    public static int solution(int[] order, int answer) {
        Queue<Integer> orderBelt = new LinkedList<>();
        Stack<Integer> subBelt = new Stack<>();

        for (int i = 0; i < order.length; i++) {
            orderBelt.offer(order[i]);
        }

        int pickedBox = 0;
        for (int a = 0; a < orderBelt.size(); a++) {
//        for (Integer orderNum : orderBelt) {
            Integer orderNum = orderBelt.peek();
            System.out.println(orderNum);

            while (true) {
                // 작을 때
                if (orderNum < pickedBox) {
                    // 섭 벨트에 있을 때
                    if (!subBelt.isEmpty() && subBelt.peek() == orderNum) {
                        answer++;
                        pickedBox = subBelt.peek();
                        subBelt.pop();
                        break;
                    } else {
                        return answer;
                    }
                    // 클 때
                } else if (!orderBelt.isEmpty()) {
                    // 벨트에 있을 때
                    if (!orderBelt.isEmpty() && orderBelt.peek() == orderNum) {
                        answer++;
                        pickedBox = orderBelt.peek();
                        orderBelt.poll();
                        break;
                    } else {
                        subBelt.push(orderBelt.poll());
                    }
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        int answer = 0;
        int[] order = {4, 3, 1, 2, 5};

        int ans = solution(order, answer);


        System.out.println("ans : "+ans);
    }
}
