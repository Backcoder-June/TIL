package Campus.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP_Receiver {

    public static void main(String[] args) throws IOException {
// 소켓 => 받기만 한다.

        // 반복해서 받을때도, 매번 전송할때마다 이 포트로 다시 받는것이기 때문에,
        // 따로 반복문을 생성하지 않아도 된다.
        DatagramSocket receiver = new DatagramSocket(15000);

        System.out.println("==소켓 포트생성완료 수신시작==");

        byte[] receive_byte = new byte[100];        //100byte 정도만 받겠다.

        DatagramPacket pack = new DatagramPacket(receive_byte, receive_byte.length);
                                    // 받아온 바이트데이터 , 얼마만큼-보통길이만큼

        receiver.receive(pack);       // 소켓으로 받아오기 => 패킷에 있는걸 receive 해와라

        // .getByte( ) 로 String => Byte 했다면,
        // Receive 할때는 꺼꾸로 해서 String 으로 바꿔야함 => getData 메소드(패킷)

        String receive_str = new String(pack.getData(), 0 , pack.getLength());
        //String 생성자로 받음

        System.out.println(receive_str);
        receiver.close();








    }
}
