package Campus.Net.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Login_Server {
    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(12000);
        System.out.println("==서버 시작==");

        HashMap<String, String> users = new HashMap<>();

        users.put("multi", "campus");
        users.put("java", "program");
        users.put("oracle", "db");

        while (true) {
            Socket socket = ss.accept();
            System.out.println("==클라이언트 접속 허용==");

            InputStream input = socket.getInputStream();
            Scanner sc = new Scanner(input);
            //Scanner sc = new Scanner(socket.getInputStream( )); 한방에 가능

//            while (sc.hasNextLine()) {         //반복이 있을땐 반복으로 받고, 두번 세번 입력할땐 ?

                String idpw = sc.nextLine();
            System.out.println("입력값 : " + idpw);

            String[] id_pw = idpw.split(",");
            String id = id_pw[0];
            String pw = id_pw[1];


            Set<String> ids = users.keySet();


//            boolean exists = false;  이거 줘서 아이디 못찾았을때 true 로 주고
// 따로 if 문 만들어서 else 를 처리할 수 있다. //이렇게 해야 반복문에서 매번 sout 되지않고, 따로 한번만 반복문 조건은 받으면서 sout 할 수있는 스킬


            String toClient = "";            //오버라이딩 이용 스킬
            boolean exists = false;
            for (String allid: ids
                 ) {
                if(id.equals(allid)){
                    exists = true;
                    if (pw.equals(users.get(allid))) {
                        toClient = "로그인 성공\n";
                    }else {
                   toClient = "비밀번호를 확인하세요\n";
                    }
                }
            }
             if (exists == false){
                toClient = "존재하지 않는 아이디 입니다\n.";
            }

            OutputStream o = socket.getOutputStream();
             o.write(toClient.getBytes());
             o.close();


            // 입력값으로 종료시키기 추가
                if (id.equals("quit") &&
                pw.equals("quit")){
                    System.out.println("==서버종료==");
                    ss.close();
                }




                    /*if (users.get(id).equals(pw)){
                        o.write("로그인 성공".getBytes());
                    }else {
                        o.write("암호를 확인하세요".getBytes());
                    }
                }else {
                    o.write("존재하지 않는 아이디 입니다.".getBytes());
                }
//            }*/

            socket.close();

        }





    }
}
