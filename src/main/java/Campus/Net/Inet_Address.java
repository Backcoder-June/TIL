package Campus.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet_Address {
    public static void main(String[] args) {


        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("ip : " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


        try {
            InetAddress[] hostinfo = InetAddress.getAllByName("www.naver.com");

            for (InetAddress infolist : hostinfo
                 ) {
                System.out.println(infolist.getHostAddress());
            }

        } catch (UnknownHostException e) {

        }


    }
}
