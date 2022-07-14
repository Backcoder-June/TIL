package CodingTest.Recursion;
import java.util.Scanner;

public class Recursion02_pibo {
    public static int pibo(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return pibo(n-2) + pibo(n-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pibo(n));


    }
}
