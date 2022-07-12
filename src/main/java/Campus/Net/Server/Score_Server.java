package Campus.Net.Server;

import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Score_Server {
    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(15000);

        Socket s = ss.accept();

        Scanner sc = new Scanner(s.getInputStream());
        FileWriter fw = new FileWriter("src/main/java/Campus/Net/output.txt", true);

        while (sc.hasNextLine()) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            int sum = score1 + score2 + score3;
            String avg = new DecimalFormat("#.##").format(sum/3.0);

            fw.write(name+" "+score1+" "+score2+" "+score3+" "+sum+" "+avg+"\n");
        }


        fw.close();
        s.close();

    }
}
