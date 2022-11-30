package Programmers;

public class Coke {
    class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            int bottle = n;
            while (bottle > 0) {
                int left = 0;
                if (bottle % a != 0) {
                    left += bottle % a;
                }
                bottle = bottle / a * b;
                answer += bottle;
                bottle += left;
            }

            return answer;
        }
    }
}