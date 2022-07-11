package Campus.Net.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCP_Server {
    public static void main(String[] args) throws IOException {

        try {
            ServerSocket ss = new ServerSocket(10000);   //서버 시작 - 서버소켓생성
            System.out.println("Port : 10000");

            while (true) {                                  //클라 들어올때마다 반복 - 서버유지
                Socket s = ss.accept();   // 클라 받아들이고 그 연결고리 소켓 만듬

                System.out.println("client info : " + s.getInetAddress().getHostAddress());
                                        //클라 소켓을 통해 클라 정보 가져오기

//                byte b[] = new byte[];  원래는 byte 배열 생성해서 그 배열을 읽게 만들어야한다.
                // 몇글자 제한 할때는 여기서 길이 정해놓으면 됨.
                // 근데 Scanner 쓰면 배열 생성안하고 바로 가능/ 제한X

                InputStream i = s.getInputStream();
                Scanner sc = new Scanner(i);

                while (sc.hasNextLine()) {
                    String fromClient = sc.nextLine();
                    System.out.println("fromclient : " + fromClient);

                    String reply = "로그인\n";

                    OutputStream o = s.getOutputStream();
                    o.write(reply.getBytes());

                }
                s.close();              //클라랑 연결 종료
                System.out.println("close : " + s.getInetAddress().getHostAddress());
            }
        } catch (Exception e) { e.printStackTrace(); }


    }
}
