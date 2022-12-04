package Programmers;

public class CenterofString {
    public static void main(String[] args) {
        String s = "qwer";
        String answer = "";

        if (s.length() % 2 != 0) {
            answer = String.valueOf(s.charAt(s.length() / 2 ));
        }else {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }

        System.out.println(answer);
    }
}
