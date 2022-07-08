package Campus.ChattingBot;


import java.io.*;
import java.util.Scanner;

class ChatList{
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



public class ChatBot {
    public static void main(String[] args) throws IOException {
       ChatList list = new ChatList();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("chat_user.txt", true));

        while (true) {
            System.out.print(list);

            int menu = Integer.parseInt(br.readLine());

            if (menu == 5) {
                System.out.println("이용해주셔서 감사합니다!");
                System.exit(0);   //프로그램 main 중단.
            } else if (menu == 1) {
                System.out.println("회원가입 화면 페이지 입니다.");
                System.out.print("ID : ");
                String id = br.readLine();

                bw.write(id);
                bw.write(" ");

                System.out.print("PW : ");
                String pw = br.readLine();

                bw.write(pw);
                bw.write("\n");

                bw.flush();

            } else if (menu == 2) {
                System.out.println("로그인 화면 이동");
                System.out.print("ID : ");
                String id = br.readLine();

                System.out.print("PW : ");
                String pw = br.readLine();

                FileReader fr2 = new FileReader("chat_user.txt");
                Scanner sc = new Scanner(fr2);

                while (sc.hasNextLine()){
                    String s = sc.nextLine();
                    if ( s.equalsIgnoreCase(id+" "+pw)){
                        System.out.println("로그인 되었습니다.");break;
                    }else if(!(sc.hasNextLine())){
                        System.out.println("잘못된 로그인 정보입니다.");
                    }
                }
            } else if (menu == 3) {
                System.out.println("장바구니");
            } else if (menu == 4) {
                System.out.println("상품 리스트 화면 이동");
            }
        }
    }
}
