package Campus.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("src/main/java/Campus/IO/FileInput.java");
            while (true) {
                int result = fi.read();
                System.out.print((char)result);
                if (result == -1) {
                    break;
                }
            }
//        fi.close();          // 위에서 오류발생하면 이 close 가 실행이 안되버린다.
        }catch (IOException e){e.printStackTrace();}
        finally {
            try {
                fi.close();
            } catch (IOException e) {}
        }

    }
}

