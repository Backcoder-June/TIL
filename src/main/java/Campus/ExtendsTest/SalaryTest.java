package Campus.ExtendsTest;

public class SalaryTest {

    public static void main(String[] args) {

                Employee e [] = new Employee[4];
                // 1.상속 2.생성자(타입 순서 갯수....)
                e[0] = new Employee(1000,"이사원",10000,5000);
                e[1] = new Manager(2000,"김간부",20000,10000,10000);
                e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
                e[3] = new Secretary(4000,"최비서",15000,7000,10000);


// 상속만 해두면 => 자동형변환이 되기 때문에,
// new Manager/Engineer/Secretary 같은 자식 클래스들은 부모행세 가능 => 즉 Employee 객체로 행세 가능
        //                                                      => 즉 Employee 객체를 취하는 e 배열에 들어갈 수 있다.
        // 위는 그 과정을 생략하고 바로 그냥 집어넣는 모습
//        Employee em1 = new Manager(2000, "김간부", 20000, 10000, 10000);
//        e[1] = em1;
        // 이렇게 자동형변환을 해준 Employee 객체를 배열에 집어넣는 것이다.

	/* 배열 내의 각 객체의
          급여계산메소드 호출하고
	사번, 이름, 총급여 출력

사번:이름:본봉:총급여
1000:이사원:10000:xxxxx
2000:김간부:20000:xxxxx
3000:박기술:15000:xxxxx
4000:최비서:15000:xxxxx
 */

        System.out.println("사번:이름:본봉:총급여");
        for (int i = 0; i<e.length; i++){
            System.out.println(
                    e[i].id+":"+e[i].name+":"+e[i].salary+":"+e[i].totalMoney());

            if (e[i] instanceof Secretary ){
                System.out.println("비서비 : "+( ( (Secretary) e[i] ). bisu)); }
            // 형변환 먼저하고 (자식역할 복귀) 비수사용
            else if (e[i] instanceof Manager){
                System.out.println("간수비 : "  + ((Manager)e[i]).gansu);
            }else if (e[i] instanceof Engineer){
                System.out.println("기술비 : "+ ((Engineer) e[i]).gisu + ", 자격비 : " +  ((Engineer) e[i]).jasu);
            }

        }




    }
}
