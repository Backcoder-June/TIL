package Programmers;

public class xyComma {
    static int getMaxY(int x, int d){
        int maxY = (int)(Math.sqrt((long) Math.pow(d, 2)-(long) Math.pow(x, 2)));
        return maxY;
    }

    static int getYNum(int maxY, int k){
        int yNum = (maxY/k);
        return yNum+1;
    }

    public static void main(String[] args) {
        long answer = 0;
        int k = 1;
        int d = 5;

        for(int i=0; i<=d; i+=k){
            int maxY = getMaxY(i, d);
            int yNum = getYNum(maxY, k);
            answer += yNum;
        }
        System.out.println(answer);
    }
}
