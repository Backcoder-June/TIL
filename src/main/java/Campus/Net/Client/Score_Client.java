package Campus.Net.Client;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Score_Client {
    public static void main(String[] args) throws IOException {


        FileInputStream fi = new FileInputStream("src/main/java/Campus/Net/input.txt");

        byte input_data[] = new byte[fi.available()];       //.available( ) 메소드 => "읽을수있는 개수만큼" 의미
        fi.read(input_data);


        Socket s = new Socket("192.168.20.33", 15000);

        OutputStream out = s.getOutputStream();
        
        out.write(input_data);

        s.close();





    }
}
