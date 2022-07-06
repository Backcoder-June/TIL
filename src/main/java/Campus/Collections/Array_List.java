package Campus.Collections;

import java.util.ArrayList;

class A{

    int id;
    String name;
    double pay;

    public A(int id, String name, double pay) {
        this.id = id;
        this.name = name;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pay=" + pay +
                '}';
    }
}


public class Array_List {

    public static void main(String[] args) {

        A a1 = new A(22, "june", 400.25);
        A a2 = new A(23, "Tom", 340.5);
        A a3 = new A(24, "lune", 900.000);

        ArrayList list = new ArrayList();

        list.add("java");
        list.add(100);
        list.add(3.14);
        list.add('a');
        list.add(true);
        list.add(a1);
        list.add(a2);
        list.add(a3);


        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }








    }
}
