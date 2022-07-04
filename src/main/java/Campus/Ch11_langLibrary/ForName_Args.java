package Campus.Ch11_langLibrary;

public class ForName_Args {
    public static void main(String[] args) {

        //어떤 객체를 만들어야 할지, 정해지지 않았을 때, 동적 객체 생성
        try{
            Class C = Class.forName(args[0]);
            Object o = C.newInstance();
            System.out.println(o.getClass().getName());
        }
        catch (Exception e){ e.printStackTrace();
        }

    }
}
