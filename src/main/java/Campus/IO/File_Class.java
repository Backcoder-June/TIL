package Campus.IO;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class File_Class {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        String name = scan.next();   //String 으로 파일명을 주는것 ㅋㅋ

        File fi = new File(name);

        if (fi.exists()) {
            System.out.println("200");
            if (fi.isFile()) {
                System.out.println("파일크기 : "+ fi.length() );
                System.out.println("절대경로 : " + fi.getCanonicalPath());
                System.out.println("파일 읽기가능 : " + fi.canRead());
                System.out.println("파일 쓰기가능 : " + fi.canWrite());
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd E, a hh:mm:ss");
                System.out.println("최종 수정시각 : " +df.format( fi.lastModified()));
            }else {
                String[] detail = fi.list();
                for (String d : detail
                     ) {
                    System.out.print("폴더 안에 있는것들 : ");
                    System.out.println(d);}
            }


        }else {
            System.out.println("파일/폴더가 존재하지 않습니다. 하나 생성하겠습니다.");
//            fi.createNewFile();
//            fi.mkdir();
        }


    }
}
