package Campus.Net.Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TCP_Client {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.20.33", 10000);
        System.out.println("연결됬을 때 ip 정보 : "+s.getInetAddress().getHostAddress());

        //for(int j = 0; j <3; j++){ 여기서 반복문 으로 여러번보낼수 있다.
        // 근데 서버에서는 한번만 받게 설정해뒀으면 noSuchElementException
        // 서버에서도 while hasnext 로 반복문 해놓는거지
        for (int j = 0; j<3; j++) {
            String message = "I WANNA LOGIN To 멀티!!\n";

            byte[] message_Byte = message.getBytes();   //String 을 Byte로 바꿔야 소켓으로 보낼 수 있다.

            OutputStream o = s.getOutputStream();
            o.write(message_Byte);

            System.out.println("Server에 보내는 메세지 :  " + message);

            InputStream i = s.getInputStream();
            Scanner sc = new Scanner(i);

            String fromServer = sc.next();

            System.out.println("서버응답 : " + fromServer);
        }


        s.close();
        System.out.println("연결종료후 ip 정보 : "+s.getInetAddress().getHostAddress());






    }
}
