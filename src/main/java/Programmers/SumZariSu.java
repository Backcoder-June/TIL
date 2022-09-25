package Programmers;

public class SumZariSu {
    public static void main(String[] args) {

        int n = 987;

        int answer = 0;

        String s = Integer.toString(n);

        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        System.out.println(answer);



    }
}
