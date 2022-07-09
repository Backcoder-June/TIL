package CodingTest.Mathmetic;

import java.util.Scanner;

public class Math02_BeeHouse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N == 1){
            System.out.println(1);
        } else {
            for (long a = 1; true; a++) {
                if ((6 * (a * (a + 1)) / 2)+1 >= N) {
                    System.out.println(a + 1);
                    break;
                }
            }
        }
    }
}


/*for (long a = 1; true; a++) {
                if ((6 * (a * (a + 1)) / 2)+1 >= N) {
                    System.out.println(a + 1);
                    break;*/
