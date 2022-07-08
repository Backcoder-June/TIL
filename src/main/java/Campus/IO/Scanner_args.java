package Campus.IO;

import java.text.DecimalFormat;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    double pay;

    public Employee(int id, String name, double pay) {
        this.id = id;
        this.name = name;
        this.pay = pay;
    }

    @Override
    public String toString() {
        DecimalFormat payment = new DecimalFormat("#,###.00");
        return id + " 사번의 " + name + " 사원은 연봉 " + payment.format(pay*12) + "를 받습니다.";
    }
}
public class Scanner_args {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("사원의 사번 : ");
        int id = scanner.nextInt();
        System.out.print("사원의 이름 : ");
        String name = scanner.next();
        System.out.print("사원의 급여 : ");
        double pay = scanner.nextDouble();

        Employee e1 = new Employee(id, name, pay);

        System.out.println(e1);


    }
}
