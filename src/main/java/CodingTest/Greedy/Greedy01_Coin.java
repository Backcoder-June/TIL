package CodingTest.Greedy;

import java.util.Scanner;

public class Greedy01_Coin {
        public static void main(String[] args) {

            int coin = 0;
            int sum = 0;
            int coin_sum = 0;
            int min = 0;

            Scanner sc = new Scanner(System.in);

            coin = sc.nextInt();
            sum = sc.nextInt();

            int [] coinArr = new int [coin];

            for(int i=0;i<coin;i++) {
                coinArr[i] = sc.nextInt();
            }

            for(int i=coinArr.length-1;i>=0;i--) {
                while(true) {
                    if(coin_sum+coinArr[i] <= sum) {
                        coin_sum += coinArr[i];
                        min++;
                    }
                    else {
                        break;
                    }
                }
            }
            System.out.println(min);
            sc.close();
        }
}
