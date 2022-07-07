package Campus.Generic;

class Banana {
    String origin;
    public Banana(String origin) {
        this.origin = origin;
    }
}
class PPaper {
    String size;

    public PPaper(String size) {
        this.size = size;
    }
}
class BBOX<T> {
    T content;                  // Object 로 두면 다담을순 있지만, 매번 형변환 신경써야함
                                // Generic 으로 줘놓고 나중에 Type 정하자
    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}


public class Generic {
    public static void main(String[] args) {
        Banana b = null;
        PPaper p = null;

        if (args[0].equalsIgnoreCase("banana")) {
            b = new Banana(args[1]);
            BBOX<Banana> b1 = new BBOX();
            b1.setContent(b);
            Banana o = b1.getContent();
            System.out.println(o.origin);
        } else if (args[0].equalsIgnoreCase("paper")) {
            p = new PPaper(args[1]);
            BBOX<PPaper> b2 = new BBOX();
            b2.setContent(p);
            PPaper r = b2.getContent();
            System.out.println(r.size);
        }
    }
}

