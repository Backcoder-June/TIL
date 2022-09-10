package Programmers;

public class crypNum {
    public static void main(String[] args) {


        String phonenum = "01033334444";
        String answer = "";

        String show = phonenum.substring(phonenum.length() - 4);
        String cryp = phonenum.substring(0, phonenum.length() - 4);

        answer = "*".repeat(cryp.length()) + show;

        System.out.println(answer);

        // regEX
        //return phone_number.replaceAll(".(?=.{4})", "*");
        // replaceAll("regEX 로 repalce할 문자열 선택", *로 replace )
        // 임의의문자열 . 을 * 로 모두 replace
        // (?= X )뒤에서부터 X 문자열은 제외하겠다.
        // .{4} 임의의문자열 4자리




    }
}
