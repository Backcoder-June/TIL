package Programmers;

public class subaksubak {
    public static void main(String[] args) {

        int n = 1;
        String answer = "수박";


        if (n % 2 == 0) {
            answer = answer.repeat(n/2);
        } else {
            answer = answer.repeat((n+1) / 2).substring(0, answer.repeat((n+1) / 2).length() - 1);

        }

        System.out.println(answer);










    }
}
