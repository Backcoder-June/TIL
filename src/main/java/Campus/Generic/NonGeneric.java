package Campus.Generic;
//Object 사용하면 여러가지 타입 들어갈 수 있는건 장점
// 하지만 매번 형변환 + instanceof 확인 해줘야하는 불편함

        class Apple{
            String origin;

            public Apple(String origin) {
                this.origin = origin;
            }
        }
        class Paper{
            String size;

            public Paper(String size) {
                this.size = size;
            }
        }
        class Box{
            Object contents;             // Object => Apple + Paper + 모든타입 다 받을 수 있음

            public Object getContents() {
                return contents;
            }

            public void setContents(Object contents) {
                this.contents = contents;
            }

        }


public class NonGeneric {
    public static void main(String[] args) {

        Apple a = null;
        Paper p = null;

        if(args[0].equalsIgnoreCase("apple")){
            a = new Apple(args[1]);
        }
        else if(args[0].equalsIgnoreCase("paper")){
            p = new Paper(args[1]);
        }

        Box b1 = new Box();
        if (a != null){
            b1.setContents(a);
        }else if(p != null){
            b1.setContents(p);
        }
        Object bb = b1.getContents();
        if (bb instanceof Apple){
        System.out.println(((Apple)bb).origin);}
        else if(bb instanceof Paper){
            System.out.println(((Paper)bb).size);
        }





    }
}
