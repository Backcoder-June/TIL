package Campus.IO;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput_Stream {

        public static void main(String[] args) throws IOException {
            FileOutputStream fo = null;
            try {
                fo = new FileOutputStream("src/main/java/Campus/IO/MadeFile.txt", true);
                // 파일 없으면 자동으로 생성해줌
                // 주의! 파일이 있는 파일인 경우, 원래 있던 파일은 없어지고 새로 만들어져버림
                // => 파라미터 두번째로 true false 주는걸로 조종한다.
                // 1. false => 기존파일 삭제 (위험)
                // 2. true => 기존파일 유지. 추가로 write 됨
                fo.write(65);
                fo.write(97);
                fo.write(10);
                fo.write('z');
                fo.write('z');
                fo.write('z');
            } catch (IOException e) {
            }
//        fi.close();          // 위에서 오류발생하면 이 close 가 실행이 안되버린다. => finally
            finally {
                try {
                    fo.close();
                } catch (IOException e) {}
            }

        }
    }



