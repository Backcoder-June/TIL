package CodingTest.IO_If_For_Array;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                int A = scanner.nextInt();
                int B = scanner.nextInt();
                int C = scanner.nextInt();


       if ( A==B && B==C){
           System.out.println(10000 + A*1000);
       }
       else if( A == B && B != C ){
           System.out.println(1000 + A*100);}
       else if( A == C && B != C ){
           System.out.println(1000 + A*100);}
       else if( C == B && A != C ){
           System.out.println(1000 + B*100);}
       else if( A != B && B != C){
                   if(A>=B && A>=C){
                       System.out.println(A*100);}
           else if(B>=A && B>=C){
               System.out.println(B*100);}
           else if(C>=B && C>=A){
               System.out.println(C*100);}
       }

    }
}
