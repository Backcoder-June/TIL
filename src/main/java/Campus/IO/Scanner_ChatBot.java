package Campus.IO;

import java.io.*;
import java.util.Scanner;

class MenuList{
    private final String join01 = "1. 회원가입";
    private final String login02 = "2. 로그인";
    private final String cart03 = "3. 장바구니";
    private final String shop04 = "4. 쇼핑하기";
    private final String exit05 = "5. 종료";

    private final String guide = "원하는 작업의 종료를 입력하세요 : ";

    @Override
    public String toString() {
        return join01 +"\n" + login02 +"\n" + cart03 +"\n" + shop04 +"\n" + exit05 + "\n" + guide;
    }
}



public class Scanner_ChatBot {
    public static void main(String[] args) throws IOException {

        //이걸 좀 발전시키면 웹사이트에 있는 자동챗봇 기능이 구현할 수 있겠다!

        MenuList menuList = new MenuList();


        Scanner scanner = new Scanner(System.in);

        FileOutputStream fo = new FileOutputStream("user.txt", true);


        while (true) {
            System.out.print(menuList);

            int menu = scanner.nextInt();

            if (menu == 5) {
                System.out.println("이용해주셔서 감사합니다!");
                System.exit(0);   //프로그램 main 중단. //반복문에선 break 로 해도 이 반복문만 종료
            } else if (menu == 1) {
                System.out.println("회원가입 화면 페이지 입니다.");
                // id :    //사용자입력
                // pw :
                System.out.print("ID : ");
                String id = scanner.next();

                char[] idch = new char[id.length()];
                for (int i = 0; i < id.length(); i++){
                    idch[i] = id.charAt(i);
                    fo.write(idch[i]);}

                fo.write(32);            //공백주기

                System.out.print("PW : ");
                String pw = scanner.next();

                char[] pwch = new char[pw.length()];
                for (int i = 0; i < pw.length(); i++){
                    pwch[i] = pw.charAt(i);
                    fo.write(pwch[i]);}
                fo.write(13);



                fo.close();
                //user.txt 에 회원 정보 저장 / 한줄에 하나씩
            } else if (menu == 2) {
                System.out.println("로그인 화면 이동");
                System.out.print("ID : ");
                String id = scanner.next();

                System.out.print("PW : ");
                String pw = scanner.next();

                FileReader fr2 = new FileReader("user.txt");
                Scanner sc = new Scanner(fr2);

                while (sc.hasNextLine()){
                    String s = sc.nextLine();

                    if ( s.equalsIgnoreCase(id+" "+pw)){
                        System.out.println(id + "님, 로그인 되었습니다.");break;
                    }else if(!(sc.hasNextLine())){
                        System.out.println("잘못된 로그인 정보입니다.");
                    }
                }

                fr2.close();
                sc.close();





                // 회원 로그인 시도
                // id pw 입력
                // user.txt 에서 조회
                // 로그인 성공 / 실패 출력

            } else if (menu == 3) {
                System.out.println("장바구니 화면 이동");
            } else if (menu == 4) {
                System.out.println("상품 리스트 화면 이동");
            }
        }


    }
}
