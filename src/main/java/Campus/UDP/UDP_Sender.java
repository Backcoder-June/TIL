package Campus.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDP_Sender {

    public static void main(String[] args) throws IOException {

        DatagramSocket sender = new DatagramSocket();
                            //보내는쪽에서는 포트번호를 지정할 필요가 없다. 랜덤포트자동으로 지정됨
        System.out.println("==발신 시작==");
//메세지보내는부분
        String message = "UDP에서 보내는 메세지 입니다.";
        byte[] message_byte = message.getBytes();
        DatagramPacket pack = new DatagramPacket(message_byte, message_byte.length, new InetSocketAddress("192.168.20.33", 15000));
                                            //data, 길이, 받는컴퓨터 ip/port
        sender.send(pack);
//위에걸 복붙해서 그대로 또 새로 보내야하는 것 ( ip port 등 보내줘야함 )






        sender.close();

        System.out.println("==발신 완료==");



    }
}
