package Campus.UDP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Login_Client1 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.20.33", 12000);
        System.out.println("==서버와 연결되었습니다.==");

        Scanner userinput = new Scanner(System.in);

        System.out.println("ID 입력");
        String id = userinput.nextLine();
        System.out.println("PW 입력");
        String pw = userinput.next();


        OutputStream out = socket.getOutputStream();

        out.write((id+"\n").getBytes());                      //이거 \n 하고안하고가 성패다
        out.write((pw+"\n").getBytes());
//        out.close();

        // 입력값 보내기 완료


        Scanner input = new Scanner(socket.getInputStream());
        String fromserver = input.nextLine();
        System.out.println("서버대답 : " + fromserver);

        socket.close();
        out.close();
        System.out.println("==서버와 연결이 해제되었습니다.");


    }
}
