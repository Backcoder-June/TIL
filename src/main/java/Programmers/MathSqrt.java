package Programmers;

public class MathSqrt {
    public static void main(String[] args) {
        int n = 144;
        if (Math.sqrt(n) % 1 != 0) {
            System.out.println(2);
            System.out.println(Math.sqrt(n) % 1);
        }

        if (Math.sqrt(n) % 1 == 0) {
            System.out.println(1);
        }
    }
}
