package Campus.IO;

import java.io.IOException;

public class Keyboard {
    public static void main(String[] args) throws IOException {

        while (true) {
            int read = System.in.read();
            System.out.println(read + "" + (char)read);
            if (read == 10) {
                break;}

            // 키 1개 입력 - 유니코드 숫자로 리턴  //한글변환기능 X // 딱 한개만 입력 가능 //
            // 한글도 X // 99 도 못해 // => Scanner
// 엔터표현 '\n' 혹은 13 (유니코드)이거 10? //65대문자시작 //97소문자시작 // 48 '0' // 32 스페이스 //

        }
    }
}
